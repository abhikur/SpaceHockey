package com.example.abhishekthakur.spacehockey.Logic;

public enum Direction {
    Top(-2) {
        @Override
        public Direction reverse() {
            return Direction.Bottom;
        }
    },
    Bottom(2) {
        @Override
        public Direction reverse() {
            return Direction.Top;
        }
    },
    Left(-1) {
        @Override
        public Direction reverse() {
            return Direction.Right;
        }
    },
    Right(1) {
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
