package exercise38;

public class Main {
    public static void main (String Args[]){
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(3);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        pagesPrinted = printer.printPages(180);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
        System.out.println(printer.addToner(40));
        System.out.println(printer.addToner(40));
        Printer printer2 = new Printer(50, false);
        System.out.println(printer2.addToner(50));
        System.out.println("initial page count = " +printer2.getPagesPrinted());
        int pagesPrinted2 = printer2.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted2 +" new total print count for printer = " +printer2.getPagesPrinted());
        pagesPrinted2 = printer2.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted2 +" new total print count for printer = " +printer2.getPagesPrinted());
        pagesPrinted2 = printer2.printPages(3);
        System.out.println("Pages printed was " + pagesPrinted2 +" new total print count for printer = " +printer2.getPagesPrinted());
        pagesPrinted2 = printer2.printPages(180);
        System.out.println("Pages printed was " + pagesPrinted2 +" new total print count for printer = " +printer2.getPagesPrinted());
        System.out.println(printer2.addToner(50));
        System.out.println(printer2.addToner(60));
    }
}
