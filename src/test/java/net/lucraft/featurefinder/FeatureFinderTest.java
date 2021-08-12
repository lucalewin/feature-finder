package net.lucraft.featurefinder;

import net.lucraft.featurefinder.features.WitchHudFeature;
import net.lucraft.featurefinder.util.Feature;
import net.lucraft.featurefinder.util.Position;
import org.junit.jupiter.api.Test;

class FeatureFinderTest {

    @Test
    void findFeature() {
        FeatureFinder featureFinder = new FeatureFinder(9346852934856498L);

        net.lucraft.featurefinder.features.Feature pos = featureFinder.findFeature(Feature.WITCH_HUD);
    }
}