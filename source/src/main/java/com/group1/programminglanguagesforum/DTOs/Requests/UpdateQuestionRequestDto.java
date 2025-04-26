package com.group1.programminglanguagesforum.DTOs.Requests;

import com.group1.programminglanguagesforum.Entities.DifficultyLevel;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateQuestionRequestDto {
    private String title;
    private String content;
    private List<Long> tags;
    private DifficultyLevel difficulty;
}
