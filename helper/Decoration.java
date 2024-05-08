package helper;

public class Decoration {
    public static void printHeader(String header) {
        printSeparator();
        System.out.println(header);
        printSeparator();
    }

    public static void printSeparator() {
        System.out.println("--------------------------------------------------------------------------------");
    }
}
