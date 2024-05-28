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
