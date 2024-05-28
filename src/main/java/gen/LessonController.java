package gen;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
