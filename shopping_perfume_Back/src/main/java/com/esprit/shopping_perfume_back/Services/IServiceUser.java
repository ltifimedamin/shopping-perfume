package com.esprit.shopping_perfume_back.Services;

import com.esprit.shopping_perfume_back.entities.UserEntity;

import java.util.List;

public interface IServiceUser {
    List<UserEntity> retrieveAllUsers();

    UserEntity addUser(UserEntity b);

    UserEntity updateUser(UserEntity b);

    UserEntity retrieveUser(Integer idUser);

    void removeUser(Integer idUser);
}
