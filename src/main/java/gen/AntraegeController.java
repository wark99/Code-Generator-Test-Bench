package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kitafinder/antraege")
public class AntraegeController {

    @PostMapping("/fristablauf")
    public ResponseEntity<Void> fristablauf(@RequestBody Fristablauf request) {
        // Handle request
        return ResponseEntity.ok().build();
    }

    @PostMapping("/regelsatz")
    public ResponseEntity<Void> createRegelsatz(@RequestBody AntragRegelsatz request) {
        // Handle request
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/ermaessigungselbsteinschaetzung")
    public ResponseEntity<Void> createErmSelbsteinschaetzung(@RequestBody AntragErmSelbsteinschaetzung request) {
        // Handle request
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/ermaessigungmitbelegen")
    public ResponseEntity<Void> createErmMitBelegen(@RequestBody AntragErmMitBelegen request) {
        // Handle request
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/unterlageneingang")
    public ResponseEntity<Void> unterlageneingang(@RequestBody AntragUnterlagenEingang request) {
        // Handle request
        return ResponseEntity.ok().build();
    }

    @PostMapping("/unterlagenfristgesetzt")
    public ResponseEntity<Void> unterlagenfristgesetzt(@RequestBody AntragUnterlagenfristGesetzt request) {
        // Handle request
        return ResponseEntity.ok().build();
    }
}
