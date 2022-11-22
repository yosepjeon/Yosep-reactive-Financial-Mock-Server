package com.yosep.mock

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class YosepReactiveMockServerApplication

fun main(args: Array<String>) {
	runApplication<YosepReactiveMockServerApplication>(*args)
}
