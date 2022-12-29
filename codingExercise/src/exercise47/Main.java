package exercise47;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player giannis = new Player("Giannis", 10, 20);
        System.out.println(giannis.toString());

        List<String> gg = giannis.write();
        giannis.read(gg);

        System.out.println(giannis.toString());


    }
}
