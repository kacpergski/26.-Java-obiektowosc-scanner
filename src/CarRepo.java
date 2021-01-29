public class CarRepo {

    Car [] cars;
    double distanceSummary=0;
    double fuelSummary;
    double avr;
    //= new Car[5];
//int index;
int index;

    public CarRepo(int size) {
        this.cars = new Car[size];
    }

    void add(Car car,  int index){


        cars[index] = car;
       distanceSummary = distanceSummary + cars[index].distance;
       fuelSummary = fuelSummary + cars[index].fuel;
       avr = fuelSummary*100/distanceSummary;
//        for (int i = 0; i < cars.length& cars[i] != null; i++) {
//            distanceSummary = distanceSummary + cars[i].distance;
//        }

            }


    void displayAll(){
            for (int i = 0; i < cars.length & cars[i] != null; i++) {
               cars[i].display();
                System.out.println("DistSum: " + distanceSummary);
                System.out.println("Avr: " +avr);
            }




    }
}
