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


    public List<TemplateAppointmentQuestion> getAllTemplateAppointmentQuestions() {
        return questionRepo.findAll();
    }

    public void addTemplateAppointmentQuestion(String type, String text) {
        TemplateAppointmentQuestion question = new TemplateAppointmentQuestion();
        question.setText(text);
        question.setType(QuestionType.valueOf(type));
        question.setCreated(LocalDate.now());
        questionRepo.save(question);

    }

    public void editTemplateAppointmentQuestion(Long id, String type, String text) {
        TemplateAppointmentQuestion question = questionRepo.getFirstById(id);
        question.setType(QuestionType.valueOf(type));
        question.setText(text);
        //question.setCreated(LocalDate.now());
        questionRepo.save(question);

    }

    public void disableTemplateAppointmentQuestion(Long id) {



    }




    public void addTemplateAppointmentQuestionAnswer() {



    }


    public void addProduct (String name, String logo) {
        Product product = new Product();
        product.setName(name);
        product.setLogo(logo);
        product.setCreated(LocalDate.now());
        productRepo.save(product);

    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }


}
