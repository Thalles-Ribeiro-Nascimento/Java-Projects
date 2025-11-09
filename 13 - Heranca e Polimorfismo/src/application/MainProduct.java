package application;

import entities.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainProduct {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> listProduct = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        int n;

        System.out.print("Enter the number of products: ");
        n = sc.nextInt();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.printf("Product #%d data:%n", i + 1);
            System.out.print("Common, used or imported (c/u/i)? ");
            char op = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            sc.nextLine();
            switch (op){
                case 'c':
                    listProduct.add(new Product(nome, price));
                    break;

                case 'i':
                    System.out.print("Customs fee: ");
                    double customsFee = sc.nextDouble();
                    listProduct.add(new ImportedProduct(nome, price, customsFee));
                    sc.nextLine();
                    break;

                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    Date date = simpleDateFormat.parse(sc.nextLine());
                    listProduct.add(new UsedProduct(nome, price, date));
                    break;
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS:");

        for(Product produtos : listProduct){
            System.out.println(produtos.priceTag());
        }


        sc.close();

    }

}
