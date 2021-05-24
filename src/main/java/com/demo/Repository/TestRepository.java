package com.demo.Repository;

import com.demo.Model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {
    public List<Test> findByTestPk(Long testPk);
}