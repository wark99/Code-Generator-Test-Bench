package gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    // Assuming UserService is a service class handling User operations
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}

@RestController
@RequestMapping("/api")
public class LessonController {

    // Assuming LessonService is a service class handling Lesson operations
    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping("/lessons/{id}")
    public ResponseEntity<Lesson> getLessonById(@PathVariable("id") Long id) {
        Lesson lesson = lessonService.getLessonById(id);
        return new ResponseEntity<>(lesson, HttpStatus.OK);
    }

    @PostMapping("/lessons")
    public ResponseEntity<Lesson> addLesson(@RequestBody Lesson lesson) {
        Lesson newLesson = lessonService.addLesson(lesson);
        return new ResponseEntity<>(newLesson, HttpStatus.OK);
    }

    @PostMapping("/lessons/{id}/evaluations")
    public ResponseEntity<Evaluation> addEvaluation(@PathVariable("id") Long lessonId, @RequestBody Evaluation evaluation) {
        Evaluation newEvaluation = lessonService.addEvaluation(lessonId, evaluation);
        return new ResponseEntity<>(newEvaluation, HttpStatus.OK);
    }
}

public class User {
    private Long id;
    private String name;
    private Integer age;

    // getters and setters
}

public class Lesson {
    private Long id;
    private String subject;
    private String date;

    // getters and setters
}

public class Evaluation {
    private Long id;
    private Long userId;
    private Long lessonId;
    private Integer grade;

    // getters and setters
}

