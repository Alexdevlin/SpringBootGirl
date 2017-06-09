package com.dyl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by duyunlei on 17/3/30.
 */

@RestController
public class GirlController {

    @GetMapping(value="/say")
    public String say(){

        return "hello";

    }


}
