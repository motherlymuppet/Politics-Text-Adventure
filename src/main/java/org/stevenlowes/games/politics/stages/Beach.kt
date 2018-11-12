package org.stevenlowes.games.politics.stages

import org.stevenlowes.games.politics.constants.State.Companion
import org.stevenlowes.games.politics.controls.EndStage
import org.stevenlowes.games.politics.controls.printCharacters
import org.stevenlowes.games.politics.controls.stages.Option
import org.stevenlowes.games.politics.controls.stages.OptionStage

class Beach: OptionStage(getQuestionText(),
        listOf(
                Option("Yes.", {
                    printCharacters("Now you are hungry and tired. I hope you are proud of yourself. You starve to death")
                    org.stevenlowes.games.politics.constants.State.food -= 10
                    org.stevenlowes.games.politics.constants.State.energy -= 10
                }, ::EndStage),
                Option("Swim in Ocean", {
                    printCharacters("You drown in the ocean")
                }, ::EndStage),
                Option("Walk towards Hut", {
                    printCharacters("The hut explodes and you die")
                }, ::EndStage),
                Option("Walk into the Forest", {
                    printCharacters("An alligator eats you")
                }, ::EndStage)
        ))

fun getQuestionText(): String {
    return "Are you going to stand here all day?"
}
