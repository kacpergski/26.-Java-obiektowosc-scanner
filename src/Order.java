public class Order {
    String name;
    String text;
    int quantity;

   Order(String name, String text, int quantity) {
        this.name = name;
        this.text = text;
        this.quantity = quantity;
    }

    void display(){
        System.out.println(name +"|"+ text + " " + quantity);
       // System.out.println("Text: " + text);
       //1 System.out.println("Quantity: " + quantity);
    }
}
