package com.example.demo.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    @Test
    public void testGetName() {
        User user = new User();
        user.setName("John Doe");
        assertThat(user.getName()).isEqualTo("John Doe");
    }
}

