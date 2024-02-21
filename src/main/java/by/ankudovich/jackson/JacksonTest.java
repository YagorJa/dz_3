package by.ankudovich.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class JacksonTest {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            OrderObertka orderWrapper = objectMapper.readValue(new File("C:\\Users\\Yagor\\OneDrive\\Рабочий стол\\курсы\\Файлы\\gesoncjik.json"),
                    OrderObertka.class);
            Order order = orderWrapper.getOrder();
            System.out.println("Date: " + order.getDate());
            System.out.println("Name: " + order.getName());
            List<Product> products = order.getProduct();
            for (Product product : products) {
                System.out.println("Product: " + product.getType() + ", Price: " + product.getPrice());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
