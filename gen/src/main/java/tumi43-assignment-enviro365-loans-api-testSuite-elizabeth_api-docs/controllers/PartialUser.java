package controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvc;
import org.springframework.boot.test.Mockito;
import org.springframework.ioAnnotations.JPA;
import org.springframework.ioAnnotations annotations;
import org.springframework.ioAnnotations.MAP;
import org.springframework.ioAnnotations.WEB;
import org.springframework.sql.DialectPostgreSQL;
import org.springframework.sql Jack;

import static org.springframework.boot.test.Mockito.Mockito;

@SpringBootTest @WebAction({
    @ annotated("GET", path="/profile/{id}", method = "update")
    public final void doUpdate(@Partial User user) throws Exception {
        saveToDb(user);
    }
})

@Transactional
@Entity("updateable", true)
public class PartialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    public String name;

    @Column(nullable = false)
    public String email;
}

public class UserProfileUpdateController extends JpaRepository<PartialUser> implements Serializable {

    @controller("update")
    @ProfileService
    public final User updateUser(@Partial User user) {
        return PartialUser.MAP(user).saveToDb();
    }
}

