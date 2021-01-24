package eu.senla.task1;

public class Minor {
     private String name;
     private int age;
     private byte b;
     private double d;
     private char c;
     private boolean boo;


    public Minor(String name, int age) {
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
        if (age >=0){
            this.age = age;
        } else {
            System.out.println("Ошибка, вы пытались записать недопустимый возраст: " + age );
        }
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }

        public static void main(String[] args) {
        Minor Oleg = new Minor("Oleg", 23);
        Minor Nikita = new Minor("Nikita", 30);

        System.out.println("Мы записали гостя с именем " + Oleg.name + " и его возраст " + Oleg.age);
        System.out.println("Мы записали гостя с именем "  + Nikita.name + " и его возраст " + Nikita.age);

    }
}
