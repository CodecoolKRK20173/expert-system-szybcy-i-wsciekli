package com.codecool.expertsystem;

import com.codecool.expertsystem.iterators.QuestionIterator;
import com.codecool.expertsystem.parsers.FactParser;
import com.codecool.expertsystem.parsers.RuleParser;
import com.codecool.expertsystem.questionnaire.Answer;
import com.codecool.expertsystem.questionnaire.Question;
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
    private String input;

    private Map<String, Boolean> answersMap = new HashMap<>();

    public ESProvider(FactParser factParser, RuleParser ruleParser) {

        this.ruleParser = ruleParser;
        this.factParser = factParser;

        this.ruleRepository = ruleParser.getRuleRepository();



    }



    public void collectAnswers() {
        Scanner userInput = new Scanner(System.in);

        Iterator<Question> questionIterator = ruleRepository.getIterator();

        while (questionIterator.hasNext()) {
            Question nextQuestion = questionIterator.next();
            System.out.println(nextQuestion.getQuestion());
            String input = userInput.nextLine();
            boolean evaluatedAnswer = nextQuestion.getEvaluatedAnswer(input);

            answersMap.put(nextQuestion.getId(), evaluatedAnswer);
        }

    }

    public boolean getAnswerByQuestion(String questionID) {
        return answersMap.get(questionID);

    }

    public String evaluate() {
        return ""; //TODO: implement
    }


}
