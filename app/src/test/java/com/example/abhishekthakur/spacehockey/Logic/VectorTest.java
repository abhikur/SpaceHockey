package com.example.abhishekthakur.spacehockey.Logic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VectorTest {

    @Test
    public void shouldChangeThePositionButNotDirection() throws Exception {

        Vector vector = new Vector(10, 10);
        vector.setPosition(new Position(8, -5));
        vector.setHorizontalDirection(Direction.Left);
        vector.setVerticalDirection(Direction.Top);

        vector.changePosition();

        Vector expectedVector = new Vector(10, 10);
        expectedVector.setPosition(new Position(7, -6));
        expectedVector.setHorizontalDirection(Direction.Left);
        expectedVector.setVerticalDirection(Direction.Top);

        assertEquals(expectedVector, vector);

    }

    @Test
    public void shouldChangeBothPositionAndHorizontalDirection() throws Exception {

        Vector vector = new Vector(10, 10);
        vector.setPosition(new Position(10, 5));
        vector.setHorizontalDirection(Direction.Right);
        vector.setVerticalDirection(Direction.Top);

        vector.changePosition();

        Vector expectedVector = new Vector(10, 10);
        expectedVector.setPosition(new Position(9, 4));
        expectedVector.setHorizontalDirection(Direction.Left);
        expectedVector.setVerticalDirection(Direction.Top);

        assertEquals(expectedVector, vector);

    }

    @Test
    public void shouldChangeBothPositionAndVerticalDirection() throws Exception {

        Vector vector = new Vector(10, 10);
        vector.setPosition(new Position(5, -10));
        vector.setHorizontalDirection(Direction.Right);
        vector.setVerticalDirection(Direction.Top);

        vector.changePosition();

        Vector expectedVector = new Vector(10, 10);
        expectedVector.setPosition(new Position(6, -9));
        expectedVector.setHorizontalDirection(Direction.Right);
        expectedVector.setVerticalDirection(Direction.Bottom);

        assertEquals(expectedVector, vector);

    }

    @Test
    public void shouldChangePositionAndBothDirections() throws Exception {

        Vector vector = new Vector(10, 10);
        vector.setPosition(new Position(-10, -10));
        vector.setHorizontalDirection(Direction.Left);
        vector.setVerticalDirection(Direction.Top);

        vector.changePosition();

        Vector expectedVector = new Vector(10, 10);
        expectedVector.setPosition(new Position(-9, -9));
        expectedVector.setHorizontalDirection(Direction.Right);
        expectedVector.setVerticalDirection(Direction.Bottom);

        assertEquals(expectedVector, vector);

    }

}