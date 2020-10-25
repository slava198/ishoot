package by.vyun.ishoot.service;

import by.vyun.ishoot.entity.*;
import by.vyun.ishoot.repo.ProductRepo;
import by.vyun.ishoot.repo.TemplateAppointmentQuestionAnswerRepo;
import by.vyun.ishoot.repo.TemplateAppointmentQuestionRepo;
import by.vyun.ishoot.view.AppointmentQuestionAnswerView;
import by.vyun.ishoot.view.AppointmentQuestionView;
import by.vyun.ishoot.view.QuestionAnswersView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
        question.setCreated(new Date());
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
        TemplateAppointmentQuestion question = questionRepo.getFirstById(id);
        question.setEnabled(false);
        questionRepo.save(question);

    }


    public List<TemplateAppointmentQuestionAnswer> getTemplateAppointmentQuestionAnswers(Long questionId) {
        //questionRepo.getFirstById(questionId)
        return answerRepo.getAllByQuestionId(questionId);
    }

     public List<QuestionAnswersView> getQuestionsWithAnswers(){
        List<QuestionAnswersView> resultList = new ArrayList<>();
        for (TemplateAppointmentQuestion question : getAllTemplateAppointmentQuestions() ) {
            List<AppointmentQuestionAnswerView> answers = new ArrayList<>();
            for (TemplateAppointmentQuestionAnswer answer
                    : answerRepo.getAllByQuestionId(question.getId())) {
                answers.add(new AppointmentQuestionAnswerView(answer));
            }
            resultList.add(new QuestionAnswersView(new AppointmentQuestionView(question), answers));
        }
        return resultList;
    }



    public void addTemplateAppointmentQuestionAnswer(Long questId, String text) {
        TemplateAppointmentQuestionAnswer answer = new TemplateAppointmentQuestionAnswer();
        TemplateAppointmentQuestion question = questionRepo.getFirstById(questId);
        answer.setText(text);
        answer.setQuestion(question);
        answerRepo.save(answer);

    }

    public void editTemplateAppointmentQuestionAnswer(Long id, String text) {
        TemplateAppointmentQuestionAnswer answer = answerRepo.getFirstById(id);
        answer.setText(text);
        answerRepo.save(answer);

    }

    public void deleteTemplateAppointmentQuestionAnswer(Long id) {
        answerRepo.deleteById(id);

    }



    public void addProduct (String name, String logo) {
        Product product = new Product();
        product.setName(name);
        product.setLogo(logo);
        product.setCreated(new Date());
        productRepo.save(product);

    }

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }



}
