package exercise32;

public class Point {
    private int x;
    private int y;

    public double distance() {
        double distan = (((0 - getX()) * (0 - getX())) + ((0 - getY()) * (0 - getY()) ));
        distan = Math.sqrt(distan);
        return distan;
    }

    public double distance(Point point) {
        double distan = (((point.getX() - getX()) * (point.getX() - getX())) + ((point.getY() - getY()) * (point.getY() - getY()) ));
        distan = Math.sqrt(distan);
        return distan;

    }

    public double distance(int a, int b) {
        double distan = (((a - getX()) * (a - getX())) + ((b - getY()) * (b - getY()) ));
        distan = Math.sqrt(distan);
        return distan;

    }

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
