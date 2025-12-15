package org.example.tricky;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product
{
    private int productId;
    private String productName;
    private double productPrice;

    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
public class TopThreeMostExpensiveProduct {

    public static void main(String[] args) {

        List<Product> listOfProduct = new ArrayList<>();

        listOfProduct.add(new Product(1,"Tv",25000));
        listOfProduct.add(new Product(2,"Phone",35000));
        listOfProduct.add(new Product(3,"Laptop",67000));
        listOfProduct.add(new Product(4,"fan",800));
        listOfProduct.add(new Product(5,"cooler",20000));

        List<Product> topThreeExpensiveProduct = listOfProduct.stream().sorted(Comparator.comparing(Product::getProductPrice).reversed()).limit(3).collect(Collectors.toList());

        System.out.println(topThreeExpensiveProduct);
    }
}
