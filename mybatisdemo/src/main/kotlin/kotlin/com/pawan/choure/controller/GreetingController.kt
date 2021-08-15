package com.pawan.choure.controller


import com.pawan.choure.mapper.CityMapper
import com.pawan.choure.model.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class GreetingController {

    @Autowired
    private val cityMapper: CityMapper? = null

    val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
        Greeting(counter.incrementAndGet(), "Hello, $name")

    @GetMapping("/city")
    fun city(@RequestParam(value = "name", defaultValue = "Maharashtra") name: String) =
        this.cityMapper?.findByState("Maharashtra")
}