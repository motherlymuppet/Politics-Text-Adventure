package org.stevenlowes.games.politics.controls.stages

import org.stevenlowes.games.politics.controls.GameStage
import org.stevenlowes.games.politics.controls.clearScreen
import org.stevenlowes.games.politics.controls.printCharacters
import java.math.BigDecimal

open class NumberStage(val text: String, val answerChecker: (BigDecimal) -> Boolean = {true}, val getNextStage: (BigDecimal) -> GameStage) : GameStage {
    override fun run(): GameStage {
        clearScreen()
        printCharacters(text)
        Thread.sleep(500)

        println()
        println("Enter a number:")

        while (true) {
            val inputText = readLine()
            if (inputText == null) {
                println("Please enter a number")
            }
            else{
                val bd = inputText.toBigDecimal()
                if (answerChecker(bd)) {
                    return getNextStage(bd)
                } else {
                    println("Invalid Number")
                }
            }
        }
    }
}