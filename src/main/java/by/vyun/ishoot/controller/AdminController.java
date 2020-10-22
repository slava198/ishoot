package by.vyun.ishoot.controller;

import by.vyun.ishoot.entity.Product;
import by.vyun.ishoot.entity.TemplateAppointmentQuestion;
import by.vyun.ishoot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/product")
    List<Product> getProduct() {
        return adminService.getAllProducts();
    }

    @PostMapping("/product")
    ResponseEntity addProduct(String name, String logo) {
        adminService.addProduct(name, logo);
        return new ResponseEntity("Created", HttpStatus.CREATED);
    }

    @GetMapping("/quest")
    List<TemplateAppointmentQuestion> getQuest() {
        return adminService.getAllTemplateAppointmentQuestions();
    }

    @PostMapping("/quest")
    ResponseEntity addQuest(String type, String text) {
        adminService.addTemplateAppointmentQuestion(type, text);
        return new ResponseEntity("Created", HttpStatus.CREATED);
    }

    @PutMapping("/quest")
    ResponseEntity editQuest(Long id, String type, String text) {
        adminService.editTemplateAppointmentQuestion(id, type, text);
        return new ResponseEntity("Created", HttpStatus.CREATED);
    }





}
