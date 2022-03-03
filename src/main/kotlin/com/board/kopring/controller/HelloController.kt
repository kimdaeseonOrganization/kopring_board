package com.board.kopring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping
    fun hello() : JsonResult {
        return JsonResult("hello")
    }
}

data class JsonResult (val content: String)
