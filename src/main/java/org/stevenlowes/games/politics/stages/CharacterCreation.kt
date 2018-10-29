package org.stevenlowes.games.politics.stages

import org.stevenlowes.games.politics.controls.EndStage
import org.stevenlowes.games.politics.controls.stages.Option
import org.stevenlowes.games.politics.controls.stages.OptionStage

class CharacterCreation : OptionStage("Tell me what you are.",
        listOf(
                Option("I am a poor boy", { println("Hello Poor Boy") }, ::EndStage),
                Option("I am from a poor family", { println("Sorry to hear about that") }, ::EndStage),
                Option("I am hella rich", { println("Good for you") }, ::EndStage)
        )
)