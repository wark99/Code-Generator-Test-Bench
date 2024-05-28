package gen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
