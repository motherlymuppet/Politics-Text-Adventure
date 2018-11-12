package org.stevenlowes.games.politics.stages

import org.stevenlowes.games.politics.controls.EndStage
import org.stevenlowes.games.politics.controls.printCharacters
import org.stevenlowes.games.politics.controls.stages.Option
import org.stevenlowes.games.politics.controls.stages.OptionStage
import org.stevenlowes.games.politics.controls.stages.TextStage

class CharacterCreation : TextStage("Tell me your name. Can you at least handle that?", {
    org.stevenlowes.games.politics.constants.State.name = it
    printCharacters("Huh. So you are capable of something.")
    Beach()
})