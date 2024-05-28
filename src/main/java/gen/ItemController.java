package gen;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @PostMapping
    public void addItem(@RequestBody ItemInput itemInput) {
        // Logic to add a new item
    }

    @GetMapping
    public List<ItemInput> getAllItems() {
        // Logic to fetch all items
    }

    @GetMapping("/{productId}")
    public ItemInput getItemById(@PathVariable int productId) {
        // Logic to get an item by ID
    }

    @PutMapping("/{productId}")
    public void updateItem(@PathVariable int productId, @RequestBody ItemInput itemInput) {
        // Logic to update an existing item
    }

    @PatchMapping("/{productId}")
    public void updateItemPatch(@PathVariable int productId, @RequestBody ItemInput itemInput) {
        // Logic to update an existing item partially
    }

    @DeleteMapping("/{productId}")
    public void deleteItem(@PathVariable int productId) {
        // Logic to delete an item
    }
}

