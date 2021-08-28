package coffee_machine_console

import java.util.Scanner
import kotlin.system.exitProcess

val scanner = Scanner(System.`in`)

var water = 400
var milk = 540
var beans = 120
var cups = 9
var money = 550

fun remaining() {
    println("")
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$beans of coffee beans")
    println("$cups of disposable cups")
    println("$money of money")
    println("")
}

fun buy() {
    println("")
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")

    val answer2 = scanner.nextLine()

    if (answer2 == "1") {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            water -= 250
            beans -= 16
            money += 4
            cups -= 1
            println("I have enough resources, making you a coffee!")
            println("")
        } else if (water < 250) {
            println("Sorry, not enough water!")
            println("")
        } else if (beans < 16) {
            println("Sorry, not enough beans!")
            println("")
        } else if (cups < 1) {
            println("Sorry, not enough cups!")
            println("")
        }

    } else if (answer2 == "2") {
        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            water -= 350
            milk -= 75
            beans -= 20
            money += 7
            cups -=1
            println("I have enough resources, making you a coffee!")
            println("")
        } else if (water < 350) {
            println("Sorry, not enough water!")
            println("")
        } else if (milk < 75) {
            println("Sorry, not enough milk!")
            println("")
        } else if (beans < 20) {
            println("Sorry, not enough beans!")
            println("")
        } else if (cups < 1) {
            println("Sorry, not enough cups!")
            println("")
        }

    } else if (answer2 == "3") {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            water -= 200
            milk -= 100
            beans -= 12
            money += 6
            cups -=1
            println("I have enough resources, making you a coffee!")
            println("")
        } else if (water < 200) {
            println("Sorry, not enough water!")
            println("")
        } else if (milk < 100) {
            println("Sorry, not enough milk!")
            println("")
        } else if (beans < 12) {
            println("Sorry, not enough beans!")
            println("")
        } else if (cups < 1) {
            println("Sorry, not enough cups!")
            println("")
        }

    } else if (answer2 == "back") {
        println("")
    }
}

fun fill() {
    println("")
    print("Write how many ml of water do you want to add: ")
    val answer3 = scanner.nextInt()
    print("Write how many ml of milk do you want to add: ")
    val answer4 = scanner.nextInt()
    print("Write how many grams of coffee beans do you want to add: ")
    val answer5 = scanner.nextInt()
    print("Write how many disposable cups of coffee do you want to add: ")
    val answer6 = scanner.nextInt()

    water += answer3
    milk += answer4
    beans += answer5
    cups += answer6

    println("")
}

fun take() {
    println("I gave you $$money")
    money = 0
    println("")
}

fun main() {
    do {
        print("Write action (buy, fill, take, remaining, exit): ")

        val answer1 = scanner.nextLine()

        when (answer1) {
            "remaining" -> remaining()
            "exit" -> exitProcess(1)
            "fill" -> fill()
            "buy" -> buy()
            "take" -> take()
        }
    } while (answer1 != "exit")
}