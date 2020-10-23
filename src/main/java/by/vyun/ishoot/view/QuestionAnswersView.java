package by.vyun.ishoot.view;


import by.vyun.ishoot.entity.TemplateAppointmentQuestion;

import java.util.List;

public class QuestionAnswersView {
    AppointmentQuestionView question;
    List<AppointmentQuestionAnswerView> answers;

    public QuestionAnswersView(AppointmentQuestionView question, List<AppointmentQuestionAnswerView> answers) {
        this.question = question;
        this.answers = answers;
    }

    public AppointmentQuestionView getQuestion() {
        return question;
    }

    public void setQuestion(AppointmentQuestionView question) {
        this.question = question;
    }

    public List<AppointmentQuestionAnswerView> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AppointmentQuestionAnswerView> answers) {
        this.answers = answers;
    }
}
