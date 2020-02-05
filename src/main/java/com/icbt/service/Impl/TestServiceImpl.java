package com.icbt.service.Impl;

import com.icbt.repository.TestRepository;
import com.icbt.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    TestRepository testRepository;

    @Override
    public ResponseEntity testController() {
        return testRepository.testController();
    }
}
