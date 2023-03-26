import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Tea",10,1);
        products[1] = new Product("Milk",12,1);
        products[2] = new Product("Coffee",15,1);
        System.out.println("Menu");
        System.out.println("1. Sort name increase");
        System.out.println("2. Sort price increase");
        System.out.println("3. Sort default");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            if (choice == 1){
                NameComparator nameComparator = new NameComparator();
                Arrays.sort(products, nameComparator);
                for(Product product: products) {
                    System.out.println(product);
                }
            } else if (choice == 2) {
                Arrays.sort(products, new PriceComparator());
                for(Product product: products){
                    System.out.println(product);
                }
            } else if (choice == 3){
                for (Product product: products){
                    System.out.println(product);
                }
            }
        } while (choice!=1&&choice!=2&&choice!=3);

    }
}