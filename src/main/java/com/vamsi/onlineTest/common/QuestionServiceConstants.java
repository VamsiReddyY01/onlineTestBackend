package com.vamsi.onlineTest.common;

public class QuestionServiceConstants {
    private QuestionServiceConstants() {
    }

    public static final String FIND_QUESTIONS = "SELECT * FROM question q where q.test=:test";
}
