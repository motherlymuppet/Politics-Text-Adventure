package org.stevenlowes.games.politics.controls

import java.util.*
import java.util.concurrent.CountDownLatch
import java.util.concurrent.LinkedBlockingQueue

fun clearScreen() {
    println((1..30).map { "\n" }.joinToString(""))
}

fun printCharacters(text: String) {
    val timer = Timer()
    val queue = LinkedBlockingQueue<Char>(text.toList())

    val latch = CountDownLatch(1)

    timer.scheduleAtFixedRate(PrintTask(queue, timer, latch), 0, Constants.DELAY_BETWEEN_LETTERS)

    val thread = object: Thread(){
        override fun run() {
            while (System.`in`.available() < 1) {
                Thread.sleep(200)
            }
            System.`in`.read()
            latch.countDown()
        }
    }
    thread.start()

    latch.await()

    thread.stop()
    timer.cancel()
    print(queue.joinToString(""))

    println()
}

private class PrintTask(private val queue: Queue<Char>, private val timer: Timer, private val latch: CountDownLatch) : TimerTask() {
    override fun run() {
        val toPrint = queue.poll()
        if (toPrint == null) {
            latch.countDown()
        }
        else{
            print(toPrint)
            System.out.flush()
        }
    }
}

private val random = Random()

fun <T> randomChoice(choices: List<Pair<Number, T>>): T {
    val max = choices.map{it.first.toDouble()}.sum()
    val chosen = random.nextDouble() * max
    var cumSum = 0.0

    return choices.first {(chance, _) ->
        cumSum += chance.toDouble()
        cumSum >= chosen
    }.second
}