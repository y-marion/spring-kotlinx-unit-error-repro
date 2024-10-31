package com.example.demo.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ProblemDetail
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
@RequestMapping("/")
class ExampleController {
    @RequestMapping(
        value = ["/todo/{todoId}"],
        produces = ["application/problem+json"],
        method = [RequestMethod.DELETE]
    )
    fun deleteTodo(@PathVariable(value = "todoId", required = true) todoId: String): ResponseEntity<Unit> {
        return ResponseEntity.of(
            ProblemDetail.forStatus(HttpStatus.NOT_IMPLEMENTED).apply {
                title = "Not yet implemented"
                detail = "Only for showcase"
            }
        ).build()
    }
}
