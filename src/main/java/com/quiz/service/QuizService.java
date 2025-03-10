package com.quiz.service;

import com.quiz.model.Quiz;
import com.quiz.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public void createQuiz(String title, int rounds, int timePerRound) {
        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setRounds(rounds);
        quiz.setTimePerRound(timePerRound);
        quizRepository.save(quiz);
    }

    public Quiz getActiveQuiz() {
        // For simplicity, assume the first quiz is the active one
        return quizRepository.findAll().get(0);
    }
}
