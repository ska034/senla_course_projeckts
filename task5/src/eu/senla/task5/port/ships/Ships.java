package eu.senla.task5.port.ships;

public class Ships {
    private int size,i;

    public Ships (int size) {
        this.size = size;
    }

    public int getShip(){
        if (size == 1){
           i = 123;
        }
        else {
            i = 333;
        }
        return i;
    }


}
