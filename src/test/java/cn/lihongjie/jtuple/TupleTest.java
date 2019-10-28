package cn.lihongjie.jtuple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TupleTest {


    @Test
    void testConstructor() {

        Tuple<Integer, Character> tuple1 = Tuple.of(1, 'a');
        Tuple<Integer, Character> tuple2 = Tuple.of(1, null);
        Tuple<Integer, Character> tuple3 = Tuple.of(null, null);
        Tuple<Integer, Character> tuple4 = Tuple.of(null, null);


    }


    @Test
    void testEqual() {

        Tuple<Integer, Character> tuple1 = Tuple.of(1, 'a');
        assertEquals(tuple1, tuple1);
        assertEquals(tuple1, Tuple.of(1, 'a'));
        assertEquals(Tuple.of(null, null), Tuple.of(null, null));


    }

    @Test
    void testToString() {
        Tuple<Integer, Character> tuple1 = Tuple.of(1, 'a');
        assertEquals(tuple1.toString(), "Tuple(1, a)");
        Tuple<Integer, String> tuple2 = Tuple.of(1, "loremdddddddddddddd");
        assertEquals(tuple2.toString(), "Tuple(1, loremdddddddddddddd)");
    }
}