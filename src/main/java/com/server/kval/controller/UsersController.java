package com.server.kval.controller;

import com.server.kval.domain.Users;
import com.server.kval.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UsersController {

    private final UsersService usersService;

//    @PostMapping("api/user/registration")
//    public Users registrationUser() {
//        return usersService.registrationUser()
//    }
}
