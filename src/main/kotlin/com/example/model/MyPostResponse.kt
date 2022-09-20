package com.example.model

class MyPostResponse(
    val myPostStaTusList: List<MyPostStatus>,
    val postList: List<Post>,
    val type: String,
    val size: Int
)
