package com.example.gatewayapi.models;

import java.util.UUID;

public class GatewayBody {

    private String userId;
    private UUID workflowRunId;

    // Getters and Setters

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UUID getWorkflowRunId() {
        return workflowRunId;
    }

    public void setWorkflowRunId(UUID workflowRunId) {
        this.workflowRunId = workflowRunId;
    }
}
