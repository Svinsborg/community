package ru.netology.social.model

import java.util.*

open class Post(
    val id:Int,
    val autor:String,
    val date: Date,
    var title:String,
    var text:String) {
}