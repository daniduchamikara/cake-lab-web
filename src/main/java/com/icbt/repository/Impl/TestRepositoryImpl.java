package com.icbt.repository.Impl;

import com.icbt.repository.TestRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class TestRepositoryImpl implements TestRepository {
    @Override
    public ResponseEntity testController() {
        ResponseEntity responseEntity = responseEntity = new ResponseEntity("Test", HttpStatus.OK);
        return responseEntity;

    }
}
