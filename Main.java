import java.util.Scanner;

class Product{
    private double price;
    private double quantity;

    public Product(double price, double quantity){
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }
    public double getPrice(){
        return price;
    }

    public double getQuantity(){
        return quantity;
    }

    public double totalPrice(){
         return price * quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("The price of the product is: ");
        double price = scanner.nextDouble();

        double quantity;
        // Kiểm tra điều kiện của quantity;
        do{
            System.out.print("The quantity of the product is: ");
            quantity = scanner.nextDouble();
            if(quantity <=0){
                System.out.println("Quantity must be greater than 0");
            }
        }while (quantity<=0);
        // Hàm khởi tạo product
        Product product = new Product(price, quantity);
        System.out.print("Total: " + product.totalPrice() + " VND");
        scanner.close();
    }
}