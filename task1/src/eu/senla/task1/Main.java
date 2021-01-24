package eu.senla.task1;

public class Main {


    public static void main(String[] args) {
        Minor Vasiliy = new Minor("Vasiliy",27);
        String VasiliyName = Vasiliy.getName();
        int VasiliyAge = Vasiliy.getAge();

        System.out.println("Нового гостя зовут " + Vasiliy.getName());
        Vasiliy.setName("Andrey");
        System.out.println("Но оказалось его зовут " + Vasiliy.getName());

        System.out.println("А лет ему " + Vasiliy.getAge());
        Vasiliy.setAge(-100);


    }
}
