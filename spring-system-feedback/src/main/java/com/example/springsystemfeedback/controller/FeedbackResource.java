package com.example.springsystemfeedback.controller;

import com.example.springsystemfeedback.entity.Feedback;
import com.example.springsystemfeedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class FeedbackResource {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @RequestMapping(value = "/feedbacks", method = RequestMethod.GET)
    public List<Feedback> findAllFeedbacks(){
        return feedbackRepository.findAll();
    }

    @RequestMapping(value = "/feedbacks", method = RequestMethod.POST)
    public Feedback cadastrarFeedback(@Valid @RequestBody Feedback feedback){
        return feedbackRepository.save(feedback);
    }

    //terminar o restante dos métodos necessários para o projeto
}
