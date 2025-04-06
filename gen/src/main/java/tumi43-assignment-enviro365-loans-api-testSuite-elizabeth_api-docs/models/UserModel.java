package models;
import org.electronic commerce.dto.UserDto;

public class UserModel implements JpaRepository<UserDto> {

    @Column(key = "username", primary = true, unique = true)
    public UserDto username;

    @Column(key = "email", primary = true, unique = true)
    public UserDto email;

    // Other fields and methods as needed
}

