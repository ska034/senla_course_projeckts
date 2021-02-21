package eu.senla.task5.port;

public class Port {

    int number;

    public  Port (int number) {
        this.number = number;

    }


    public void createPort() {
        int [] Port = new int[number];
        for (int i = 0; i < Port.length; i++){
            Port[i] = i+1;
            System.out.println(Port[i]);
        }
    }
}
