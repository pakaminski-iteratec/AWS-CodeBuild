package com.aws.test.awstest.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

@ExtendWith(MockitoExtension.class)
class TestServiceTest {

    TestService testService = new TestService();

    @Test
    public void shouldReturnString(){
        //given
        int length = 10;

        //when
        String result = testService.returnSomeRandomString(length);

        //then
        Assertions.assertEquals(length, result.length());
    }

}
