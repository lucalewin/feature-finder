package net.lucraft.featurefinder.features;

import net.lucraft.featurefinder.FeatureFinder;
import net.lucraft.featurefinder.util.ChunkPosition;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SlimeChunkFeatureTest {

    boolean isChunk(int x, int z) {
        long seed = FeatureFinder.SEED;

        Random rnd = new Random(seed +
                ((long) x * x * 0x4c1906) +
                (x * 0x5ac0dbL) +
                ((long) z * z) * 0x4307a7L +
                (z * 0x5f24fL) ^ 0x3ad8025f);

        return rnd.nextInt(10) == 0;
    }

    @Test
    void isSlimeChunk() {
        SlimeChunkFeature scf = new SlimeChunkFeature();

        for (int x = -100; x <= 100; x++) {
            for (int z = -100; z <= 100; z++) {
                assert scf.isSlimeChunk(new ChunkPosition(x, z)) == isChunk(x, z);
            }
        }

    }

    @Test
    void testIsSlimeChunk() {
    }
}