// Count the numbers from 1 to 15
// If the number is divisible by 3, print Fizz [X]
// If the number is divisible by 5, print Buzz [X]
// If the number is divisible by both 3 and 5, print FizzBuzz [X]
fun main(args: Array<String>) {
    for (number in 1..15) {
        println(fizzBuzz(number))
    }
}

fun fizzBuzz(number: Int): String {
    if (isDivisibleBy(15, number))
        return "FizzBuzz"

    if (isDivisibleBy(3, number))
        return "Fizz"

    if (isDivisibleBy(5, number))
        return "Buzz"

    return number.toString()
}

private fun isDivisibleBy(by: Int, number: Int) = number % by == 0
