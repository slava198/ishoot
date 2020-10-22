package by.vyun.ishoot.service;

import by.vyun.ishoot.entity.Product;
import by.vyun.ishoot.entity.QuestionType;
import by.vyun.ishoot.entity.TemplateAppointmentQuestion;
import by.vyun.ishoot.repo.ProductRepo;
import by.vyun.ishoot.repo.TemplateAppointmentQuestionAnswerRepo;
import by.vyun.ishoot.repo.TemplateAppointmentQuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class AdminService {
    @Autowired
    TemplateAppointmentQuestionRepo questionRepo;
    @Autowired
    TemplateAppointmentQuestionAnswerRepo answerRepo;
    @Autowired
    ProductRepo productRepo;


    void addTemplateAppointmentQuestion(QuestionType type, String text) {
        TemplateAppointmentQuestion question = new TemplateAppointmentQuestion();
        question.setText(text);
        question.setType(type);
        question.setCreated(LocalDate.now());
        questionRepo.save(question);

    }

    void editTemplateAppointmentQuestion(Long id, QuestionType type, String text) {
        TemplateAppointmentQuestion question = questionRepo.getFirstById(id);
        question.setType(type);
        question.setText(text);
        //question.setCreated(LocalDate.now());
        questionRepo.save(question);

    }

    void disableTemplateAppointmentQuestion(Long id) {



    }




    void addTemplateAppointmentQuestionAnswer() {



    }


    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }


}
