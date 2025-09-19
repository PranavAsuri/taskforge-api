package com.pranav.taskforge.user;

import com.pranav.taskforge.common.ConflictException;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) { this.repo = repo; }

    public List<User> list() { return repo.findAll(); }

    public User create(UserDto dto) {
        var email = dto.email().trim().toLowerCase();
        var role  = dto.role().trim();

        if (repo.existsByEmail(email)) {
            throw new ConflictException("Email already in use: " + email);
        }

        var u = new User();
        u.setEmail(email);
        u.setRole(role);
        return repo.save(u);
    }
}