public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

    @Override
    public List<Employee> findAll() {
        // Implement business logic to retrieve all employees
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        // Implement business logic to retrieve an employee by ID
        return employeeRepository.findById(id).orElse(null);
    }
}

