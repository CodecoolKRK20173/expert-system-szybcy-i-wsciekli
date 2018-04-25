package com.codecool.expertsystem.repositories;

import com.codecool.expertsystem.iterators.QuestionIterator;
import com.codecool.expertsystem.questionnaire.Question;

import java.util.HashMap;
import java.util.Map;

public class RuleRepository {

    private Map<String, Question> questionMap;

    public RuleRepository() {
        this.questionMap = new HashMap<>();
    }

    public void addQuestion(Question question) {
        this.questionMap.put(question.getId(), question);
    }

    public Iterator<Question> getIterator() {
        return new QuestionIterator;
    }
}
