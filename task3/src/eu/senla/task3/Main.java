package eu.senla.task3;

public class Main {
    public static void main(String[] args) {

//Task1
//        Cat cat = new Cat();
//        cat.Mycat();


//Task2
//        for (int i = 1; i<=10; i++){
//            Cat cat = new Cat();
//            cat.setCAT_NAME("Mark");
//            cat.setCAT_AGE(1);
//            System.out.println(i + ". Name: " + cat.getCAT_NAME() + " Age: " + cat.getCAT_AGE());
//        }


//Task3
    int i = 1;
    Cat MarkII = new Cat("MARK_II",7);

        do {
            System.out.println(i + ".Name: " + MarkII.getName() + "     Age: " + MarkII.getAge());
            i++;
        } while (i<=10);

    }
}
