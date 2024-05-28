package gen;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class ScheduleApiController {

    @PostMapping
    public void createCommunicationSchedule(@RequestBody CreateCommunicationSchedule request) {
        // Implement your logic here
    }

    @PutMapping
    public void updateCommunicationSchedule(@RequestBody CreateCommunicationSchedule request) {
        // Implement your logic here
    }

    @GetMapping
    public void getCommunicationSchedules(@RequestParam(defaultValue = "0") int pageNumber,
                                          @RequestParam(defaultValue = "50") int pageSize) {
        // Implement your logic here
    }

    @DeleteMapping("/{scheduleId}")
    public void deleteCommunicationSchedule(@PathVariable String scheduleId) {
        // Implement your logic here
    }

    @GetMapping("/{scheduleId}")
    public void getCommunicationSchedulesByScheduleId(@PathVariable String scheduleId) {
        // Implement your logic here
    }

    @GetMapping("/gateway/{gatewayId}")
    public void getCommunicationSchedulesByGatewayId(@PathVariable String gatewayId,
                                                     @RequestParam(defaultValue = "0") int pageNumber,
                                                     @RequestParam(defaultValue = "50") int pageSize) {
        // Implement your logic here
    }

    @DeleteMapping("/gateway/{gatewayId}")
    public void deleteCommunicationSchedulesByGatewayId(@PathVariable String gatewayId) {
        // Implement your logic here
    }

    @PutMapping("/gateway/{gatewayId}")
    public void updateCommunicationSchedulesByGatewayId(@PathVariable String gatewayId,
                                                        @RequestBody Object request) {
        // Implement your logic here
    }

    @GetMapping("/user/{userId}")
    public void getCommunicationSchedulesByUserId(@PathVariable String userId,
                                                  @RequestParam(defaultValue = "0") int pageNumber,
                                                  @RequestParam(defaultValue = "50") int pageSize) {
        // Implement your logic here
    }

    @DeleteMapping("/user/{userId}")
    public void deleteCommunicationSchedulesByUserId(@PathVariable String userId) {
        // Implement your logic here
    }

    @PutMapping("/user/{userId}")
    public void updateCommunicationSchedulesByUserId(@PathVariable String userId,
                                                     @RequestBody Object request) {
        // Implement your logic here
    }
}
