package net.lucraft.featurefinder;

import net.lucraft.featurefinder.features.AmethystGeodeFeature;
import net.lucraft.featurefinder.features.QuadWitchHudFeature;
import net.lucraft.featurefinder.features.SlimeChunkFeature;
import net.lucraft.featurefinder.features.WitchHudFeature;
import net.lucraft.featurefinder.util.Feature;
import net.lucraft.featurefinder.util.Position;

public record FeatureFinder(long seed) {

    public static final long SEED = 0;

    public net.lucraft.featurefinder.features.Feature findFeature(Feature feature) {
        net.lucraft.featurefinder.features.Feature pos = null;
        switch (feature) {
            case SLIME_CHUNK -> pos = findSlimeChunk();
            case AMETHYST_GEODE -> pos = findAmethystGeode();
            case WITCH_HUD -> pos = findWitchHud();
            case QUAD_WITCH_HUD -> pos = findQuadWitchHud();
        }
        return pos;
    }

    private SlimeChunkFeature findSlimeChunk() {
        return null;
    }

    private AmethystGeodeFeature findAmethystGeode() {
        return null;
    }

    private WitchHudFeature findWitchHud() {
        return null;
    }

    private QuadWitchHudFeature findQuadWitchHud() {
        return null;
    }

    public long getSeed() {
        return seed;
    }
}
