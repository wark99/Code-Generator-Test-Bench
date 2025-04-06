package com.example controlled;

import orgAnnotations.entity.*;
import orgAnnotations.map.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PersonEntity extends EntityManager {
    @Entity
    public Person person = entity("Person");
    @List(Entity)
    public List<Address> addressList = list("addressList");

    @PrePersist
    public void name(String name) { this.person.setName(name); }
    
    @PrePersist
    public void email(String email) { this.person.setEmail(email); }

    @GetMapping("person")
    public Person findPerson(int id) {
        return person.findById(id);
    }

    @PostMapping("person")
    public void createPerson(@RequestBody Person request) {
        person.save();
    }

    @PutMap("person")
    public void updatePerson(@RequestParam Map<String, String> parameters,
                            @/responseMapping Map<String, String> response) {
        person.setName(parameters.get("name"));
        this.updatePerson(parameters, response);
    }

    @DeleteMap("person")
    public void deletePerson(int id) { person.findById(id).delete(); }
}

class PersonController extends RESTController<PersonEntity> {

    @Create
    @PostMapping
    protected @RestResponse ResponseEntity create(@Body request) {
        // Mock database interaction here with EasyMock
    }

    @Read
    @GetMapping(horizontal = "person") 
    protected ResponseEntity get(@Query parameter = "id") {
        return httpGet(mapRequest("person", id));
    }

    @Update
    @PostMapping(horizontal = "person")
    protected ResponseEntity update(@Body request) {
        // Mock database interaction here with EasyMock
    }

    @Delete
    @DeleteMap(horizontal = "person")
    protected ResponseEntity delete() {
        // Mock database interaction here with EasyMock
    }
}

@ModifyEntity("person")
public class PersonControllerWithEasyMock {
    @Inject(JPA.INJECT, Config.class.class)
    private JPA jpa;

    @PrePersist
    public void setup(INjector in) { in.Inject(EasyMockJPA.class); }

    @GetMapping("person")
    protected ResponseEntity get(@Query id);
}

