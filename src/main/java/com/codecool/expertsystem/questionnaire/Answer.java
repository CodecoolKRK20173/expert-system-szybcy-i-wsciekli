package com.codecool.expertsystem.questionnaire;

import com.codecool.expertsystem.questionnaire.value.Value;
import java.util.List;

public class Answer {

    private List<Value> valuesList;

    public boolean evaluateAnswerByInput(String input) {
        // TODO implement
        return false;
    }

    public void addValue(Value value) {
        valuesList.add(value);
    }
}
