package com.vamsi.onlineTest.service;

import com.vamsi.onlineTest.entity.Question;
import com.vamsi.onlineTest.repo.onlineTestRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
public class onlineTestService {
    private onlineTestRepository onlineTestRepository;

    public onlineTestService(onlineTestRepository onlineTestRepository) {
        super();
        this.onlineTestRepository = onlineTestRepository;
    }

    public onlineTestRepository getRepository() {
        return onlineTestRepository;
    }

    public void setRepository(onlineTestRepository onlineTestRepository) {
        this.onlineTestRepository = onlineTestRepository;
    }


    public List<Question> getQuestions(String test) {
//        List<Question> allQuestions= (List<Question>) onlineTestRepository.findAll();
//        List<Question> filteredQuestions=new ArrayList<>();
//        filteredQuestions=allQuestions.stream().filter(question -> question.getTest().equals(test)).collect(Collectors.toList());
        return onlineTestRepository.getQuestionsByTest(test);

    }

    public void saveQuestions(List<Question> questions) {
        onlineTestRepository.saveAll(questions);
    }


}
