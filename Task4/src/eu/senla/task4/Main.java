package eu.senla.task4;

public class Main {
    public static void main(String[] args) {
        final String letters = "ABCDEFGHIKLMNOPQRSTVXYZ";
        int letterslength = letters.length();
        String [][] array = new String[10][10];
        int count = 0;


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


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }






//        System.out.println(lettersrandom);













//        int [][] array= new int [10][10];
//        int a = 1;
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if ((i == j)|| (j == array.length-a)){
//                    array[i][j] = 1;
//                }
//                else {
//                    array[i][j] = 0;
//                }
//            }
//            a++;
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
