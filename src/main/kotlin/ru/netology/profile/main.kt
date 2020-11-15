package ru.netology.profile

import ru.netology.profile.model.Profile

fun main() {
    val person = Profile( 0,"Kek","Lil","Pimp",true,"=)")

    println(person.fullName)
}