package com.example tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.easyui Arrange.*;

public class UserControllerTest {

    @BeforeEach
    public void setUp() {
        arrange("controller", UserController::class);
        EasyUI.test.clearAll();
    }

    @Test
    public void testListCreateUsersWithEmptyArray() {
        ArrangeResource<Map<User, String>> noCreate = Arranger.to(RemoteResource.class)
            .whenGiven("/api/users/batch")
            .thenProduces(new HashMap<>());
        listCreateUsers = noCreate;
        
        when(this.listCreateUsers.isMapping("/api/users/batch", "Create users in batch"))
                .thenReturn(noCreate);

        User user = new User();
        user.setId("test");
        user.setUsername("testuser");

        when(this.listCreateUsers.isMapping("/api/users/batch", "Create users in batch"))
                .andExpects(anyCallWhereArguments=["[\"test\"]"])
                .andExpect(anyResultWithSize(1));

        verifyThat(this.listCreateUsers, "List create users",
            When.given("[" + Arrays.toString(new String[] { "test" }) + "]")
            .When.mapTo("/api/users/batch").thenReturn(noCreate)
            .thenReturn(noCreate));
    }
}

