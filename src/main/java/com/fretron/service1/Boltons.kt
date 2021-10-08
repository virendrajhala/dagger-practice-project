package com.fretron.service1

import com.fretron.contracts.House
import javax.inject.Inject

class Boltons @Inject constructor() : House {

    override fun prepareForWar(){
        println(this.javaClass.simpleName+ " prepared for war")
    }


    override fun reportForWar(){
        println(this.javaClass.simpleName+ " reporting for war")
    }
}