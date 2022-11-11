package exercise8;

public class AreaCalculator {
    public static void main(String args[]){
        System.out.println(area(5));
        System.out.println(area(5,4));

    }
    public static double area(double radius){
        if (radius < 0 ){
            return -1;
        }
        double areaConv = radius * radius * Math.PI;
        return areaConv;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1;
        }
        double formula = x * y;
        return formula;
    }

}
