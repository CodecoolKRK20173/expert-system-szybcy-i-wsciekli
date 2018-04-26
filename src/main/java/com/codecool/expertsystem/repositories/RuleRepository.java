package com.codecool.expertsystem.repositories;

import com.codecool.expertsystem.iterators.QuestionIterator;
import com.codecool.expertsystem.questionnaire.Question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RuleRepository {

    private List<Question> questionList;

    public RuleRepository() {
        this.questionList = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questionList.add(question);
    }

    public Iterator<Question> getIterator() {
        return new QuestionIterator;
    }
}
