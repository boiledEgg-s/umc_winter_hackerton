package com.softsquared.template.kotlin.src.main.home

data class item(
    val image: Int, // 사진
    val title: String, //제목
    val loction: String, //위치
    val time: String, //시간
    val price: Int, //가격
    val chatNum: Int, //채팅 개수
    val heartNum: Int //하트 개수
)