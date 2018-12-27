package GraphHeuristicPlanner;

public class MemoryConsumptionCalculator
{
    private static final long MEGABYTE = 1024L * 1024L;
    private static final long MEMORY_LIMIT = 7 * MEGABYTE;

    private long currentMemoryUsage;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }

    public void getMemoryUsage() {
        Runtime runtime = Runtime.getRuntime();
        long memory = runtime.totalMemory() - runtime.freeMemory();

        currentMemoryUsage = bytesToMegabytes(memory);
    }

    public void setCurrentMemoryUsage(long currentMemoryUsage)
    {
        this.currentMemoryUsage = currentMemoryUsage;
    }

    public long getCurrentMemoryUsage()
    {
        return currentMemoryUsage;
    }

    public static long getMemoryLimit()
    {
        return MEMORY_LIMIT;
    }
}
