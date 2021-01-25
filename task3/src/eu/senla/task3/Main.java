package eu.senla.task3;

public class Main {
    public static void main(String[] args) {

//Task1

        int i = 1;
        while (i <= 10){
            Cat cat = new Cat();
            System.out.println(i + ". Name: " + cat.getCAT_NAME() + " Age: " + cat.getCAT_AGE());
            i++;
        }

    }
}
