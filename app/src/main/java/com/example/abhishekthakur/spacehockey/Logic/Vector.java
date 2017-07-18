package com.example.abhishekthakur.spacehockey.Logic;

public class Vector {

    private final int horizontalExtent;
    private final int verticalExtent;
    private Position position;
    private Direction horizontal;
    private Direction vertical;

    public Vector(int horizontalExtent, int verticalExtent) {

        this.horizontalExtent = horizontalExtent;
        this.verticalExtent = verticalExtent;
    }

    public void changePosition() {
        if (position.isHorizontallyOutside(this.horizontalExtent)) {
            horizontal = horizontal.reverse();
        }
        if (position.isVerticallyOutside(this.verticalExtent)) {
            vertical = vertical.reverse();
        }
        position.update(horizontal, vertical);
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setHorizontalDirection(Direction horizontal) {
        this.horizontal = horizontal;
    }

    public void setVerticalDirection(Direction vertical) {
        this.vertical = vertical;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector vector = (Vector) o;

        if (horizontalExtent != vector.horizontalExtent) return false;
        if (verticalExtent != vector.verticalExtent) return false;
        if (!position.equals(vector.position)) return false;
        if (horizontal != vector.horizontal) return false;
        return vertical == vector.vertical;

    }

    @Override
    public int hashCode() {
        int result = horizontalExtent;
        result = 31 * result + verticalExtent;
        result = 31 * result + position.hashCode();
        result = 31 * result + horizontal.hashCode();
        result = 31 * result + vertical.hashCode();
        return result;
    }

    public Position currentPosition() {
        return position;
    }
}
