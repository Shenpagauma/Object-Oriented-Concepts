package section3;

import java.util.Scanner;

public class MainProductClass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product id");
        Long id=sc.nextLong();
        System.out.println("Enter the product name");
        String productName=sc.next();
        System.out.println("Enter the supplier name\n");
        String supplierName=sc.next();
        ProductClass obj=new ProductClass(id,productName,supplierName);
        System.out.println(obj);
        System.out.println("Invoking getClass() method : class "+ obj.getClass().getSimpleName());
        sc.close();

    }

}
