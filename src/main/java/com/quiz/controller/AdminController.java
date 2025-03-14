package com.quiz.controller;

import com.quiz.model.Quiz;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
    
    @Autowired
    private QuizService quizService;

    @GetMapping("/admin")
    public String adminDashboard(Model model) {
        model.addAttribute("quizzes", quizService.getAllQuizzes());
        return "admin/dashboard";
    }

    @GetMapping("/admin/create")
    public String createQuizForm() {
        return "admin/createQuiz";
    }

    @PostMapping("/admin/create")
    public String createQuiz(@RequestParam String title, @RequestParam int rounds, @RequestParam int timePerRound) {
        quizService.createQuiz(title, rounds, timePerRound);
        return "redirect:/admin";
    }
}
