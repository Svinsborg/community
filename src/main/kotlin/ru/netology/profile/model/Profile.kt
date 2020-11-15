package ru.netology.profile.model

class Profile(
    val id: Int,
    val login: String,
    private val firstName: String,
    private val lastName: String,
    var status: Boolean,
    var avatar: String
) {
    val fullName: String
    get() = this.firstName + " " + this.lastName
}