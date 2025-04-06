import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest 
public class CourseTest {

    @BeforeEach
    void setUp() {
        courseMapper = new CourseMapper();
    }

    @Test 
    public void testGetByCourseCode_ShouldReturnCorrectCourse() {
        User user = mapper.getUserById(1);
        User enrolledStudent = user.getStudentById(2);
        Student student = mapper.createUserById(3);

        // Implementation to create courses and students if needed
        Course course = courseMapper.getCourse(9001, enrolledStudent.getId(), "Introduction to Java");
        
        assertEquals("9001", course.getCOURSECode());
        assertEquals(null, course.getEnrolledStudent()); // Enrolled student may not be set yet
    }

    @Test 
    public void testGetByCourseCode_WhenStudentNotEnrolled() {
        User user = mapper.getUserById(4);
        Student student = mapper.createUserById(5);

        Course course = courseMapper.getCourse(9002, null, "Advanced Topics");
        
        assertTrue(course.getEnrolledStudent() == null);
    }

    @Test 
    public void testCreateCourse_ShouldReturnNewCourseWithCorrectAttributes() {
        User user = mapper.getUserById(6);
        Student student = mapper.createUserById(7);

        // Implementation to create courses and students if needed
        Course course = courseMapper.createCourse(null, null, "Practice Java");
        
        assertNotNull(course);
        assertEquals("Practice Java", course.getTitle());
    }
}

