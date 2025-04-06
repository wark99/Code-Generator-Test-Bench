public class BaseController {
    private SomeService<?> service;

    public BaseController(SomeService<?> service) {
        this.service = service;
    }
    
    public List<SomeModel> getItemList() throws Exception {
        return (List<SomeModel>) service.getAll();
    }

    // Add other methods as needed
}

public class ListController extends BaseController {
    @Mock 
    private RESTController<?> controller;

    public ListController(RESTController<?> controller) {
        super(controller);
    }

    public List<SomeModel> getItems(String ...queryParameters) throws Exception {
        SomeService<?> service = super.service;
        return service.getItemList(...);
    }
    
    // Add other methods as needed
}

public class ModelController extends BaseController {
    @Mock 
    private SomeDAO<?> daos[]; // Mock for different DAO types

    public ModelController(SomeDAO<?> dao) {
        super(daos);
        this.dao = daos;
    }

    public SomeModel getItemById(String id, String name) throws Exception {
        SomeDAO<?> dao = super.dao;
        return ...;
    }
    
    // Add other methods as needed
}

