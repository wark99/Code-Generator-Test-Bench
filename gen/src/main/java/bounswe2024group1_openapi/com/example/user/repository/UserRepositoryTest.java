// src/test/java/com/example/user/repository/UserRepositoryTest.java

package com.example.user.repository;

import com.example.user.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@AutoConfigureJdbc
public class UserRepositoryTest {

  @Autowired
  private UserRepository userRepository;
  
  @Test
  public void testFindAll() {
    Iterable<User> users = userRepository.findAll();
    // Test code to verify that the findAll method returns an iterable of User objects.
  }
}

