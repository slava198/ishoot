package by.vyun.ishoot.controller;


import by.vyun.ishoot.service.AdminService;
import by.vyun.ishoot.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@Controller
//@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;
    @Autowired
    AdminService adminService;

//    @PostMapping
//    public ResponseEntity addQuestion(String name) throws IOException {
//        clientService.addClient(name);
//        return new ResponseEntity("Client saved", HttpStatus.CREATED);
//    }

    @GetMapping("/")
    public String questionsWith(Model model) {
        model.addAttribute("questionAnswers", adminService.getQuestionsWithAnswers());

        return "index";
    }

    @GetMapping("/answer_del")
    public String deleteAnswer(Long id, Model model) {
        adminService.deleteTemplateAppointmentQuestionAnswer(id);
        model.addAttribute("questionAnswers", adminService.getQuestionsWithAnswers());
        return "index";
    }

    @PostMapping("/question_edit")
    public String editQuest(Long id, String type, String text, Model model) {
        adminService.editTemplateAppointmentQuestion(id, type, text);
        model.addAttribute("questionAnswers", adminService.getQuestionsWithAnswers());
        return "index";
    }

}
