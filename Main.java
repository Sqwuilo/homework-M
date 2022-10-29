import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        numNum(a, b);


    }
    public static void numNum (int a, int b){
        int c = a;
        a = b;
        b = c;
        System.out.println( a + " " + b);
    }
}