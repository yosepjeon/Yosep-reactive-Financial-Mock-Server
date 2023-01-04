package com.yosep.mock

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
class YosepReactiveMockServerApplicationTests {

	@Value("\${spring.datasource.username}")
	val userName = ""

	@Test
	fun contextLoads() {
		Assertions.assertEquals("root", userName)
	}

}
