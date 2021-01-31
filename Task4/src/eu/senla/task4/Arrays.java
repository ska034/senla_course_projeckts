package eu.senla.task4;

public class Arrays {
    public static void firstarray(){
        final String letters = "ABCDEFGHIKLMNOPQRSTVXYZ";
        int letterslength = letters.length();
        String [][] array = new String[10][10];
        int count = 0;

        String [] diagonal_main = new String[10];
        String [] diagonal_side = new String[10];

// Инициализируем основную матрицу
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                String lettersrandom ="";
                for (int k = 0; k < 6; k++) {
                    int random = (int) (Math.random()*23);
                    lettersrandom += (letters.charAt(random));
                }

                int DoubleOrString = (int) (Math.random()*2);
                if (count % 3 == 0){
                    array[i][j] = (String.valueOf(Math.random()*10)).substring(0,6);
                }
                else {
                    array[i][j] = lettersrandom;
                }
                count++;

            }
        }

// Выводим основную матрицу, и инициализируем массивы из диагоналей
        for (int i = 0, k =0, l = 0, m = 1; i < array.length; i++, k++,l++,m++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j){
                    diagonal_main[k] = array[i][j];
                }
                if (j == array.length - m){
                    diagonal_side[l] = array[i][j];
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

// Выводим диагонали
        System.out.println();
        System.out.print("diagonal_main: ");
        for (String x:diagonal_main) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("diagonal_side: ");
        for (String x:diagonal_side) {
            System.out.print(x + " ");
        }

    }


    public static void secondarray(){
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
            for (int j = 0; j <  array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
