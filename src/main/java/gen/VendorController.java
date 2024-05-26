package gen;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/vendor")
public class VendorController {

    @GetMapping
    public List<Vendor> getAllVendors() {
        // Logic to fetch all vendors
    }

    @PostMapping
    public Vendor createVendor(@RequestBody Vendor vendor) {
        // Logic to create a new vendor
    }

    @GetMapping("/{vendorId}")
    public Vendor getVendorById(@PathVariable int vendorId) {
        // Logic to get a vendor by ID
    }

    @PutMapping("/{vendorId}")
    public void updateVendor(@PathVariable int vendorId, @RequestBody Vendor vendor) {
        // Logic to update an existing vendor
    }

    @PatchMapping("/{vendorId}")
    public void partialUpdateVendor(@PathVariable int vendorId, @RequestBody Vendor vendor) {
        // Logic to update an existing vendor partially
    }

    @DeleteMapping("/{vendorId}")
    public void deleteVendor(@PathVariable int vendorId) {
        // Logic to delete a vendor
    }
}

