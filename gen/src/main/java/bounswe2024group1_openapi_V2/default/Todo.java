@Entity
public interface Todo {
    String title;
    String description;
    int priority;

    // Optional fields like tags can be added here if needed.
}

@Entity
public class TodoList extends List<Todo> {}

