package org.stevenlowes.games.politics.controls.stages

import org.stevenlowes.games.politics.controls.GameStage
import org.stevenlowes.games.politics.controls.Constants.Companion.DELAY_BETWEEN_LETTERS
import org.stevenlowes.games.politics.controls.clearScreen
import org.stevenlowes.games.politics.controls.printCharacters

open class TextStage(val text: String, val getNextStage: (String) -> GameStage) : GameStage {
    override fun run(): GameStage {
        clearScreen()
        printCharacters(text)
        Thread.sleep(500)

        println()
        println("Enter your Answer:")

        while (true) {
            val inputText = readLine()
            if (inputText.isNullOrBlank()) {
                println("Please enter some text")
            }
            else{
                return getNextStage(inputText!!)
            }
        }
    }
}