package dev.vio.service;

import dev.vio.entity.PasswordEntity;

import java.util.List;

public interface PasswordService {

    List<PasswordEntity> findAll();

    PasswordEntity findById(int theId);

    PasswordEntity save(PasswordEntity thePasswordEntity);

    void deleteById(int theId);

}
