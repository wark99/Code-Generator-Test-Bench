<<<<<<< SEARCH
=======
package com.exampleapp.core.domain;

import java.util.List;
import java.util.Map;

public interface UserDomain<T extends UserEntity> {
    // Business rules for user operations
    List<User<T>> getUsers();
    void createUser(@Nullable T user);
    void updateUser(@Nullable T user, @Nullable @NotNull String username);
    void deleteUser(@Nullable T user);

    @Transactional
    void createUser(@Nullable User<T> user) throws IOException;
    
    @Transactional
    void updateUser(@Nullable User<T> user, @Nullable String username) throws IOException;
    
    @Transactional
    void deleteUser(@Nullable User<T> user);
}
>>>>>>> REPLACE

