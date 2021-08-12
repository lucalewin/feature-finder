package net.lucraft.featurefinder.util;

import java.util.Objects;

public class ChunkPosition {

    private final int x, z;

    /**
     *
     * @param x the chunks x coordinate
     * @param z the chunks z coordinate
     */
    public ChunkPosition(int x, int z) {
        this.x = x;
        this.z = z;
    }

    /**
     *
     * @param pos the {@link Position} to be converted to {@link ChunkPosition}
     */
    public ChunkPosition(Position pos) {
        this.x = pos.x() >> 4;
        this.z = pos.z() >> 4;
    }

    /**
     *
     * @param pos the chunk coordinates as a long
     */
    public ChunkPosition(long pos) {
        this.x = (int) pos;
        this.z = (int) (pos >> 32);
    }

    /**
     * @see ChunkPosition#toLong(int, int)
     * @return the chunk coordinates as a long
     */
    public long toLong() {
        return toLong(this.x, this.z);
    }

    /**
     *
     * @param chunkX the chunks x coordinate
     * @param chunkZ the chunks z coordinate
     * @return the chunk coordinates as a long
     */
    public static long toLong(int chunkX, int chunkZ) {
        return (long) chunkX | ((long) chunkZ) << 32;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChunkPosition that)) return false;
        return getX() == that.getX() && getZ() == that.getZ();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getZ());
    }

    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }
}
