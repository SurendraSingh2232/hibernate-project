package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Products")

public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "Product_Name")
    private String productName;

    @Column(name = "Product_Type")
    private  String productType;

    @Column(name = "Product_Colour")
    private String productColour;

    @Column(name = "Product_Brand")
    private String productBrand;

    public Product(){}

    public Product(Long id, String productName, String productType, String productColour, String productBrand) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.productColour = productColour;
        this.productBrand = productBrand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductColour() {
        return productColour;
    }

    public void setProductColour(String productColour) {
        this.productColour = productColour;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id) && Objects.equals(productName, product.productName) && Objects.equals(productType, product.productType) && Objects.equals(productColour, product.productColour) && Objects.equals(productBrand, product.productBrand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productName, productType, productColour, productBrand);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productType='" + productType + '\'' +
                ", productColour='" + productColour + '\'' +
                ", productBrand='" + productBrand + '\'' +
                '}';
    }
}
