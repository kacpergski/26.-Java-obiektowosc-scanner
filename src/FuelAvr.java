import java.util.Scanner;

public class FuelAvr {
    public static void main(String[] args) {
         CarRepo cars = new CarRepo(5);

        System.out.println("Wybierz opscję");
        System.out.println( "1. Dodaj wpis:");
        System.out.println("2. Wyświetl średnią spalania");
        System.out.println("3. Zakończ program");
        System.out.print("Choose option: ");
        int option;
        int index=0;
        do {
       Scanner scanner = new Scanner(System.in,"UTF-8");
       option = scanner.nextInt();

            switch (option){
                case 1:
                if (index<5){

                        System.out.print("Distance: ");
                        int distance = scanner.nextInt();
                        System.out.print("Fuel in liters: ");
                        int fuel = scanner.nextInt();

                        Car car = new Car(distance, fuel);

                        cars.add(car, index);

                        System.out.println("index= " + index);
                        index++;}

                     else index=0;
                        break;


                case 2:

                cars.displayAll();
                    break;
                case 3:
                    break;
            }

        }while (option!=3);
    }
}
