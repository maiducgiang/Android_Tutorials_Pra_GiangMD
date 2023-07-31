package com.example.sun_project_10_7.coroutine

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.coroutines.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
val formatter = DateTimeFormatter.ISO_LOCAL_TIME
@RequiresApi(Build.VERSION_CODES.O)
val time = { formatter.format(LocalDateTime.now()) }

class CoroutineFun {

    suspend fun getValue(): Double {
        println("entering getValue() at ${time()}")
        delay(3000)
        println("leaving getValue() at ${time()}")
        return Math.random()
    }
    fun demo(){
        repeat(3) {
            GlobalScope.launch {
                println("Hi from ${Thread.currentThread()}")
            }
        }
        runBlocking {
            val num1 = async{getValue()}
            val num2 = async{getValue()}
            println("result of num1 + num2 is ${num1.await() + num2.await()}")
        }
    }
}