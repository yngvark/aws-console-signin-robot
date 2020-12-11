package com.yngvark.pc_init

import myproject.robot
import org.junit.jupiter.api.Test
import java.awt.event.KeyEvent

internal class TestVariousStuff {
    @Test
    fun testPressAndRelease() {
        robot.pressAndRelease(KeyEvent.VK_SHIFT, KeyEvent.VK_COLON)
    }
}