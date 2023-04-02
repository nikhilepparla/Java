import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("/");
        while (scanner.hasNext()) {
            System.out.println("Scanner " + scanner.next());
        }
        System.out.printf("Deliminator used " + scanner.delimiter().toString());
        scanner.close();
    }
}