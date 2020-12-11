package myproject

import com.yngvark.robothelper.RobotHelper
import java.awt.Robot
import java.awt.event.KeyEvent
import java.io.File

val robot = RobotHelper(Robot())
class ClassUsedJustToGetExecutableFilename {}
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        val name = File(
            ClassUsedJustToGetExecutableFilename::class.java.getProtectionDomain()
                .codeSource.location.path
        ).name
        println("USAGE: $name <AWS account ID>")
        return
    }

    for (arg in args) {
        println("Arg: $arg")
    }

    val accountId = args[args.size - 1]
    println("Logging in to AWS account: $accountId")

//    hello()
    login(accountId)
}

private fun login(accountId: String) {
    robot
        .pressAndRelease(KeyEvent.VK_CONTROL, KeyEvent.VK_F)
        .type(accountId)
        .pressAndRelease(KeyEvent.VK_ENTER)
        .pressAndRelease(KeyEvent.VK_ESCAPE)
        .pressAndRelease(KeyEvent.VK_TAB)
        .pressAndRelease(KeyEvent.VK_SPACE)
        .pressAndRelease(KeyEvent.VK_TAB)
        .pressAndRelease(
            KeyEvent.VK_ENTER
        )
}

private fun hello() {
    robot.sleep(200)
        .type("HELLO2")
}
