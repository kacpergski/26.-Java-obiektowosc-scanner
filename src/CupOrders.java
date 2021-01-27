import java.util.Scanner;

public class CupOrders {

    public static void main(String[] args) {
        OrderRepository orderRepository =  new OrderRepository(10);
        int option;
        do {
            System.out.println("---------------CUP ORDERS---------");
            System.out.println("1. Add order");
            System.out.println("2. All orders");
            System.out.println("3. Stop program");
            System.out.print("Choose option: ");
            Scanner scanner = new Scanner(System.in, "UTF-8");
            option = scanner.nextInt();
            scanner.nextLine();
            System.out.println(option);

            switch (option){
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Text: ");
                    String text = scanner.nextLine();
                    System.out.print("Quantity: ");
                    int quantity = scanner.nextInt();

                    Order  order = new Order(name, text, quantity);
                    orderRepository.add(order);

                    break;
                case 2:

                    orderRepository.displayAll();
                    break;
                case 3:
                    break;
            }


        }while (option!=3);

    }
}
