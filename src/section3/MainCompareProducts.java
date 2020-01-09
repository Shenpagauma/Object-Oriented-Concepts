package section3;

import java.util.Scanner;

public class MainCompareProducts {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id = input.nextLong();
        System.out.println("Enter the product name");
        String productName = input.next();
        System.out.println("Enter the supplier name");
        String supplierName = input.next();
        Product obj = new Product(id, productName, supplierName);
        display(id, productName, supplierName);
        System.out.println("Enter the product id");
        Long id1 = input.nextLong();
        System.out.println("Enter the product name");
        String productName1 = input.next();
        System.out.println("Enter the supplier name");
        String supplierName1 = input.next();
        Product obj1 = new Product(id, productName, supplierName);
        display(id1, productName1, supplierName1);
        input.close();
        if (obj.equals(obj1)) {
            System.out.println("The two products are the same");
        } else {
            System.out.println("The two products are different ");

        }

    }

    public static void display(Long id2, String productName, String supplierName) {
        System.out.print(" Product Id :" + id2 + "\n");
        System.out.print("Product Name :" + productName + "\n");
        System.out.print("Supplier Name :" + supplierName + " \n");

    }

}
