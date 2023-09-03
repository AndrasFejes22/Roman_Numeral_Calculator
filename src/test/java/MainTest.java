import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void romanNumberCalculatorTest() {
        //assertEquals(1400, Main.romanNumberCalculator("MCD"));
        //assertEquals(1, Main.romanNumberCalculator("I"));
        //assertEquals(9, Main.romanNumberCalculator("IX"));
        //assertEquals(10, Main.romanNumberCalculator("X"));

        /*
        assertEquals(4, Main.romanNumberCalculator("IV"));
        assertEquals(5, Main.romanNumberCalculator("V"));
        assertEquals(6, Main.romanNumberCalculator("VI"));
        assertEquals(50, Main.romanNumberCalculator("L"));
        */
        //assertEquals(40, Main.romanNumberCalculator("XL"));
        //assertEquals(400, Main.romanNumberCalculator("CD"));
        assertEquals(3888, Main.romanNumberCalculator("MMMDCCCLXXXVIII"));
        assertEquals(441, Main.romanNumberCalculator("CDXLI"));
        assertEquals(78, Main.romanNumberCalculator("LXXVIII"));
        assertEquals(99, Main.romanNumberCalculator("XCIX"));
        assertEquals(49, Main.romanNumberCalculator("XLIX"));
        assertEquals(800, Main.romanNumberCalculator("DCCC"));
        assertEquals(888, Main.romanNumberCalculator("DCCCLXXXVIII"));
        assertEquals(1944, Main.romanNumberCalculator("MCMXLIV"));
        //assertEquals(1984, Main.romanNumberCalculator("MCMLXXXIV"));
        //assertEquals(50, Main.romanNumberCalculator("L"));
    }

    @Test
    void alternateListTest() {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("M");
        stringLinkedList.add("C");
        stringLinkedList.add("M");

        List<String> resultList = new ArrayList<>();
        resultList.add("M");
        resultList.add("CM");

        assertEquals(resultList, Main.alternateList(stringLinkedList));

        LinkedList<String> stringLinkedList2 = new LinkedList<>();
        stringLinkedList2.add("M");
        stringLinkedList2.add("C");
        stringLinkedList2.add("M");
        stringLinkedList2.add("X");
        stringLinkedList2.add("I");
        stringLinkedList2.add("X");

        List<String> resultList2 = new ArrayList<>();
        resultList2.add("M");
        resultList2.add("CM");
        resultList2.add("X");
        resultList2.add("IX");

        assertEquals(resultList2, Main.alternateList(stringLinkedList2));
        System.out.println();


    }
}