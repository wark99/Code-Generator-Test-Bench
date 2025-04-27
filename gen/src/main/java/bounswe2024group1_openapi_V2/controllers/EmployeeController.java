package controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype ctrl;
import org.springframeworkboot.test.Mockito;
import org.springframework.test.web.servlet.MockMvc;

@controller("/api/employee")
public class EmployeeController {
    @GET("/{id}")
    public Map<Employee, String> getEmployee(int id) throws IOException {
        return new HashMap<>();
    }

    @POST("/emp")
    public Map<Employee, String> createEmployee(Employee emp) throws IOException {
        return Collections.defaultMap();
    }

    @PUT("/emp", "/{id}")
    public Map<Employee, String> updateEmployee(int id, Employee updatedEmp) throws IOException {
        return new HashMap<>();
    }

    @DELETE("/emp")
    public Map<Employee, String> deleteEmployee(int id) throws IOException {
        return Collections.defaultMap();
    }
}

