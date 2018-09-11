package com.demo.dao;

import com.demo.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TestDemoDAO extends JpaRepository<TestModel, Long> {
    public TestModel findAllByUserNameIsNull();
}
