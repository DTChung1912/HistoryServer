package com.example.model

data class MyVideoRespone(
    val myVideoStatusList: List<MyVideoStatus>,
    val videoList: List<Video>,
    val type: String,
    val size: Int
)
