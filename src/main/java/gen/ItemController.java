package gen;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @PostMapping
    public void createItem(@RequestBody Item item) {
        // Implementation for creating a new item
    }

    @GetMapping
    public List<Item> getItems() {
        // Implementation for getting all items
        return null;
    }

    @GetMapping("/{itemId}")
    public Item getItemById(@PathVariable int itemId) {
        // Implementation for getting item by ID
        return null;
    }

    @PutMapping("/{itemId}")
    public void updateItem(@PathVariable int itemId, @RequestBody Item item) {
        // Implementation for updating an item
    }

    @DeleteMapping("/{itemId}")
    public void deleteItem(@PathVariable int itemId) {
        // Implementation for deleting an item
    }
}
