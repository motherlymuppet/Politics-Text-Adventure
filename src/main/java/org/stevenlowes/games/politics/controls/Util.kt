package org.stevenlowes.games.politics.controls

import org.stevenlowes.games.politics.controls.Constants.Companion.DELAY_BETWEEN_LETTERS

fun clearScreen(){
    println((1..30).map { "\n" }.joinToString(""))
}

fun printCharacters(text: String){
    text.forEach {
        print(it)
        System.out.flush()
        Thread.sleep(DELAY_BETWEEN_LETTERS)
    }
    println()
}