package com.boot.basic.conf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigDemonApplicationTest {

    @Autowired
    private ProjectSettings settings;
    @Autowired
    private PropertiesController propertiesController;

    @Test
    public void settingsPropertiesTest() {
        System.out.println(settings.toString());
    }

    @Test
    public void getProject() {
        System.out.println(propertiesController.getProject());
    }

    @Test
    public void getAuthor() {
        System.out.println(propertiesController.getAuthor());
    }
}
