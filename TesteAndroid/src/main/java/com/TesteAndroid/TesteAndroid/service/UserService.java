package com.TesteAndroid.TesteAndroid.service;

import com.TesteAndroid.TesteAndroid.dto.UserRequestDTO;
import com.TesteAndroid.TesteAndroid.model.User;
import com.TesteAndroid.TesteAndroid.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User cadastrar(UserRequestDTO DTO) {
        if (userRepository.existsByEmail(DTO.getEmail())) {
            throw new RuntimeException("Email ja cadastrado");
        }
        User user = new User();

        user.setEmail(DTO.getEmail());
        user.setSenha(DTO.getSenha());
        return userRepository.save(user);
    }
}
