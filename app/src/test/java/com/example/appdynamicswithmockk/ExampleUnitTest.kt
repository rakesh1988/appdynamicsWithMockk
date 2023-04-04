package com.example.appdynamicswithmockk

import com.appdynamics.eumagent.runtime.Instrumentation
import io.mockk.every
import io.mockk.junit5.MockKExtension
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@ExtendWith(value = [MockKExtension::class])
internal class AppDynamicsAnalyticsTest {

    @BeforeEach
    fun setup() {
        mockkStatic(Instrumentation::class)
    }

    @AfterEach
    fun tearDown() {
        unmockkStatic(Instrumentation::class)
    }

    @Test
    fun `test`() {
        every { Instrumentation.start(any()) } returns Unit

    }


}
