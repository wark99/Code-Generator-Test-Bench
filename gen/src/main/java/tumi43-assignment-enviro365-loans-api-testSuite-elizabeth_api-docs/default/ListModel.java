public abstract class BaseModel implements Serializable, HasId, Identified {
    @Override 
    public Integer getId() throws NotIdentifiedException;
    
    // Other model-specific methods...
}

public class ListModel extends BaseModel {
    private final List<ItemModel> items = new ArrayList<>();

    public List<ItemModel> getAllItems() {
        return items.toArray(new ItemModel[0]);
    }
    
    // Other list-related methods...
}

public class ItemModel implements Identified, Serializable {
    @Override 
    public boolean equals(Object obj) throws NotIdentifiedException;
    
    private final String name;

    public String getName() { ... }
}

