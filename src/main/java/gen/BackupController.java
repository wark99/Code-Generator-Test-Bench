package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/backup")
public class BackupController {

    @PostMapping("/user/list")
    public ResponseEntity<UsersResponse> getUsersList(@RequestBody RequestUserParameters parameters) {
        // Your logic to get list of users
        return ResponseEntity.ok(new UsersResponse(1, 0, 0, List.of()));
    }

    @PostMapping("/profile/list")
    public ResponseEntity<UsersResponse> getProfilesList(@RequestBody RequestProfileParameters parameters) {
        // Your logic to get list of profiles
        return ResponseEntity.ok(new UsersResponse(1, 0, 0, List.of()));
    }

    @PostMapping("/item/list")
    public ResponseEntity<UsersResponse> getSavesList(@RequestBody RequestItemParameters parameters) {
        // Your logic to get list of saves
        return ResponseEntity.ok(new UsersResponse(1, 0, 0, List.of()));
    }

    @PostMapping("/item/delete")
    public ResponseEntity<Object> deleteSave(@RequestBody RestoreDeleteParameters parameters) {
        // Your logic to delete save
        return ResponseEntity.ok().build();
    }

    @PostMapping("/item/restore")
    public ResponseEntity<RestoreResponse> restoreSave(@RequestBody RestoreDeleteParameters parameters) {
        // Your logic to restore save
        return ResponseEntity.ok(new RestoreResponse(""));
    }
}
