package com.alpha.cart.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import javax.persistence.Column;
import java.util.*;

@Table
public class Item {

    @PrimaryKey
    @Column(name = "item_id")
    private String item_id;

    @Column(name = "productcode")
    private String productCode;

    @Column(name = "group")
    private String group;

    @Column(name = "category")
    private String category;

    @Column(name = "name")
    private String name;

    @Column(name="brand")
    private String brand;

    @Column(name="color")
    private String color;

    @Column(name="size")
    private Set<String> size;

    @Column(name="price")
    private Float price;

    @Column(name="description")
    private Map<String,String> description;

    @Column(name = "details")
    private Set<String> details;

    public Item (String item_id, String productCode, String group, String category, String name, String brand, String color, Set<String> size, Float price, Map<String,String> description, Set<String> details ) {
        this.item_id = item_id;
        this.productCode = productCode;
        this.group = group;
        this.category= category;
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.description = description;
        this.details = details;
    }


    public String getId() {
        return item_id;
    }

    public void setId(String id) {
        this.item_id = item_id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Set<String> getSize() {
        return size;
    }

    public void setSize(Set<String> size) {
        this.size = size;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Map<String,String> getDescription() {
        return description;
    }

    public void setDescription(Map<String,String> description) {
        this.description = description;
    }

    public Set<String> getDetails() {
        return details;
    }

    public void setDetails(Set<String> id) {
        this.details = details;
    }


    @Override
    public String toString() {
        return "Item{" +
                "item_id=" + item_id +
                ", productCode='" + productCode + '\'' +
                ", group='" + group + '\'' +
                ", category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
