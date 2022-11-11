package exercise28;

public class PaintJob {
    public static void main(String Args[]) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBucket < 0)) {
            return -1;
        }
        double acreageArea = width * height;
        double buckets = acreageArea / areaPerBucket;
        int buck = (int) Math.ceil(buckets);
        buck = buck - extraBucket;
        return buck;

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double acreageArea = width * height;
        double buckets = acreageArea / areaPerBucket;
        int buck = (int) Math.ceil(buckets);
        return buck;

    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }
        double buckets = area / areaPerBucket;
        int buck = (int) Math.ceil(buckets);
        return buck;

    }
}
