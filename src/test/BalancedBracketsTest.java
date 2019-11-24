package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void pairOfBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[Hello][World]"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("{]"));
    }

    @Test
    public void mismatchedBracketsReturnsFalseOne() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("[hello}"));
    }

    @Test
    public void mismatchedBracketsReturnsFalseTwo() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }

    @Test
    public void isNotNull() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertNotNull(test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void isNotTheSame() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertNotSame(test_Class.hasBalancedBrackets("[]"), test_Class.hasBalancedBrackets("{]"));
    }

    @Test
    public void isTheSame() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertSame(test_Class.hasBalancedBrackets("[]}"), test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void isEqual() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertEquals(true, test_Class.hasBalancedBrackets("[]"));
    }

    @Test
    public void isNotEqual() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertNotEquals(true, test_Class.hasBalancedBrackets("{]"));
    }

}