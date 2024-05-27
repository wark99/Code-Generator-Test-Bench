package uni.testbench.gen;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class DecorationController {

    @GetMapping("/ping")
    public ResponseEntity<Ping> ping() {
        Ping response = new Ping("pong!");
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/auto_decoration")
    public ResponseEntity<Decoration> autoDecoration(@RequestParam("room_type") String roomType,
                                                     @RequestParam("style") String style,
                                                     @RequestParam("init_image") MultipartFile initImage) {
        // Implement autoDecoration logic here
    }

    @PostMapping("/retry_decoration")
    public ResponseEntity<RetryDecoration> retryDecoration(@RequestParam("img_id") String imgId) {
        // Implement retryDecoration logic here
    }

    @GetMapping("/get_decoration")
    public ResponseEntity<?> getDecoration(@RequestParam("img_id") String imgId,
                                           @RequestParam(value = "retry_id", required = false) Integer retryId) {
        // Implement getDecoration logic here
    }
}

import org.springframework.web.multipart.MultipartFile;

public class Ping {
    private String ping;

    public Ping(String ping) {
        this.ping = ping;
    }

    public String getPing() {
        return ping;
    }

    public void setPing(String ping) {
        this.ping = ping;
    }
}

public class Decoration {
    private String imgId;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }
}

public class RetryDecoration {
    private String imgId;
    private Integer retryId;

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public Integer getRetryId() {
        return retryId;
    }

    public void setRetryId(Integer retryId) {
        this.retryId = retryId;
    }
}

public class DecResult {
    private String decorations;
    private Integer status;

    public String getDecorations() {
        return decorations;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

public class DecNotDone {
    private String decorations;
    private Integer status;

    public String getDecorations() {
        return decorations;
    }

    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}

