// UserServiceTest.java
package com.example.demo.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootTest
public class UserServiceTest {

    @MockBean
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    private User user1, user2;

    @BeforeEach
    public void setUp() {
        user1 = new User(1L, "user1", "user1@example.com");
        user2 = new User(2L, "user2", "user2@example.com");
    }

    @Test
    public void getAllUsersTest() {
        given(userRepository.findAll()).willReturn(Arrays.asList(user1, user2));
        
        List<User> users = userService.getAllUsers();
        
        assertThat(users).hasSize(2);
        assertThat(users.get(0)).isEqualToComparingFieldByField(user1);
        assertThat(users.get(1)).isEqualToComparingFieldByField(user2);
    }

    @Test
    public void getUserByIdTest() {
        given(userRepository.findById(1L)).willReturn(Optional.of(user1));
        
        Optional<User> user = userService.getUserById(1L);
        
        assertThat(user).isPresent();
        assertThat(user.get()).isEqualToComparingFieldByField(user1);
    }

    @Test
    public void createUserTest() {
        User newUser = new User("user3", "user3@example.com");
        given(userRepository.save(newUser)).willReturn(new User(3L, "user3", "user3@example.com"));
        
        User createdUser = userService.createUser(newUser);
        
        assertThat(createdUser).isEqualToComparingFieldByField(new User(3L, "user3", "user3@example.com"));
    }
}

