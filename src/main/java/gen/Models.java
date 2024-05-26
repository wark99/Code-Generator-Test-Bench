package gen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Salon {
    private String id;
    private String city;
    private String year;
    private String semester;
}

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {
    private String id;
    private Company company;
    private CE ce;
    private Visitor visitor;
    private String comment;
    private List<String> tags;
    private String from;
    private Long timestamp;
}

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Company {
    private String name;
    private Address address;
    private String workforce;
    private String type;
    private String phone;
}

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    private String street;
    private String extra;
    private String zipcode;
    private String city;
}

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CE {
    private String phone;
    private String email;
}

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Visitor {
    private String firstname;
    private String lastname;
    private String jobTitle;
    private String phone;
    private String email;
}

