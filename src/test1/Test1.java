package test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("digita la base: ");
        double base = scan.nextDouble();
        System.out.println("digita la altura: ");
        double altura = scan.nextDouble();

        double superficie = (base*altura);
        System.out.println(superficie);
    }
}
