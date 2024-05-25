package gen;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthenticationApiController {

    @PostMapping
    public void getJwtToken(@RequestBody List<String> scopes) {
        // Implement your logic here
    }
}

@RestController
@RequestMapping("/gateway")
public class CommunicationGatewayApiController {

    @GetMapping
    public void getCommunicationGateways(@RequestParam(defaultValue = "0") int pageNumber,
                                         @RequestParam(defaultValue = "25") int pageSize,
                                         @RequestParam(required = false) String friendlyName,
                                         @RequestParam(required = false) String endpointUrl) {
        // Implement your logic here
    }

    @PostMapping
    public void createCommunicationGateway(@RequestBody CreateCommunicationGateway request) {
        // Implement your logic here
    }

    @PutMapping
    public void updateCommunicationGateway(@RequestBody CommunicationGateway request) {
        // Implement your logic here
    }

    @GetMapping("/{gatewayId}")
    public void getCommunicationGatewayById(@PathVariable String gatewayId) {
        // Implement your logic here
    }

    @DeleteMapping("/{gatewayId}")
    public void deleteCommunicationGateway(@PathVariable String gatewayId) {
        // Implement your logic here
    }
}

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

@RestController
@RequestMapping("/preferences")
public class PreferencesApiController {

    @GetMapping("/retry-policy")
    public void getRetryPolicy() {
        // Implement your logic here
    }

    @PutMapping("/retry-policy")
    public void updateRetryPolicy(@RequestBody RetryPolicy request) {
        // Implement your logic here
    }
}

@RestController
@RequestMapping("/history")
public class HistoryApiController {

    @GetMapping
    public void getPreviousCommunications(@RequestParam(defaultValue = "0") int pageNumber,
                                          @RequestParam(defaultValue = "0") int status,
                                          @RequestParam(required = false) Integer userId,
                                          @RequestParam(required = false) Integer gatewayId,
                                          @RequestParam(defaultValue = "50") int pageSize) {
        // Implement your logic here
    }

    @GetMapping("/total")
    public void getCommunicationWorkflowTotalByQuery(@RequestParam(defaultValue = "0") int status,
                                                     @RequestParam(required = false) Integer userId,
                                                     @RequestParam(required = false) Integer gatewayId) {
        // Implement your logic here
    }

    @GetMapping("/workflowId/{workflowId}")
    public void getCommunicationWorkflowById(@PathVariable String workflowId) {
        // Implement your logic here
    }
}

