package org.stevenlowes.games.politics.stages

import org.stevenlowes.games.politics.controls.stages.NarrativeStage

class Intro: NarrativeStage("""
    |The year is 1987. The world has gone to shit.
    |Words go here.
    |Lots of words.
    |Lots of words.
    |Lots of words.
    |Lots of words.
    |Lots of words.
    |Lots of words.
    |Lots of words.
    |Lots of Lots of words.
    |Lots of words.
    |Lots of words.
    |I wonder what will happen next.
    """.trimMargin(), ::CharacterCreation)