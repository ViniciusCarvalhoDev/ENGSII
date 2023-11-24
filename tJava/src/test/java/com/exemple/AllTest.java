package test.java.com.exemple;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.platform.suite.api.Suite;

import Utils.MySet;

class AllTest {

    @Test
    void testAdd() {
        MySet<Integer> set = new MySet<>();
        set.add(1);

        assertFalse(set.eh_vazio());
        assertEquals(Arrays.asList(1), set.getConjunto());
    }

    @Test
    void testAddAll() {
        MySet<Integer> set = new MySet<>();
        List<Integer> elements = Arrays.asList(1, 2, 3);

        set.addAll(elements);

        assertFalse(set.eh_vazio());
        assertEquals(elements, set.getConjunto());
    }

    @Test
    void testRemoveItems() {
        MySet<Integer> set = new MySet<>();
        set.addAll(Arrays.asList(1, 2, 3, 4));

        set.removeItems(3);

        assertFalse(set.getConjunto().contains(3));
        assertEquals(Arrays.asList(1, 2, 4), set.getConjunto());
    }

    @Test
    void testUnionConj() {
        MySet<Integer> setA = new MySet<>();
        setA.addAll(Arrays.asList(1, 2, 3));

        MySet<Integer> setB = new MySet<>();
        setB.addAll(Arrays.asList(2, 3, 4));

        List<Integer> result = setA.uniaoConj(setB.getConjunto());

        assertEquals(Arrays.asList(1, 2, 3, 4), result);
    }

    @Test
    void testIntersectionConj() {
        MySet<Integer> setA = new MySet<>();
        setA.addAll(Arrays.asList(1, 2, 3));

        MySet<Integer> setB = new MySet<>();
        setB.addAll(Arrays.asList(2, 3, 4));

        List<Integer> result = setA.intersConj(setB.getConjunto());

        assertEquals(Arrays.asList(2, 3), result);
    }

    @Test
    void testDifferenceConj() {
        MySet<Integer> setA = new MySet<>();
        setA.addAll(Arrays.asList(1, 2, 3));

        MySet<Integer> setB = new MySet<>();
        setB.addAll(Arrays.asList(2, 3, 4));

        List<Integer> result = setA.diffConj(setB.getConjunto());

        assertEquals(Arrays.asList(1, 2, 3), result);
    }
}
