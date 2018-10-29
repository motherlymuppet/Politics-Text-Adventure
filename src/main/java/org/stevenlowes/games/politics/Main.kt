package org.stevenlowes.games.politics

import org.stevenlowes.games.politics.controls.StageController
import org.stevenlowes.games.politics.stages.Intro

fun main(args: Array<String>){
    System.out.writer()
    StageController(Intro()).start()
}