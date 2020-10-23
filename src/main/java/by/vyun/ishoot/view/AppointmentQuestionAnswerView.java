package by.vyun.ishoot.view;


import by.vyun.ishoot.entity.TemplateAppointmentQuestionAnswer;


public class AppointmentQuestionAnswerView {
    Long id;
    String text;

    public AppointmentQuestionAnswerView(TemplateAppointmentQuestionAnswer template) {
        this.id = template.getId();
        this.text = template.getText();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
