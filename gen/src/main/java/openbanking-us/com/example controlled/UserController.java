package com.example controlled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org用了数据Spring Data JPA;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserController {

    private @Data User user;
    private @Json @Transactional void updateUser(@Put Map<String, Object> parameters) throws IOException {
        user.setName(parameters.get("name"));
        user.setEmail(parameters.get("email"));
        if (parameters.containsKey("isActive")) {
            user.setActive(parameters.get("isActive"));
        }
    }

    @Controller
    public @RequestMapping("/users/{id}")
    protected Resource createUser(@Data User user) throws IOException {

        try {
            // save the new user to database and return JSON response with id
            user.save();
            return new Response body with user data as JSON;
        } catch (IOException e) {
            throw new HttpResponseException(e);
        }
    }

    @Controller
    public @RequestMapping("/users")
    protected Resource getUser(@Json List<User> users) {
        // implement reading all users from database
        return new Response body with list of users as JSON;
    }

    @Controller
@PreCondition("/users", "There should be at least one user in the system");
public @RequestMapping "/users" 
protected Resource deleteUser(@Remove User user) {
    try {
        user.remove();
        return new Response body with HTTP status code 204 No Content;
    } catch (IOException e) {
        throw new HttpResponseException(e);
    }
}

@Controller
@PreCondition("/users", "There should be at least one user in the system");
public @RequestMapping "/users" 
protected Resource updateUser(@Put User user) {
    try {
        // update existing user with given parameters and return JSON response
        user.save();
        return new Response body with updated user data as JSON;
    } catch (IOException e) {
        throw new HttpResponseException(e);
    }
}

@Controller
@PreCondition("/users", "There should be at least one user in the system");
public @RequestMapping "/users" 
protected Resource deleteUser(@Delete User user) {
    try {
        // delete existing user from database and return JSON response
        user.remove();
        return new Response body with HTTP status code 204 No Content;
    } catch (IOException e) {
        throw new HttpResponseException(e);
    }
}

