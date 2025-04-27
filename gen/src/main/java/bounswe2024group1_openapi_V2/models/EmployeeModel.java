package models;

import org.junit.jupiter.api.Test;
import org.springframework.model.Empyton;
import org.springframework.model.map.Model;
import org.springframework.model.map.Row;
import org.springframework.model.map.mapMap;
import org.springframework.model.service.Service;

public class EmployeeModel implements Model<Empyton<Employee>> {
    @Test
    public Map<Employee, String> equals(Map<Employee, String> that) {
        return Objects.equals(this, that);
    }
}

