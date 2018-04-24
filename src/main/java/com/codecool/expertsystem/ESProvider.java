package com.codecool.expertsystem;

/**
 * Class representing Expert System Provider.
 */
public class ESProvider {
    private FactParser factParser;
    private RuleParser ruleParser;
    private RuleRepository ruleRepository;

    private List<Answer> answersList = new ArrayList();

    public ESProvider(FactParser factParser, RuleParser ruleParser) {

        this.ruleParser = ruleParser;
        this.factParser = factParser;
        this.ruleRepository = ruleParser.getRuleRepository();

    }



    public void collectAnswers() {

        //TODO: implement

    }

    public boolean getAnswerByQuestion(String questionID) {

        return false;    //TODO: implement

    }

    public String evaluate(){
        return ""; //TODO: implement
    }


}
