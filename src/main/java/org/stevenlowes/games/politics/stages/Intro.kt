package org.stevenlowes.games.politics.stages

import org.stevenlowes.games.politics.constants.State
import org.stevenlowes.games.politics.controls.printCharacters
import org.stevenlowes.games.politics.controls.stages.Option
import org.stevenlowes.games.politics.controls.stages.OptionStage

class Intro : OptionStage("You wake up. Asleep on the beach again. You always sleep here; it’s better than sleeping with everyone else",
        listOf(
                Option("Stand Up", {
                    printCharacters("You work up the energy to move your legs. One, then the other, and slowly you rise to your feet.")
                    printCharacters("You look into the sea on your right. The sun is peeking over the horizon. The waves are slowly flowing onto your feet, the saltwater stings your aching toes. It’d be beautiful, if you weren’t so desensitised to the Island.")
                    printCharacters("You gaze to your left. The corpse of a large insect lies next to where you slept. You used the remainder of your strength to kill it and eat it. It didn’t taste good, if you remember correctly. Wasn’t even worth it. You scumbag.")
                    State.localKnowledge++
                }, ::CharacterCreation),
                Option("Kill Self", {
                    printCharacters("I bet you fucking wish you could. You can't even do that right, you worthless piece of shit")
                    State.depression++
                }, ::CharacterCreation)
        )
)