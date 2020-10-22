package by.vyun.ishoot.service;



import by.vyun.ishoot.entity.QuestionCategoryType;
import by.vyun.ishoot.entity.TemplateReviewQuestion;
import by.vyun.ishoot.repo.TemplateReviewQuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateReviewQuestionService {
    @Autowired
    TemplateReviewQuestionRepo questionRepo;


    public List<TemplateReviewQuestion> getQuestionList() {
        List<TemplateReviewQuestion> questionList = questionRepo.findAll();
        return questionList;
    }

    public void addQuestion(String description, String type) {
        TemplateReviewQuestion newQuestion = new TemplateReviewQuestion();
        newQuestion.setDescription(description);
        newQuestion.setType(type);
        newQuestion.setActive(true);
        questionRepo.save(newQuestion);
    }


    public void updateQuestion(Long id, String description, String type, boolean active) {
        TemplateReviewQuestion updatedQuestion = questionRepo.getFirstById(id);
        updatedQuestion.setDescription(description);
        updatedQuestion.setType(type);
        updatedQuestion.setActive(active);
        questionRepo.save(updatedQuestion);
    }


    public List<TemplateReviewQuestion> getQuestionListFilter(String text, String type, boolean active) {
        List<TemplateReviewQuestion> questionList = questionRepo
                .findByDescriptionIsContainingAndTypeEqualsAndActiveIs(text, QuestionCategoryType.valueOf(type), active);
        return questionList;

    }
}
