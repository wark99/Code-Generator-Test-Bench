package com.example.myspringapp.repository;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.myspringapp.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveAndFindUser() {
        User user = new User("Jane Doe", "jane@example.com");
        userRepository.save(user);

        Optional<User> retrievedUser = userRepository.findById(user.getId());
        assertThat(retrievedUser.isPresent()).isTrue();
        assertThat(retrievedUser.get().getName()).isEqualTo("Jane Doe");
    }
}

