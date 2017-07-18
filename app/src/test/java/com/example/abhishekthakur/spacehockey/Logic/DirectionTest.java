package com.example.abhishekthakur.spacehockey.Logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirectionTest {
    @Test
    public void shouldGetMinusOneForTopDirection() throws Exception {
        assertEquals(-1, Direction.Top.getValue());
    }

    @Test
    public void shouldGetMinusOneForLeftDirection() throws Exception {
        assertEquals(-1, Direction.Left.getValue());
    }

    @Test
    public void shouldGetPlusOneForBottomDirection() throws Exception {
        assertEquals(1, Direction.Bottom.getValue());
    }

    @Test
    public void shouldGetPlusOneForRightDirection() throws Exception {
        assertEquals(1, Direction.Right.getValue());
    }

}