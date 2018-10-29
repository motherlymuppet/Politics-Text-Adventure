package org.stevenlowes.games.politics.controls.stages

import org.stevenlowes.games.politics.controls.GameStage
import org.stevenlowes.games.politics.controls.Constants.Companion.DELAY_BETWEEN_LETTERS
import org.stevenlowes.games.politics.controls.clearScreen
import org.stevenlowes.games.politics.controls.printCharacters

open class OptionStage(val text: String, val options: List<Option>) : GameStage {
    override fun run(): GameStage {
        clearScreen()
        printCharacters(text)
        Thread.sleep(500)

        println()
        println("Select:")
        options.mapIndexed { index, option -> "$index: $option" }
                .forEach {
                    printCharacters(it)
                }

        while (true) {
            val choice = readLine()?.toIntOrNull()
            if (choice == null) {
                println("Please enter one of the numbers shown")
            }
            else{
                val option = options[choice]
                option.onChoose()
                return option.getNextStage()
            }
        }
    }
}

data class Option(val text: String, val onChoose: () -> Unit, val getNextStage: () -> GameStage) {
    override fun toString() = text
}