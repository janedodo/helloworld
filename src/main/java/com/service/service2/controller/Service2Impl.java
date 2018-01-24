package com.service.service2.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-24T04:08:23.865Z")

@RestSchema(schemaId = "service2")
@RequestMapping(path = "/service-2", produces = MediaType.APPLICATION_JSON)
public class Service2Impl {

    @Autowired
    private Service2Delegate userService2Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userService2Delegate.helloworld(name);
    }

}
