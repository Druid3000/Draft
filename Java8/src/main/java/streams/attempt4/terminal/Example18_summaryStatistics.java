package streams.attempt4.terminal;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;

public class Example18_summaryStatistics {
    public static void main(String[] args) {
        LongSummaryStatistics statistics = LongStream.range(2, 16)
                .summaryStatistics();

        System.out.format("  count: %d%n", statistics.getCount());
        System.out.format("    sum: %d%n", statistics.getSum());
        System.out.format("average: %.1f%n", statistics.getAverage());
        System.out.format("    min: %d%n", statistics.getMin());
        System.out.format("    max: %d%n", statistics.getMax());
    }
}
