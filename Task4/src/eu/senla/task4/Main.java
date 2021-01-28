package eu.senla.task4;

public class Main {
    public static void main(String[] args) {
        int [][] array= new int [10][10];
        int a = 1;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == j)|| (j == array.length-a)){
                    array[i][j] = 1;
                }
                else {
                    array[i][j] = 0;
                }
            }
            a++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
