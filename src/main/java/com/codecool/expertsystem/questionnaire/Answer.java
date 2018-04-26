package com.codecool.expertsystem.questionnaire;

import com.codecool.expertsystem.questionnaire.value.Value;

import java.util.ArrayList;
import java.util.List;

public class Answer {

    private List<Value> valuesList = new ArrayList<>();

    public boolean evaluateAnswerByInput(String input) {
        for (Value value : valuesList) {
            if (value.getInputPattern().contains(input)) {
                return value.getSelectionType();
            }
        }

        return false;
    }

    public void addValue(Value value) {
        valuesList.add(value);
    }
}
