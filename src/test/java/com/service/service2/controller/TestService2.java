package com.service.service2.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestService2 {

        Service2Delegate service2Delegate = new Service2Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = service2Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}