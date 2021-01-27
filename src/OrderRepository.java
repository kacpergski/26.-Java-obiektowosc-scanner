public class OrderRepository {
    Order[] orders;
   int index = 0;
    public OrderRepository(int size) {
        this.orders = new Order[size];
    }
    void add(Order order){
        orders[index++] = order;

    }

    void displayAll(){
        for (int i = 0; i < orders.length& orders[i]!=null; i++) {
            System.out.println();
            orders[i].display();
        }
        
    }
}
