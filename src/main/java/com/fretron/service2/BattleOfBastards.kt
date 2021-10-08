package com.fretron.service2

import com.fretron.contracts.DaggerBattleComponent
import com.fretron.service1.BraavosModule
import com.fretron.service1.Cash
import com.fretron.service1.Soldier


class BattleOfBastards {


}

fun main(){
    val cash = Cash("Verru")
    val soldier = Soldier()
    val component = DaggerBattleComponent.builder().braavosModule(BraavosModule(cash,soldier)).build()
    val war = component.getWar()
    war.prepare()
    war.report()
    val gotCash = component.getCash()
    val gotSoldier = component.getSoldier()

}