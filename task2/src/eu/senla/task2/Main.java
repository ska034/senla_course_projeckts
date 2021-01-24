package eu.senla.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the color rainbow. From 1.0 to 7.0");
        Rainbow rainbow = new Rainbow(input.nextDouble());
        rainbow.setNumberColor(rainbow.getNumberColor());
    }
}
