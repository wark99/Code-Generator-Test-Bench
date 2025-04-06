import com.herecleus.dto.*;
import com.herecleus.model.*;

public class OrderController implements RESTController {

    @GET("/orders")
    public List<Order> index() {
        return new List<>();
    }

    @POST("/orders")
    public void save(Order order) throws JsonObjectException, UnsupportedMediaTypeException {
        // Implementation
    }

    @GET("/orders")
    public List<Order> retrieve(...) { ... } 

    // ... other methods remain unchanged

    @DELETE("/orders/{id}")
    public Order deleteOrder(final int id) throws IOException {

        // Find the corresponding order using its ID
        final Order order = select orders.id = :id and fetch orders as order;

        if (order == null) {
            throw new NotFoundException("Order not found with id: " + id);
        }

        // Delete all details associated with this order
        delete order_details where order_id = :orderid;
    }
}

