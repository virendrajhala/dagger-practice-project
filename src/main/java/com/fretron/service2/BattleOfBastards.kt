package com.fretron.service2

import com.fretron.contracts.DaggerBattleComponent


class BattleOfBastards {


}

fun main(){

    val comp = DaggerBattleComponent.create()
    val war = comp.getWar()
    war.prepare()
    war.report()

}