package com.demo.web;

import com.demo.model.TestModel;
import com.demo.service.TestDemoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Applocation.class})
public class WebApplicationTests {
    @Autowired
    private TestDemoService testDemoService;
    @Test
    public void contextLoads() {
        TestModel testModel = testDemoService.getUser(1l);
        Assert.assertEquals("1", testModel.getId().toString());
    }

}
