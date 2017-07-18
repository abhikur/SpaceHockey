package com.example.abhishekthakur.spacehockey.Logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class PositionTest {
    @Test
    public void shouldGiveTheNextPosition() throws Exception {

        Position position = new Position(10, 10);
        position.update(Direction.Right, Direction.Top);
        assertEquals(new Position(11, 9), position);
    }
}