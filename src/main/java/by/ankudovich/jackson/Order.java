package by.ankudovich.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
public class Order {

    @JsonProperty("@date")
    private String date;
    @JsonProperty("@name")
    private String name;
    @JsonProperty("product")
    private List <Product> product;
}
