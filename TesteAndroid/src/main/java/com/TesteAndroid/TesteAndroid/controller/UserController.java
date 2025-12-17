package com.TesteAndroid.TesteAndroid.controller;

import com.TesteAndroid.TesteAndroid.dto.UserRequestDTO;
import com.TesteAndroid.TesteAndroid.model.User;
import com.TesteAndroid.TesteAndroid.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/cadastrar")
    public ResponseEntity<User> cadastrar(@Valid @RequestBody UserRequestDTO dto) {
        User user = service.cadastrar(dto);

        return ResponseEntity.ok(user);


    }
}
