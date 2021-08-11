package net.lucraft.featurefinder;

public class FeatureFinder {

    private final long seed;

    public FeatureFinder(long seed) {
        this.seed = seed;
    }

    public long findFeature(Feature feature) {
        long pos = 0;
        switch (feature) {
            case WITCH_HUD -> pos = findWitchHud();
        }
        return pos;
    }



    private long findWitchHud() {
        return 0;
    }

    public long getSeed() {
        return seed;
    }
}
