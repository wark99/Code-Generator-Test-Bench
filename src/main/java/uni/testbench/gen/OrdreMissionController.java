package uni.testbench.gen;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/ordreMission")
public class OrdreMissionController {

    @PostMapping("/accepter")
    public ResponseEntity<Void> accepterOrdreMission(@RequestBody NumeroOM numeroOM) {
        // Implement accepterOrdreMission logic here
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/refuser")
    public ResponseEntity<Void> refuserOrdreMission(@RequestBody NumeroOMMotif numeroOMMotif) {
        // Implement refuserOrdreMission logic here
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{Numéro}")
    public ResponseEntity<OrdreMission> getOrdreMission(@PathVariable("Numéro") String numero) {
        // Implement getOrdreMission logic here
        return ResponseEntity.ok().body(new OrdreMission());
    }

    @PostMapping("/annuler")
    public ResponseEntity<Void> annulerOrdreMission(@RequestBody NumeroOMMotif numeroOMMotif) {
        // Implement annulerOrdreMission logic here
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/auditeur")
    public ResponseEntity<Void> associerAuditeur(@RequestBody NumeroOMEmail numeroOMEmail) {
        // Implement associerAuditeur logic here
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/planification")
    public ResponseEntity<Void> planifierOrdreMission(@RequestBody PlanificationOM planificationOM) {
        // Implement planifierOrdreMission logic here
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/planification/annuler")
    public ResponseEntity<Void> annulerPlanificationOrdreMission(@RequestBody NumeroOMMotif numeroOMMotif) {
        // Implement annulerPlanificationOrdreMission logic here
        return ResponseEntity.noContent().build();
    }
}
