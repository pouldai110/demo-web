package com.demo.service.com.demo.service.impl;

import com.demo.dao.TestDemoDAO;
import com.demo.model.TestModel;
import com.demo.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;


@Service(value = "testDemoService")
@Transactional
public class TestDemoServiceImpl implements TestDemoService {
    @Autowired
    private TestDemoDAO testDemoDAO;

    @Override
    public TestModel getUser(Long id) {
        Optional<TestModel> op = testDemoDAO.findById(id);
        if(op.isPresent()) {
            return  op.get();
        }
        return null;
    }
}
