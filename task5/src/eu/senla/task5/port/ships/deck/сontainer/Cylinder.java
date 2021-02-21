package eu.senla.task5.port.ships.deck.сontainer;

public class Cylinder implements Container {

    private static final double PI = 3.1415926535;
    private static final double BIG_DIAMETER= 20;
    private static final double SMALL_DIAMETER = 10;
    private int height, volume;
    int i = 1;


    public Cylinder(){
    }

    public int getCylinder() {
        do{
            height = (int) Math.round(Math.random()*100);
        } while (height < 10);

        if (i == 1) {
            volume = (int) Math.round(PI * Math.pow(SMALL_DIAMETER/2,2) * height);
            System.out.print("volume smallCylinder = 3.14159 * " + SMALL_DIAMETER/2 + " * " + SMALL_DIAMETER/2 + " * " + height + " = ");
        }
        else {
            volume = (int) Math.round(PI * Math.pow(BIG_DIAMETER/2,2) * height);
            System.out.print("volume bigCylinder = 3.14159 * " + BIG_DIAMETER/2 + " * " + BIG_DIAMETER/2 + " * " + height + " = ");
        }

        return volume;
    }


    @Override
    public int creat() {
        return getCylinder();
    }
}
