package com.example.demo.controller

import net.bytebuddy.utility.RandomString
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.delete
import kotlin.test.Test

@WebMvcTest(ExampleController::class)
@AutoConfigureMockMvc
class ExampleControllerTest @Autowired constructor(
    private val mockMvc: MockMvc
) {

    @Test
    fun `showcase that problem detail doesnt work in test`() {
        val todoId = RandomString.make(5)
        mockMvc.delete("/todo/$todoId").andExpect { status { isNotImplemented() } }
    }
}
