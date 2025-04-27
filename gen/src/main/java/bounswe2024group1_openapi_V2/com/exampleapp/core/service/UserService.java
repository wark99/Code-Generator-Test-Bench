<<<<<<< SEARCH
=======
package com.exampleapp.core.service;

import com.exampleapp.domain.entity.resolver.Repository;
import com.exampleapp.domain.user.UserDomain;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    Repository<User> repository;

    public UserService(Repository<User> repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    @Request(qryParams = true)
    public List<User> getUsers() throws HttpException {
        return repository.<User>gson();
    }

    @PostMapping()
    public User createUser(@RequestBody User user) throws HttpException {
        repository.createUser(user);
        return user;
    }

    @PutMapping()
    public User updateUser(@RequestBody User user, @PathVariable String username) throws HttpException {
        repository.updateUser(user, username);
        return user;
    }

    @DeleteMapping()
    public void deleteUser(@RequestBody User user) throws HttpException {
        repository.deleteUser(user);
    }
}
>>>>>>> REPLACE

