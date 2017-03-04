package com.okohub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.Validator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ValidatorproblemApplicationTests {

  @Autowired
  private ApplicationContext applicationContext;

  @Test(expected = NoUniqueBeanDefinitionException.class)
  public void noPrimaryValidator() {
    applicationContext.getBean(Validator.class);
  }
}
