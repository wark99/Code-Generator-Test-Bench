package gen;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/measurement-webhooks")
public class MeasurementWebhookController {

    @GetMapping
    public List<MeasurementWebhook> listMeasurementWebhooks() {
        // Implement your logic here to list all measurement webhooks
        return null;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MeasurementWebhook createMeasurementWebhook(@RequestBody MeasurementWebhookBase request) {
        // Implement your logic here to create a measurement webhook
        return null;
    }

    @GetMapping("/{id}")
    public MeasurementWebhook getMeasurementWebhook(@PathVariable String id) {
        // Implement your logic here to get a single measurement webhook
        return null;
    }

    @PostMapping("/{id}")
    public MeasurementWebhook updateMeasurementWebhook(@PathVariable String id, @RequestBody MeasurementWebhookBase request) {
        // Implement your logic here to update a measurement webhook
        return null;
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMeasurementWebhook(@PathVariable String id) {
        // Implement your logic here to delete a measurement webhook
    }

    @PostMapping("/{id}/test")
    public MeasurementWebhookTestResult testMeasurementWebhook(@PathVariable String id) {
        // Implement your logic here to test a measurement webhook
        return null;
    }
}
