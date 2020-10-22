package by.vyun.ishoot.repo;

import by.vyun.ishoot.entity.TemplateAppointmentQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemplateAppointmentQuestionRepo extends JpaRepository<TemplateAppointmentQuestion, Long> {

    TemplateAppointmentQuestion getFirstById(Long id);

}
