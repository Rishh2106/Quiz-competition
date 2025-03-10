package com.quiz.controller;

import com.quiz.model.Quiz;
import com.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParticipantController {

    @Autowired
    private QuizService quizService;

    @GetMapping("/quiz")
    public String quiz(@RequestParam String teamId, Model model) {
        Quiz quiz = quizService.getActiveQuiz();
        model.addAttribute("quiz", quiz);
        model.addAttribute("teamId", teamId);
        return "participant/quiz";
    }
}
