package by.vyun.ishoot.repo;

import by.vyun.ishoot.entity.TemplateAppointmentQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateAppointmentQuestionAnswerRepo extends JpaRepository<TemplateAppointmentQuestionAnswer, Long> {
    TemplateAppointmentQuestionAnswer getFirstById(Long id);

}
