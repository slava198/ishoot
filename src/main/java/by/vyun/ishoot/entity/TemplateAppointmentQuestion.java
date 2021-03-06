package by.vyun.ishoot.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
public class TemplateAppointmentQuestion {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    Long id;
    //@JsonFormat(shape = JsonFormat.Shape.OBJECT)
    QuestionType type;
    String text;
    boolean enabled = true;
    Date created;
    //@OneToMany(mappedBy = "question")
    //List<TemplateAppointmentQuestionAnswer> answers;

}
