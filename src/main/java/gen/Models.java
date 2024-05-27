package gen;

import java.util.List;

public class Cart {
    private UUID uuid;
    private List<CartItem> products;

    // Getters and setters
}

public class Folder {
    private int id;
    private String name;
    private List<Folder> children;

    // Getters and setters
}

public class Order {
    private UUID uuid;
    private String email;
    private String phone;
    private List<Product> products;

    // Getters and setters
}

public class Product {
    private int id;
    private String name;
    private String description;
    private String slug;
    private int folder_id;
    private double price;
    private double length;
    private double width;
    private double height;
    private double weight;

    // Getters and setters
}

