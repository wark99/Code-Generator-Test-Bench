@RestController 
public class CourseController {

    @Autowired
    private CourseCourseMapper courseMapper;

    @GetMapping("/courses/{id}")
    public Course getCourse(int id) {
        // Implementation to fetch the course from the database
    }

    @PostMapping
    public void createCourse(@RequestBody Course course) {
        // Implementation to save the course in the database
    }
}

