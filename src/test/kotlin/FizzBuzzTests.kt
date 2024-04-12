import org.junit.jupiter.api.Test

class FizzBuzzTests {

    @Test
    fun `Is divisible of 3, then returns Fizz`() {
        assert(fizzBuzz(3) == "Fizz")
    }

    @Test
    fun `Is divisible of 5, then returns Buzz`() {
        assert(fizzBuzz(5) == "Buzz")
    }

    @Test
    fun `Is divisible of 15, then returns FizzBuzz`() {
        assert(fizzBuzz(15) == "FizzBuzz")
    }

    @Test
    fun `Is not divisible by neither 3, 5 or both, then returns same number`() {
        assert(fizzBuzz(1) == "1")
    }

}