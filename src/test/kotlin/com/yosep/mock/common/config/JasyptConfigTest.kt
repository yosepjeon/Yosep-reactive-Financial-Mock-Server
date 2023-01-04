package com.yosep.mock.common.config

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.junit.jupiter.MockitoSettings
import org.mockito.quality.Strictness
import org.springframework.test.util.ReflectionTestUtils

@ExtendWith(MockitoExtension::class)
@MockitoSettings(strictness = Strictness.WARN)
class JasyptConfigTest {

    private val jasyptConfig = JasyptConfig()

    @Test
    fun decryptJasypt_keyIsExist_Success() {
        val userName = "swcGrnti91sJAT6lUkQkTQ=="
        val password = "8YiVmanj6TNRubuM6O5R3g=="
        ReflectionTestUtils.setField(jasyptConfig, "jasyptSecretKey", "jasyptStringEncryptor")
        val stringEncryptor = jasyptConfig.stringEncryptor()

        val decryptedUserName = stringEncryptor?.decrypt(userName)
        val decryptedPassword = stringEncryptor?.decrypt(password)

        Assertions.assertEquals("root", decryptedUserName)
        Assertions.assertEquals("dytpq13", decryptedPassword)
    }
}