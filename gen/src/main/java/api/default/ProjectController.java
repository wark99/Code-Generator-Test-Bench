// REST controller with service-oriented methods
@RestController(SWAG, @RequestMapping("/api/tasks"))
public class ProjectController {
    public List<Task> getAllTasks() {
        // Fetch data from database and return as list of Tasks
    }
    
    public void deleteTask(@RequestBody Task task) {
        // Remove a specific Task by ID
    }
}

