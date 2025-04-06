@Entity
public class User extends Eloquent {
    @Id
    public final String id;
    @ username
    public final String username;

    // Other fields...
}

@Entity
public class CartItem extends Eloquent {
    @Id
    public final String id;
    @User
    public final User user = relationship("CartItem.user");
    @Product
    public final Product product = relationship("CartItem.product");

    @List<CartItem>
    public final List<CartItem> items;

    // Other fields...
}

@Entity
public class Order extends Eloquent {
    @Id
    public final String id;
    @Date
    public final Date createdAt;
    @Card
    public final Card card = relationship("Order.card");
    
    // Other fields like shipped date, order total, etc.
}

