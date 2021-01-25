package eu.senla.task3;



public class Cat {

//Task1
//        private final String  CAT_NAME= "Jarvis";
//        private final int CAT_AGE = 3;

//    public void Mycat() {
//        int i = 1;
//        while (i <= 10){
//            System.out.println(i + ". Name: " + CAT_NAME + " Age: " + CAT_AGE);
//            i++;
//        }
//    }

//Task2
//    private String  CAT_NAME= "Jarvis";
//    private int CAT_AGE = 3;
//
//    public String getCAT_NAME() {
//        return CAT_NAME;
//    }
//
//    public int getCAT_AGE() {
//        return CAT_AGE;
//    }
//
//    public void setCAT_NAME(String CAT_NAME) {
//        this.CAT_NAME = CAT_NAME;
//    }
//
//    public void setCAT_AGE(int CAT_AGE) {
//        this.CAT_AGE = CAT_AGE;
//    }

//Task3
    private String name;
    private int age;
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
