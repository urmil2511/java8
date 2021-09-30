package org.HomeTask2;

import lombok.Data;

@Data
public class Product {
    String name;
    int price;
    String category;
    String grade;

    public Product(String name, int price, String category, String grade) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.grade = grade;
    }


    public Product() {

    }
}
