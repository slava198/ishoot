package by.vyun.ishoot.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum QuestionType {
    SINGLE ("single"),
    MULTIPLE ("multiple");

    String label;
}
