package com.example

import io.ktor.server.engine.*
import io.ktor.server.tomcat.*
import com.example.plugins.*

private val HOME_HOST = "192.168.1.7"
private val T3_HOST = "192.168.123.106"
private val PIRAGO_GORAKU_HOST = "172.17.0.65"

fun main() {
    embeddedServer(Tomcat, port = 8080, host = T3_HOST) {
        configureSerialization()
        configureRouting()
    }.start(wait = true)
}
