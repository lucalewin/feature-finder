package net.lucraft.featurefinder.features;

import net.lucraft.featurefinder.FeatureFinder;
import net.lucraft.featurefinder.util.ChunkPosition;
import net.lucraft.featurefinder.util.Position;

import java.util.Random;

public class SlimeChunkFeature extends Feature {

    /**
     * internally calls {@link SlimeChunkFeature#findNearest(ChunkPosition)}
     * @see SlimeChunkFeature#findNearest(ChunkPosition)
     * @param pos the origin position for the search <br>
     *            pos will be converted to {@link ChunkPosition}
     * @return the nearest slime chunk position to the given position
     */
    public ChunkPosition findNearest(Position pos) {
        return findNearest(new ChunkPosition(pos));
    }

    /**
     * @see SlimeChunkFeature#findNearest(Position)
     * @param pos the origin chunk position for the search
     * @return the nearest slime chunk position to the given chunk position
     */
    public ChunkPosition findNearest(ChunkPosition pos) {
        if (isSlimeChunk(pos))
            return pos;

        return null;
    }

    /**
     *
     * internally calls {@link SlimeChunkFeature#isSlimeChunk(ChunkPosition)}
     *
     * @see SlimeChunkFeature#isSlimeChunk(ChunkPosition) 
     * @param pos the coordinates of the chunk to check <br>
     *            pos will be converted to {@link ChunkPosition}
     * @return true, if the chunk is a slime chunk, otherwise false
     */
    public boolean isSlimeChunk(Position pos) {
        return isSlimeChunk(new ChunkPosition(pos));
    }

    /**
     * uses algorithm found <a href="https://minecraft.fandom.com/wiki/Slime#.22Slime_chunks.22">here</a>
     *
     * @see SlimeChunkFeature#isSlimeChunk(Position)
     * @param pos the chunk-coordinates of the chunk to check
     * @return true, if the chunk is a slime chunk, otherwise false
     */
    public boolean isSlimeChunk(ChunkPosition pos) {
        Random random = new Random(FeatureFinder.SEED +
                ((long) pos.getX() * pos.getX() * 0x4c1906) +
                (pos.getX() * 0x5ac0dbL) +
                ((long) pos.getZ() * pos.getZ()) * 0x4307a7L +
                (pos.getZ() * 0x5f24fL) ^ 0x3ad8025f);
        return random.nextInt(10) == 0;
    }

}
