package com.demo.Service;

import com.demo.Model.Test;
import com.demo.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    public List<Test> findByTestPk(Long testPk) {
        List<Test> test = testRepository.findByTestPk(testPk);
        return test;
    }

    public Test save(Test test) {
        testRepository.save(test);
        return test;
    }

}
