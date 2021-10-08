package com.fretron.contracts

import com.fretron.service1.*
import dagger.Component

@Component
interface BattleComponent {

    fun getWar() : War

    fun getStarks():Starks

    fun getBoltons():Boltons


}