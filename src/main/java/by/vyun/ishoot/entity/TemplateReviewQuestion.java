package by.vyun.ishoot.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TemplateReviewQuestion {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String description;
    private QuestionCategoryType type;
    private boolean active = true;


    public void setType(String type) {
        for (QuestionCategoryType qct :QuestionCategoryType.values()) {
            if (type.equals(qct.name())) {
                this.type = qct;
            }
        }

    }


}
