package com.fretron.service1

import javax.inject.Inject

class War @Inject constructor(
    private val starks : Starks,
    private val boltons : Boltons
){

    fun prepare(){
        this.starks.prepareForWar()
        this.boltons.prepareForWar()
    }

    fun report(){
        this.starks.reportForWar()
        this.boltons.reportForWar()
    }
}