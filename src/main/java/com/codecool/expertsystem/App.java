package com.codecool.expertsystem;

import com.codecool.expertsystem.parsers.FactParser;
import com.codecool.expertsystem.parsers.RuleParser;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args ) {

        ESProvider esProvider = new ESProvider(new FactParser(), new RuleParser());
        Display.printTitleMenu();
        esProvider.collectAnswers();

        try {
            Display.printMessage("We found car/s for you:\n" + esProvider.evaluate());
        } catch (Exception e) {
            Display.printMessage("There is no car matching your requirements.");
        }

    }

}
