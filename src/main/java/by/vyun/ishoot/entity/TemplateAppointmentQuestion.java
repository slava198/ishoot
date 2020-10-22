package by.vyun.ishoot.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
public class TemplateAppointmentQuestion {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;
    QuestionType type;
    String text;
    boolean enabled;
    LocalDate created;


}
