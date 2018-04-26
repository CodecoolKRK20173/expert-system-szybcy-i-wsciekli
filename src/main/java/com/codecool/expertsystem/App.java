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

        Display.printTitleMenu();

        esProvider.collectAnswers();
        try {
            Display.printMessage("We found car/s for you:\n" + esProvider.evaluate());
        } catch (Exception e) {
            Display.printMessage("There is no car matching your requirements.");
        }
    }}
