package com.fretron.service1

import javax.inject.Inject
import javax.inject.Named

class Cash @Inject constructor(
    @Named("test") private val name : String
) {

    fun test(){
        println(name)
    }

}