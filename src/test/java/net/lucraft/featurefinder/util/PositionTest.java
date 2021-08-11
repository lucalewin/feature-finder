package net.lucraft.featurefinder.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void test() {
        Position pos = new Position(23, 89, 235);

        long asLong = pos.asLong();

        assert pos.equals(Position.fromLong(asLong));
    }
}