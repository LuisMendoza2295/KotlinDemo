package com.example.demo.controller

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import java.net.InetAddress

@Controller("/hello")
class HelloController {

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun hello(): String {
        return "Hello from ${InetAddress.getLocalHost().hostName}@${InetAddress.getLocalHost().hostAddress}"
    }
}