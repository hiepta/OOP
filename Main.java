import java.util.Scanner;

class Product{
    private double price;
    private int quanlity;

    public Product(double price, int quanlity){
        this.price = price;
        this.quanlity = quanlity;
    }

    public double totalPrice(){
         return price * quanlity;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        int quanlity;
        do{
            System.out.print("Nhập số lượng sản phẩm:");
            quanlity = scanner.nextInt();
            if(quanlity <=0){
                System.out.println("Nhập số lượng phải lớn hơn 0");
            }
        }while (quanlity<=0);

        Product product = new Product(price, quanlity);
        System.out.print("Giá của sản phẩm là: " + product.totalPrice());
        scanner.close();
    }
}