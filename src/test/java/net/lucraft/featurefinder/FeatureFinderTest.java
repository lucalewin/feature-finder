package net.lucraft.featurefinder;

import net.lucraft.featurefinder.util.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeatureFinderTest {

    @Test
    void findFeature() {
        FeatureFinder featureFinder = new FeatureFinder(9346852934856498L);

        Position pos = featureFinder.findFeature(Feature.WITCH_HUD);
    }
}