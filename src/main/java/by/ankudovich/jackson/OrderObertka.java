package by.ankudovich.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderObertka {
    @JsonProperty("order")
    private Order order;
}
