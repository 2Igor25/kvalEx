package com.server.kval.service;

import com.server.kval.domain.UserRole;
import com.server.kval.domain.Users;
import com.server.kval.repositories.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public Users registrationUser(String email, String password, UserRole userRole) {
        Users user = new Users();
        user.setEmail(email);
        user.setPassword(password);
        user.setUserRole(userRole);

        return usersRepository.save(user);
    }

}
