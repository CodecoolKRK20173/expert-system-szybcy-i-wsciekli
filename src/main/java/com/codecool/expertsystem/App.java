package com.codecool.expertsystem;

import com.codecool.expertsystem.parsers.FactParser;
import com.codecool.expertsystem.parsers.XMLParser;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        XMLParser parser = new FactParser();
        ((FactParser) parser).createFacts();
    }
}
