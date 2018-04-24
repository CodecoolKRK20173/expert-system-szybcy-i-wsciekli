package com.codecool.expertsystem.iterators;

import com.codecool.expertsystem.questionnaire.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionIterator implements Iterator {

    private List<Question> questionList;
    private int index = 0;

    public QuestionIterator(ArrayList<Question> questionList) {
        this.questionList = questionList;

    }

    public boolean hasNext() {
        if (index < this.questionList.size()) {
            return true;
        }
        return false;
    }

    public Question next() {
        return this.questionList.get(index++);
    }
}
