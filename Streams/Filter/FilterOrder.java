package Streams.Filter;

import java.util.Arrays;
import java.util.List;

import Streams.Structure.Item;
import Streams.Structure.Order;

public class FilterOrder {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order(Arrays.asList(new Item("Laptop", 10000), new Item("Mouse",400))),
            new Order(Arrays.asList(new Item("Charger", 1000), new Item("Phone", 30000))),
            new Order(Arrays.asList(new Item("Headset", 30), new Item("Webcam", 25)))
            );
    

            orders.stream()
            .filter(order -> order.getItems()
            .stream()
            .anyMatch(item -> item.getPrice() > 500))  
            .forEach(order -> order.getItems()
            .forEach(item -> System.out.println(item.getPrice())));
           
    }

}
