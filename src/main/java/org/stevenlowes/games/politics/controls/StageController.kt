package org.stevenlowes.games.politics.controls

class StageController(val startStage: GameStage){
    fun start(){
        var stage = startStage
        while(stage !is EndStage) {
            stage = stage.run()
        }
    }
}