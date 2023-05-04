package Folder;

import java.math.BigDecimal;

public class Cars {
    private String brand;
    private BigDecimal price;

    public Cars(String brand, BigDecimal price){
        this.brand = brand;
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Cars{" + "brand='" + brand + '\'' + ", price=" + price + '}';
    }
    
    public boolean equals(Object obj) {};
}
