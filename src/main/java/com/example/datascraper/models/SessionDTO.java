package com.example.datascraper.models;

import java.time.LocalDateTime;
import java.util.List;

public class SessionDTO {
    private Integer hash;
    private String institutionKey;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private Boolean approved;
    private List<Integer> newCourseKeys;
    private List<Integer> updatedCourseKeys;
    private List<Integer> newProgrammeKeys;
    private List<Integer> updatedProgrammeKeys;
    private List<Integer> newDescriptionKeys;
    private List<Integer> updatedDescriptionKeys;
    private List<Integer> newLecturerKeys;
    private List<Integer> updatedLecturerKeys;

    // Getters and Setters
}
