package com.benediht.serviceuser.controllers.impl;

import com.benediht.serviceuser.controllers.FindUserByIdController;
import com.benediht.serviceuser.models.entities.UserEntity;
import com.benediht.serviceuser.services.user.impl.FindUserByIdServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class FindUserByIdControllerImpl implements FindUserByIdController {

    private final FindUserByIdServiceImpl service;

    @Override
    public ResponseEntity<UserEntity> findUserById(Long id) {
        UserEntity user = service.findUserById(id);
        return ResponseEntity.ok().body(user);
    }
}