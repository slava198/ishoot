package by.vyun.ishoot.repo;

import by.vyun.ishoot.entity.QuestionCategoryType;
import by.vyun.ishoot.entity.TemplateReviewQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TemplateReviewQuestionRepo extends JpaRepository<TemplateReviewQuestion, Long> {

    List<TemplateReviewQuestion> findAll();
    List<TemplateReviewQuestion> findByDescriptionIsContaining(String text);
    List<TemplateReviewQuestion> findByDescriptionIsContainingAndTypeEqualsAndActiveIs(String text, QuestionCategoryType type, boolean active);


    TemplateReviewQuestion getFirstById(Long id);
}
