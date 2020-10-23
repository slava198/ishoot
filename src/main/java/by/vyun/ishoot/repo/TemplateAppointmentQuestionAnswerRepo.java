package by.vyun.ishoot.repo;

import by.vyun.ishoot.entity.TemplateAppointmentQuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemplateAppointmentQuestionAnswerRepo extends JpaRepository<TemplateAppointmentQuestionAnswer, Long> {
    TemplateAppointmentQuestionAnswer getFirstById(Long id);
    void deleteById(Long id);
    List<TemplateAppointmentQuestionAnswer> getAllByQuestionId(Long id);

}
