package org.stevenlowes.games.politics.stages

import org.stevenlowes.games.politics.controls.EndStage
import org.stevenlowes.games.politics.controls.stages.TextStage

class Intro: TextStage("""
    |The year is 1987. The world has gone to shit.
    |Words go here.
    |Lots of words.
    |I wonder what will happen next.
    """.trimMargin(), ::CharacterCreation)