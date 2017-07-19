package com.example.abhishekthakur.spacehockey.Logic;

public enum Direction {
    Top(-5) {
        @Override
        public Direction reverse() {
            return Direction.Bottom;
        }
    },
    Bottom(5) {
        @Override
        public Direction reverse() {
            return Direction.Top;
        }
    },
    Left(-3) {
        @Override
        public Direction reverse() {
            return Direction.Right;
        }
    },
    Right(3) {
        @Override
        public Direction reverse() {
            return Direction.Left;
        }
    };

    private int direction;

    Direction(int direction) {
        this.direction = direction;
    }

    public abstract Direction reverse();

    public int getValue() {
        return direction;
    };

}
