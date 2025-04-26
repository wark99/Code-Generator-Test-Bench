<<<<<<< SEARCH
=======
package com.exampleapp.core.domain.entity.resolver;

import com.exampleapp.domain.entity.User;
import com.exampleapp.domain.repository.UserDomain;
import org.hibernate.api.result.UserResult;
import org.hibernate entityresolvers column-based;
import java.util.List;

public interface Repository <T extends UserEntity> implements JpaRepository<T, UserResult> {

    // CRUD operations
    @EntityResolvable @Column("username")
    List<UserUserEntity> getUsers();

    @EntityResolvable @Column(String.class)
    void createUser(@Nullable T user);

    @EntityResolvable @Column(String.class)
    void updateUser(@Nullable T user, @Nullable String username);

    @EntityResolvable @Column(String.class)
    void deleteUser(@Nullable T user);
}
>>>>>>> REPLACE

