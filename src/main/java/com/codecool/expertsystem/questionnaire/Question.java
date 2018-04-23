package com.codecool.expertsystem.questionnaire;

/**
 * Class representing question.
 */
public class Question
{
    private final String id;
    private final String question;
    private Answer answer;

    public Question(String id, String question, Answer answer)
    {
        this.id = id;
        this.question = question;
        this.Answer = answer;
    }

    public String getId()
    {
        return this.id;
    }

    public String getQuestion()
    {
        return this.question;
    }

    public Answer getAnswer()
    {
        return answer;
    }

    public boolean getEvaluatedAnswer(String input)
    {
        return false;
        //TODO: implemement
    }

}
