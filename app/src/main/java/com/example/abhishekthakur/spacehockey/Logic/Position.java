package com.example.abhishekthakur.spacehockey.Logic;

public class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }


    void update(Direction first, Direction second) {
        x += first.getValue();
        y += second.getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        if (x != position.x) return false;
        return y == position.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    boolean isHorizontallyOutside(int horizontalExtent) {
        return this.x <= -horizontalExtent || this.x >= horizontalExtent;
    }

    boolean isVerticallyOutside(int verticalExtent) {
        return this.y <= -verticalExtent || this.y >= verticalExtent;
    }
}
