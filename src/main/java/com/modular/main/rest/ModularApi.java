package com.modular.main.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.Stream;

@RestController
public class ModularApi {

    @Autowired
    private ConfigurableApplicationContext ctx;

    @RequestMapping(path = "/beansNames", method = RequestMethod.GET)
    public Stream<String> getBeans(){
        return Arrays.stream(ctx.getBeanDefinitionNames());
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String greeting(){
        return "{\"output\":\"Hey There I'm Alive\"}";
    }


}
