package eu.senla.task5.port.ships.deck.сontainer;

public class Box implements Container {
    private static final double BIG_DIAGONAL = 20;
    private static final double SMALL_DIAGONAL = 10;
    int i = 1;
    private int volume;

    public Box() {
    }

    public int getBox (){
        if (i == 1) {
            volume =  (int) Math.round(Math.pow((SMALL_DIAGONAL/(Math.sqrt(2))),3));
            System.out.print("volume smallBox = " + SMALL_DIAGONAL + "/ sqrt(2)");
        }
        else {
            volume =  (int) Math.pow((BIG_DIAGONAL/(Math.sqrt(2))),3);
            System.out.print("volume bigBox = " + BIG_DIAGONAL + "/ sqrt(2)");
        }
        return volume;
    }


    @Override
    public int creat() {
        return getBox();
    }
}
