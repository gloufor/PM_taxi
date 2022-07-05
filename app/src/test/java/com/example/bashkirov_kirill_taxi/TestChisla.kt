import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertTrue
import org.junit.Test

class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun addition_correct() {
        assertEquals(4, 2 + 2)
    }

    @Test
    @Throws(Exception::class)
    fun addition_isNotCorrect() {
        assertEquals("Numbers isn't equals!", 5, 2 + 2)
    }

    @Test(expected = NullPointerException::class)
    fun nullStringTest() {
        val str: String? = null
        assertTrue(str!!.isEmpty())
    }
}