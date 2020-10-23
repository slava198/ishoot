package by.vyun.ishoot.entity;


import java.util.List;

public class QuestionAnswersView {
    TemplateAppointmentQuestion question;
    List<String> answers;

    public QuestionAnswersView(TemplateAppointmentQuestion question, List<String> answers) {
        this.question = question;
        this.answers = answers;
    }

    public TemplateAppointmentQuestion getQuestion() {
        return question;
    }

    public void setQuestion(TemplateAppointmentQuestion question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
