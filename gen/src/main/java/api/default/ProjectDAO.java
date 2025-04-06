// DAO class using POJO mapper
@Service
public class ProjectDAO {
    @EntityMap POJO = projectMapper

    @Transactional
    public List<POJO> findAll();
    
    // Other methods...
}

// POJO mapper configuration file (not part of Java class)
@ProjectMapper("com.example:EntityToSQL:projectMapper")
private static final Map<Class, String> entityToSqlMap = new HashMap<>();

