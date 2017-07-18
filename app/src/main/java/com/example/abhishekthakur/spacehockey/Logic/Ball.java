package com.example.abhishekthakur.spacehockey.Logic;

import java.util.HashMap;

public class Ball {
    private HashMap<String, Integer> position;

    public Ball(HashMap<String, Integer> position) {
        this.position = position;
    }

    public HashMap<String, Integer> position() {
        return position;
    }

    public void moveTo(HashMap<String, Integer> newPosition) {
        this.position = newPosition;
    }
}
