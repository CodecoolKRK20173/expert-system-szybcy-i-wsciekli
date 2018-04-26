package com.codecool.expertsystem;

import com.codecool.expertsystem.iterators.QuestionIterator;
import com.codecool.expertsystem.parsers.FactParser;
import com.codecool.expertsystem.parsers.RuleParser;
import com.codecool.expertsystem.questionnaire.Answer;
import com.codecool.expertsystem.questionnaire.Fact;
import com.codecool.expertsystem.questionnaire.Question;
import com.codecool.expertsystem.repositories.FactRepository;
import com.codecool.expertsystem.repositories.RuleRepository;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * Class representing Expert System Provider.
 */
public class ESProvider {
    private FactParser factParser;
    private RuleParser ruleParser;
    private RuleRepository ruleRepository;
    private FactRepository factRepository;
    private String input;

    private Map<String, Boolean> answersMap = new HashMap<>();

    public ESProvider(FactParser factParser, RuleParser ruleParser) {

        this.ruleParser = ruleParser;
        this.factParser = factParser;
        this.ruleRepository = ruleParser.getRuleRepository();
        this.factRepository = factParser.getFactRepository();

    }

    public void collectAnswers() {

        Iterator<Question> questionIterator = ruleRepository.getIterator();

        while (questionIterator.hasNext()) {

            Question nextQuestion = questionIterator.next();
            String input = Display.getStringInput(nextQuestion.getQuestion());
            boolean evaluatedAnswer = nextQuestion.getEvaluatedAnswer(input);
            answersMap.put(nextQuestion.getId(), evaluatedAnswer);

        }

    }

    public boolean getAnswerByQuestion(String questionID) {

        return answersMap.get(questionID);

    }

    public String evaluate() throws Exception {

        String cars = "";
        Iterator<Fact> factIterator = factRepository.getIterator();

        while (factIterator.hasNext()) {

            int thisCar = 0;
            Fact factTemp = factIterator.next();

            for (Map.Entry<String, Boolean> entry : answersMap.entrySet()) {
                String id = entry.getKey();
                boolean value = entry.getValue();

                if (value == factTemp.getValueById(id)) {
                    thisCar++;
                }
            }

            if (thisCar == answersMap.size()) {
                cars += factTemp.getDescription() + "\n";
            }
        }

        if (cars.equals(""))
            throw new Exception("sdfsgfh");
        return cars;

    }
}
