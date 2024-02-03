package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.UserEntity;
import com.esprit.shopping_perfume_back.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@NoArgsConstructor
public class ServiceUser implements IServiceUser{
    UserRepository userRepository;
    @Override
    public List<UserEntity> retrieveAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity addUser(UserEntity b) {
        return userRepository.save(b);
    }

    @Override
    public UserEntity updateUser(UserEntity b) {
        return userRepository.save(b);
    }

    @Override
    public UserEntity retrieveUser(Integer idUser) {
        return userRepository.findById(idUser).get();
    }

    @Override
    public void removeUser(Integer idUser) {
        userRepository.deleteById(idUser);
    }
}
