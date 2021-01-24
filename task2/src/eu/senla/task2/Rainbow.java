package eu.senla.task2;

public class Rainbow {
    private double numberColor;

    public Rainbow (double numberColor){
        this.numberColor = numberColor;
    }

        public double getNumberColor() {
            return numberColor;
        }

        public void setNumberColor(double numberColor) {
            if (numberColor % 1 == 0) {
                if (numberColor > 0 & numberColor < 8) {
                    String[] Color = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
                    System.out.println(Color[(int)numberColor - 1]);
                }
                else {
                    System.out.println("Not found color");
                }
            }
            else if (numberColor > 1 & numberColor < 2){
                System.out.println("Red_Orange");
            }
            else if (numberColor > 2 & numberColor < 3){
                System.out.println("Orange_Yellow");
            }
            else if (numberColor > 3 & numberColor < 4){
                System.out.println("Yellow_Green");
            }
            else if (numberColor > 4 & numberColor < 5){
                System.out.println("Green_Blue");
            }
            else if (numberColor > 5 & numberColor < 6){
                System.out.println("Blue_Indigo");
            }
            else if (numberColor > 6 & numberColor < 7){
                System.out.println("Indigo_Violet");
            }
            else {
                System.out.println("Not found color");
            }

// Другой вариант через switch

//            switch (numberColor) {
//                case 1:
//                    System.out.println("Red");
//                    break;
//                case 12:
//                case 21:
//                    System.out.println("Red_Orange");
//                    break;
//                case 2:
//                    System.out.println("Orange");
//                    break;
//                case 23:
//                case 32:
//                    System.out.println("Orange_Yellow");
//                    break;
//                case 3:
//                    System.out.println("Yellow");
//                    break;
//                case 34:
//                case 43:
//                    System.out.println("Yellow_Green");
//                    break;
//                case 4:
//                    System.out.println("Green");
//                    break;
//                case 45:
//                case 54:
//                    System.out.println("Green_Blue");
//                    break;
//                case 5:
//                    System.out.println("Blue");
//                    break;
//                case 56:
//                case 65:
//                    System.out.println("Blue_Indigo");
//                    break;
//                case 6:
//                    System.out.println("Indigo");
//                    break;
//                case 67:
//                case 76:
//                    System.out.println("Indigo_Violet");
//                    break;
//                case 7:
//                    System.out.println("Violet");
//                    break;
//                default:
//                    System.out.println("Not found color");
//            }
        }

}
