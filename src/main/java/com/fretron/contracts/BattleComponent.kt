package com.fretron.contracts

import com.fretron.service1.*
import dagger.Component

@Component (modules = [BraavosModule::class])
interface BattleComponent {
    fun cash() : Cash

    fun getWar() : War

//    fun getStarks():Starks
//
//    fun getBoltons():Boltons

    fun getCash():Cash

    fun getSoldier():Soldier


}