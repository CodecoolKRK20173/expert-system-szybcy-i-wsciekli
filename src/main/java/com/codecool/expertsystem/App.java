package com.codecool.expertsystem;

import com.codecool.expertsystem.parsers.FactParser;
import com.codecool.expertsystem.parsers.RuleParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        FactParser factParser = new FactParser();
        RuleParser ruleParser = new RuleParser();

        ESProvider esProvider = new ESProvider(factParser, ruleParser);

        esProvider.collectAnswers();
        try {
            System.out.println(esProvider.evaluate());
        } catch (Exception e) {
            System.out.println("Cars out of bounds exceptionno");
        }
    }}
