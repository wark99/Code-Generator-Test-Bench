package uni.testbench.gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DripController {

    @PostMapping("/checkouts")
    public ResponseEntity<Checkout> createCheckout(@RequestBody CheckoutCreationParams checkoutCreationParams) {
        // Implementation logic here
        return ResponseEntity.status(HttpStatus.CREATED).body(new Checkout());
    }

    @GetMapping("/checkouts/{id}")
    public ResponseEntity<Checkout> getCheckoutById(@PathVariable String id) {
        // Implementation logic here
        return ResponseEntity.ok().body(new Checkout());
    }

    @GetMapping("/merchant/orders/{id}/detail")
    public ResponseEntity<Order> getOrderDetailById(@PathVariable String id) {
        // Implementation logic here
        return ResponseEntity.ok().body(new Order());
    }

    @GetMapping("/merchants/get_cnpj")
    public ResponseEntity<Object> getCnpj() {
        // Implementation logic here
        return ResponseEntity.ok().body("{\"cnpj\":\"17645766000126\"}");
    }

    @GetMapping("/instalments_simulator")
    public ResponseEntity<InstalmentsSimulator> simulateInstalments(@RequestParam String amount, @RequestParam String date) {
        // Implementation logic here
        return ResponseEntity.ok().body(new InstalmentsSimulator());
    }

    @PutMapping("/cancellation/{id}")
    public ResponseEntity<Void> cancelOrder(@PathVariable String id, @RequestBody CancellationParams cancellationParams) {
        // Implementation logic here
        return ResponseEntity.noContent().build();
    }
}