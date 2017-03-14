package com.mosesmansaray.springboot.inegration.cucumber;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.net.URL;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@ContextConfiguration(classes = Application.class, loader = SpringApplicationContextLoader.class)
@WebIntegrationTest
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloControllerIT {

    private URL base;

    @Autowired
    private RestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL(AcceptanceTestConstants.BASE_URI + "/");
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertThat(response.getBody(), equalTo("Hello World... Testing 123!"));
    }
}
