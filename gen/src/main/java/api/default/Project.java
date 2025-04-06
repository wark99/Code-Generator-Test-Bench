// Entity classes for nested relationships (e.g., Project to Task)
@Entity
public class Project extends Model<Project> {
    @EntityId(target = "id", column = "project_id")
    @Column(key = true, indexed = true)
    @PrimaryId
    Integer taskId;
    
    @Field(default = "text", column = "description")
    String description;

    // Other fields...
}

@Entity
public class Task extends Model<Task> {
    @EntityId(target = "task_id")
    @Column(key = true, indexed = true)
    @PrimaryId
    Integer projectId;
    
    // Other fields...
}

