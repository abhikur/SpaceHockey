package com.example.abhishekthakur.spacehockey.Logic;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class BallTest {
    @Test
    public void shouldGiveCurrentPositionOfBall() throws Exception {
        HashMap<String, Integer> position = new HashMap<>();
        position.put("x", 10);
        position.put("y", 10);
        Ball ball = new Ball(position);

        HashMap<String, Integer> actualPosition = ball.position();
        HashMap<String, Integer> expectedPosition = new HashMap<>();
        expectedPosition.put("x", 10);
        expectedPosition.put("y", 10);
        assertTrue(expectedPosition.equals(actualPosition));;

    }

    @Test
    public void shouldGiveCurrentPositionOfBallAfterMovement() throws Exception {
        HashMap<String, Integer> position = new HashMap<>();
        position.put("x", 10);
        position.put("y", 10);
        Ball ball = new Ball(position);

        HashMap<String, Integer> newPosition = new HashMap<>();
        newPosition.put("x", 11);
        newPosition.put("y", 11);
        ball.moveTo(newPosition);

        HashMap<String, Integer> actualPosition = ball.position();
        assertTrue(newPosition.equals(actualPosition));
    }
}