@Entity 
public class Course {
    @Data private String courseCode;
    @Data private String courseId;
    @Data private String title;

    // getters
    @Getter 
    public String getCourseCode() { return courseCode; }

    @Getter 
    public String getCOURSEId() { return courseId; }
}

