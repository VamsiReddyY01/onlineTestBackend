package com.vamsi.onlineTest.controller;

import com.vamsi.onlineTest.entity.Question;
import com.vamsi.onlineTest.service.onlineTestService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000/")
@RequestMapping(value = "Questions")
public class onlineTestController {
    private onlineTestService onlineTestService;

    public onlineTestController(onlineTestService onlineTestService) {
        super();
        this.onlineTestService = onlineTestService;
    }

    public onlineTestService getService() {
        return onlineTestService;
    }

    public void setService(onlineTestService onlineTestService) {
        this.onlineTestService = onlineTestService;
    }

    public void createQuestions(){
        List<Question> questions = new ArrayList<Question>();
        questions.add(new Question("1","1+1","1","2","3","4","option2"));
        questions.add(new Question("1","2+1","2","5","3","4","option3"));
        questions.add(new Question("1","3+1","2","5","3","4","option4"));

        questions.add(new Question("2","5+2","1","2","7","4","option3"));
        questions.add(new Question("2","2+2","2","5","3","4","option4"));
        questions.add(new Question("2","3+9","2","5","11","12","option4"));
        //questions.stream().forEach(q->service.saveQuestions(q));
        onlineTestService.saveQuestions(questions);
    }
    @GetMapping(value = "/get/{test}")
    public List<Question> getQuestions(@PathVariable String test){
        return onlineTestService.getQuestions(test);
    }

}
