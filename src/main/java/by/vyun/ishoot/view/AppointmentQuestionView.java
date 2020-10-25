package by.vyun.ishoot.view;


import by.vyun.ishoot.entity.QuestionType;
import by.vyun.ishoot.entity.TemplateAppointmentQuestion;


import java.time.LocalDate;
import java.util.Date;


public class AppointmentQuestionView {
    Long id;
    QuestionType type;
    String text;
    boolean enabled;
    Date created;
    //int ZONE = 3;

    public AppointmentQuestionView(TemplateAppointmentQuestion template) {
        this.id = template.getId();
        this.type = template.getType();
        this.text = template.getText();
        this.enabled = template.isEnabled();
        //Date date = new Date(template.getCreated().getTime() + 3600000L * ZONE);
        this.created = template.getCreated();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuestionType getType() {
        return type;
    }

    public void setType(QuestionType type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
