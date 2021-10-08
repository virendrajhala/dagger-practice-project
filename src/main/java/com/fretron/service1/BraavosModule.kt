package com.fretron.service1

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class BraavosModule(private val cash:Cash, private val soldier:Soldier) {

    @Provides
    @Named("test")
    fun takeCash111111() : String{

        return "Got the "+cash.javaClass.simpleName
    }

    @Provides
    fun deploySoldier():String{
        return "Got the "+soldier.javaClass.simpleName
    }

}