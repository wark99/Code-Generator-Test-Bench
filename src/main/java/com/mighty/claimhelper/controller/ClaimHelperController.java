package com.mighty.claimhelper.controller;

import com.mighty.claimhelper.model.SessionRequest;
import com.mighty.claimhelper.model.UserResponseRequest;
import com.mighty.claimhelper.model.FeedbackRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ClaimHelperController {

    @PostMapping("/initialize")
    public String initialize(@RequestBody SessionRequest request) {
        // Implementation logic
        return "Initial greeting and preliminary questions.";
    }

    @PostMapping("/consent-verification")
    public String consentVerification(@RequestBody UserResponseRequest request) {
        // Implementation logic
        return "Confirmation of consent verification.";
    }

    @PostMapping("/consent-confirmation-disclaimer")
    public String consentConfirmationDisclaimer(@RequestBody UserResponseRequest request) {
        // Implementation logic
        return "Confirmation of user's understanding and consent.";
    }

    @PostMapping("/basic-user-info")
    public String basicUserInfo(@RequestBody SessionRequest request) {
        // Implementation logic
        return "Request for basic user information.";
    }

    @PostMapping("/case-specific-queries")
    public String caseSpecificQueries(@RequestBody SessionRequest request) {
        // Implementation logic
        return "Case-specific queries and potential off-ramp scenarios.";
    }

    @PostMapping("/follow-up-questions")
    public String followUpQuestions(@RequestBody UserResponseRequest request) {
        // Implementation logic
        return "Follow-up questions for clarity and completeness.";
    }

    @GetMapping("/business-hours-notification")
    public String businessHoursNotification() {
        // Implementation logic
        return "Business hours information.";
    }

    @PostMapping("/end-interaction")
    public String endInteraction(@RequestBody SessionRequest request) {
        // Implementation logic
        return "Thank you message and interaction conclusion.";
    }

    @PostMapping("/feedback-collection")
    public String feedbackCollection(@RequestBody FeedbackRequest request) {
        // Implementation logic
        return "Acknowledgement of feedback and appreciation.";
    }
}
