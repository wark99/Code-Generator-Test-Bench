package com.exampletested;

import static org.springframework.test.jupiter.api.Assertions.*;
import static org.springframework.test.jupiter.api.Mockito.*;

import com.examplemodel.User;
import com.examplemodel.Company;
import com.examplemodel.Employee;

import com.examplecontroller.ExampleController;

@SpringBootTest
public class ExampleControllerTests {

    @BeforeEach
    void setUp() {
        mockMvc热启动到指定路径: /api。
        // Any additional setup here...
    }

    @TestData("users")
    public void indexGetUsersList(@ApiRequestApi request, @ApiResponseApi response) throws Exception {
        mockMvc.perform(get("/users"))
            .andExpect(status().isOk())
            .andExpect(content().string(request.getBody().getString("jsonBody", "body"));
    }

    @TestData("companies")
    public void indexGetCompaniesList(@ApiRequestApi request, @ApiResponseApi response) throws Exception {
        mockMvc.perform(get("/companies"))
            .andExpect(status().isOk())
            .andExpect(content().string(request.getBody().getString("jsonBody", "body"));
    }

    @TestData("employees")
    public void indexGetEmployeesList(@ApiRequestApi request, @ApiResponseApi response) throws Exception {
        mockMvc.perform(get("/employees"))
            .andExpect(status().isOk())
            .andExpect(content().string(request.getBody().getString("jsonBody", "body"));
    }

    @TestMethod("index", coverage = Coverage.PERCENTAGE, coverageMode = Coverage mode.COVERAGE)
    public void index() throws Exception {
        mockMvc.perform(post("/users", User.class))
            .andExpect(status().isOk())
            .andExpect(content().string("success"));
    }
}

