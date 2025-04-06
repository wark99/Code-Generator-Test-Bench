// Student interface
public interface Student {
    String name;
    Integer age;
    Integer university;
}

// Student entity model annotated with JPA
@priorknowledgeonly
public class Student extends Model implements Serializable {

    @Entity
    public static final Student entity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", primaryKey = true)
    private String name;

    @Column(name = "age", precision = "INTEGER(3)", nullable = false)
    private Integer age;

    @Column(name = "university", size = 50, unique = true)
    private String university;
}

