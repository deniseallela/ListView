package com.example.allela.listme;

public class Custom {
    int images;
    String item,price;
    //generate constructor to initialize values

    public Custom(int images, String item, String price) {
        this.images = images;
        this.item = item;
        this.price = price;
    }
    //generate a getter to fetch the values

    public int getImages() {
        return images;
    }

    public String getItem() {
        return item;
    }

    public String getPrice() {
        return price;
    }
}
