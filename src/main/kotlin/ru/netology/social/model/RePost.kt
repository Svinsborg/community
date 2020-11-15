package ru.netology.social.model

import java.util.*

class RePost(id: Int,
             autor: String,
             date: Date,
             title: String,
             text: String,
             val repost:Post) :Post(
                                        id,
                                        autor,
                                        date,
                                        title,
                                        text
) {
}