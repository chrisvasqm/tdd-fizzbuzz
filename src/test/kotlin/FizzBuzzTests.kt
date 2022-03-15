import org.testng.annotations.Test

class FizzBuzzTests {

    @Test
    fun `Is divisible of 3, then return Fizz`() {
        assert(fizzBuzz(3) == "Fizz")
    }

    @Test
    fun `Is divisible of 5, then return Buzz`() {
        assert(fizzBuzz(5) == "Buzz")
    }

    @Test
    fun `Is divisible of 15, then return FizzBuzz`() {
        assert(fizzBuzz(15) == "FizzBuzz")
    }
}