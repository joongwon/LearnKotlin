package _1_GettingStarted

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 *  @author Leopold Baik
 *  https://github.com/joongwon
 */
class BasicSyntaxTest {

    @Test fun ifExpressionTest() {
        assertEquals(3, ifExpression(3, 1))
    }

    @Test fun ifExpression2Test() {
        assertEquals(3, ifExpression2(3, 1))
    }

    @Test fun whenExpressionTest() {
        assertEquals("Hi", whenExpression(1))
        assertEquals("Good", whenExpression(2))
        assertEquals("Sad", whenExpression(10))
    }

    @Test fun whenExpression2Test() {
        assertEquals("Yes", whenExpression2(1))
        assertEquals("Yes", whenExpression2(2))
        assertEquals("Yes", whenExpression2(3))
        assertEquals("No", whenExpression2(10))
    }

    @Test fun whenExpression3Test() {
        assertEquals("In", whenExpression3(9))
        assertEquals("Outside", whenExpression3(21))
        assertEquals("None", whenExpression3(15))
    }

    @Test fun whenExpression4Test() {
        assertEquals("Hello", whenExpression4("Say"))
        assertEquals(5, whenExpression4(5))
        assertEquals("NotFound", whenExpression4(""))
    }

    @Test fun whenExpression5Test() {
        assertEquals(true, whenExpression5("prefix"))
        assertEquals(false, whenExpression5("empty"))
    }

    @Test fun nullSafetyTest() {
        assertEquals(null, nullSafety(null))
        assertEquals(2, nullSafety("Hi"))
    }

    @Test fun smartCastTest() {
        assertEquals(null, smartCast(10))
        assertEquals(2, smartCast("Hi"))
    }

    @Test fun smartCast2Test() {
        assertEquals(1, smartCast2(1))
        assertEquals(2, smartCast2("Hi"))
        assertEquals(6, smartCast2(intArrayOf(1, 2, 3)))
    }

    @Test fun forLoopTest() {
        assertEquals(true, forLoop(intArrayOf(1, 2, 3), 2))
        assertEquals(false, forLoop(intArrayOf(1, 2, 3), 5))
    }

    @Test fun forLoop2Test() {
        assertEquals(true, forLoop2(intArrayOf(1, 2, 3), 2))
        assertEquals(false, forLoop2(intArrayOf(1, 2, 3), 5))
    }

    @Test fun forLoop3Test() {
        assertEquals(1, forLoop3(intArrayOf(1, 2, 3), 0))
        assertEquals(3, forLoop3(intArrayOf(1, 2, 3), 2))
    }
}

