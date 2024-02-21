package by.ankudovich.model;

import jakarta.xml.bind.annotation.XmlAttribute;
import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Data
public class Store {
    private String name;
    private List<Product> products;

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "product")
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}