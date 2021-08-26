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
    main()
}

fun buy() {
    println("")
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")

    val resp2 = scanner.nextLine()

    if (resp2 == "1") {
        if (water >= 250 && beans >= 16 && cups >= 1) {
            water -= 250
            beans -= 16
            money += 4
            cups -= 1
            println("I have enough resources, making you a coffee!")
            println("")
            main()
        } else if (water < 250) {
            println("Sorry, not enough water!")
            println("")
            main()
        } else if (beans < 16) {
            println("Sorry, not enough beans!")
            println("")
            main()
        } else if (cups < 1) {
            println("Sorry, not enough cups!")
            println("")
            main()
        }

    } else if (resp2 == "2") {
        if (water >= 350 && milk >= 75 && beans >= 20 && cups >= 1) {
            water -= 350
            milk -= 75
            beans -= 20
            money += 7
            cups -=1
            println("I have enough resources, making you a coffee!")
            println("")
            main()
        } else if (water < 350) {
            println("Sorry, not enough water!")
            println("")
            main()
        } else if (milk < 75) {
            println("Sorry, not enough milk!")
            println("")
            main()
        } else if (beans < 20) {
            println("Sorry, not enough beans!")
            println("")
            main()
        } else if (cups < 1) {
            println("Sorry, not enough cups!")
            println("")
            main()
        }

    } else if (resp2 == "3") {
        if (water >= 200 && milk >= 100 && beans >= 12 && cups >= 1) {
            water -= 200
            milk -= 100
            beans -= 12
            money += 6
            cups -=1
            println("I have enough resources, making you a coffee!")
            println("")
            main()
        } else if (water < 200) {
            println("Sorry, not enough water!")
            println("")
            main()
        } else if (milk < 100) {
            println("Sorry, not enough milk!")
            println("")
            main()
        } else if (beans < 12) {
            println("Sorry, not enough beans!")
            println("")
            main()
        } else if (cups < 1) {
            println("Sorry, not enough cups!")
            println("")
            main()
        }

    } else if (resp2 == "back") {
        println("")
        main()
    }
}

fun fill() {
    println("")
    print("Write how many ml of water do you want to add: ")
    val resp3 = scanner.nextInt()
    print("Write how many ml of milk do you want to add: ")
    val resp4 = scanner.nextInt()
    print("Write how many grams of coffee beans do you want to add: ")
    val resp5 = scanner.nextInt()
    print("Write how many disposable cups of coffee do you want to add: ")
    val resp6 = scanner.nextInt()

    water += resp3
    milk += resp4
    beans += resp5
    cups += resp6

    println("")
    main()
}

fun take() {
    println("I gave you $$money")
    money = 0
    println("")
    main()
}

fun main() {

    print("Write action (buy, fill, take, remaining, exit): ")

    val answer = scanner.nextLine()

    when (answer) {
        "remaining" -> remaining()
        "exit" -> exitProcess(1)
        "buy" -> buy()
        "fill" -> fill()
        "take" -> take()

    }











    /* println("Write how many cups of coffee you will need: ")

    val cups = scanner.nextInt()
    val water = cups * 200
    val milk = cups * 50
    val beans = cups * 15

    println("Write how many cups of coffee you will need: ")
    println("For $cups of coffee you will need:")
    println("$water ml of water")
    println("$milk ml of milk")
    println("$beans g of coffee beans")

    println("Write how many ml of water the coffee machine has: ")
    val water = scanner.nextInt()
    println("Write how many ml of milk the coffee machine has: ")
    val milk = scanner.nextInt()
    println("Write how many grams of coffee beans the coffee machine has: ")
    val beans = scanner.nextInt()
    println("Write how many cups of coffee you will need: ")
    val cups = scanner.nextInt()

    val avWater: Int = water / 200
    val avMilk: Int = milk / 50
    val avBeans: Int = beans / 15

    val N = avWater.coerceAtMost(avMilk.coerceAtMost(avBeans))
    val res = N - cups

    if (N == cups) {
        println("Yes, I can make that amount of coffee")
    } else if (N > cups) {
        println("Yes, I can make that amount of coffee (and even $res more than that)")
    } else {
        println("No, I can make only $N cups of coffee")
    }





    var water = 400
    var milk = 540
    var beans = 120
    var cups = 9
    var money = 550
}
    println("The coffee machine has:")
    println("$water of water")
    println("$milk of milk")
    println("$beans of coffee beans")
    println("$cups of disposable cups")
    println("$money of money")
    println("")
    println("Write action (buy, fill, take): ")

    val resp1 = scanner.nextLine()

    if (resp1.equals("buy")) {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
        val resp2 = scanner.nextInt()

        if (resp2 == 1) {
            water -= 250
            beans -= 16
            money += 4
            cups -= 1
        } else if (resp2 == 2) {
            water -= 350
            milk -= 75
            beans -= 20
            money += 7
            cups -=1
        } else if (resp2 == 3) {
            water -= 200
            milk -= 100
            beans -= 12
            money += 6
            cups -=1
        }
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$money of money")

    } else if (resp1.equals("fill")) {
        println("Write how many ml of water do you want to add: ")
        val resp3 = scanner.nextInt()
        water += resp3
        println("Write how many ml of milk do you want to add: ")
        val resp4 = scanner.nextInt()
        milk += resp4
        println("Write how many grams of coffee beans do you want to add: ")
        val resp5 = scanner.nextInt()
        beans += resp5
        println("Write how many disposable cups of coffee do you want to add: ")
        val resp6 = scanner.nextInt()
        cups += resp6

        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$money of money")

    } else if (resp1.equals("take")) {
        println("I gave you $$money")
        money = 0
        println("")
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$beans of coffee beans")
        println("$cups of disposable cups")
        println("$money of money")
    }
    */
}