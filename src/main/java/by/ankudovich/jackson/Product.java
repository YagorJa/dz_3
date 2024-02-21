package by.ankudovich.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {
    @JsonProperty("price")
    private double price;
    @JsonProperty("type")
    private String type;
}
