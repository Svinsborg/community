package ru.netology.hiearchy

import ru.netology.hiearchy.view.TextView
import ru.netology.hiearchy.view.ViewGroup
import ru.netology.hiearchy.widget.Button

fun main() {
    val txt = TextView("Some Text")
    txt.click() // вызывается метод из `View`
    println(txt.text) // Some Text
    txt.text = "Something bad happened"
    println(txt.text) // Something bad happened

    val button = Button("Click me")
    button.click() // вызывается метод из `View`
    println(button.text) // Click me
    button.text = "Don't click me"
    println(button.text) // Don't click me

    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)
}