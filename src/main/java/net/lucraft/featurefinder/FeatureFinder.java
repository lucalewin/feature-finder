package net.lucraft.featurefinder;

import net.lucraft.featurefinder.util.Position;

public class FeatureFinder {

    private final long seed;

    public FeatureFinder(long seed) {
        this.seed = seed;
    }

    public Position findFeature(Feature feature) {
        Position pos = null;
        switch (feature) {
            case SLIME_CHUNK -> pos = findSlimeChunk();
            case AMETHYST_GEODE -> pos = findAmethystGeode();
            case WITCH_HUD -> pos = findWitchHud();
            case QUAD_WITCH_HUD -> pos = findQuadWitchHud();
        }
        return pos;
    }

    private Position findSlimeChunk() {
        return null;
    }

    private Position findAmethystGeode() {
        return null;
    }

    private Position findWitchHud() {
        return null;
    }

    private Position findQuadWitchHud() {
        return null;
    }

    public long getSeed() {
        return seed;
    }
}
