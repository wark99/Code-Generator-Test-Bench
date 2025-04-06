package controllers;

import org.junit.jupiter.apiAction;
import org.junit.jupiter.apiParameterized;
import org.junit.jupiter.api POST;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RegistrationController implements JpaRepository<Map<String, String>> {

    @POST("/register")
    ResponseEntity<Map<String, String>> register(String name, String email) {
        map.put("name", name);
        map.put("email", email);
        
        return ResponseEntity.ok("Register成功").setShortcut(new ActionName("registerSuccess"));
    }
}

