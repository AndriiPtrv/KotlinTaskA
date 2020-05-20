package com.sourceit

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Введите первое число")
    val firstNumber: Int = scanner.nextLine().toInt()
    println("Введите второе число")
    val secondNumber: Int = scanner.nextLine().toInt()
    println("Введите третье число")
    val thirdNumber: Int = scanner.nextLine().toInt()

    when {
        firstNumber < secondNumber && firstNumber < thirdNumber -> println(secondNumber * secondNumber + thirdNumber * thirdNumber)
        secondNumber < firstNumber -> println(firstNumber * firstNumber + thirdNumber * thirdNumber)
        else -> println(firstNumber * firstNumber + secondNumber * secondNumber)
    }

    println("-------------------------------------------")

    val color: Int = 0x000000
    val colorString = when (color) {
        0x000000 -> "Черный"
        0x0000FF -> "Синий"
        0x00FF00 -> "Зеленый"
        0xFF0000 -> "Красный"
        0xFFFFFF -> "Белый"
        else -> "Такого цвета нет в базе"
    }
    println(colorString)

    println("-------------------------------------------")

    println("Введите год")
    val year: Int = scanner.nextLine().toInt()
    println("Введите месяц")
    val month: Int = scanner.nextLine().toInt()
    println("Введите день")
    val day: Int = scanner.nextLine().toInt()

    if (year % 4 == 0) {
        when (month) {
            1, 3, 5, 7, 8, 10, 12 -> if (day in 1..31) println("Все ок") else println("Такой даты не существует")
            4, 6, 9, 11 -> if (day in 1..30) println("Все ок") else println("Такой даты не существует")
            2 -> if (day in 1..29) println("Все ок") else println("Такой даты не существует")
            else -> println("Такой даты не существует")
        }
    } else {
        when (month) {
            1, 3, 5, 7, 8, 10, 12 -> if (day in 1..31) println("Все ок") else println("Такой даты не существует")
            4, 6, 9, 11 -> if (day in 1..30) println("Все ок") else println("Такой даты не существует")
            2 -> if (day in 1..28) println("Все ок") else println("Такой даты не существует")
            else -> println("Такой даты не существует")
        }
    }
}