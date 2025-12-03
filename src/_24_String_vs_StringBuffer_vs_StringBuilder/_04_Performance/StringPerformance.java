package _24_String_vs_StringBuffer_vs_StringBuilder._04_Performance;

public class StringPerformance {
    public static void main(String[] args) {
        long totalStrTime=0, totalSbTime=0, totalSbfTime=0;
        for (int i = 0; i < 10; i++) {
            // 1. String (slowest amongst all)
            long startTimeStr = System.nanoTime();
            String str = "Hello";
            for (int j = 0; j < 10000; j++) {
                str += "programming";
            }
            long endTimeStr = System.nanoTime();
            totalStrTime += (endTimeStr - startTimeStr);

            // 2. StringBuilder (will be faster than both)
            long startTimeSb = System.nanoTime();
            StringBuilder sb = new StringBuilder("stbd");
            for (int j = 0; j < 10000; j++) {
                sb.append("programming");
            }
            long endTimeSb = System.nanoTime();
            totalSbTime += (endTimeSb - startTimeSb);

            // 3. StringBuffer (will be faster than String but slower than StringBuilder)
            long startTimeSbf = System.nanoTime();
            StringBuffer sbf = new StringBuffer("stbf");
            for (int j = 0; j < 10000; j++) {
                sbf.append("programming");
            }
            long endTimeSbf = System.nanoTime();
            totalSbfTime += (endTimeSbf - startTimeSbf);
        }

        System.out.println("Average time for String class = " + (totalStrTime) + " ns");
        System.out.println("Average time for StringBuilder class = " + (totalSbTime/10) + " ns");
        System.out.println("Average time for StringBuffer class = " + (totalSbfTime/10) + " ns");
    }
}