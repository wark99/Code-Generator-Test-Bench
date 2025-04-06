@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public ResponseEntity<Employee> createEmployee(Employee employee) {
        // Implement business logic to save the employee
        Employee savedEmployee = employeeRepository.save(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }

    public ResponseEntity<Employee> getEmployeeById(Integer employeeId) {
        // Implement business logic to retrieve an employee by ID
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        if (employee == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(employee);
    }
}

