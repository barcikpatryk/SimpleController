package com.example.SimpleControllerKotlin

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @RequestMapping("")
    fun info():String{
        return "info 12345"
    }
    @RequestMapping("/next")
    fun nextFun():Double{
        return 2.0
    }
    @RequestMapping("linearFunction")
    //y = a*x + b
    fun linearFunction(@RequestParam("x") x:Double):Double{
        return 5*x
    }
}
