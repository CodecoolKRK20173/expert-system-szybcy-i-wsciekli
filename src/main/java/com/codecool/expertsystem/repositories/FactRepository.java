package com.codecool.expertsystem.repositories;

import com.codecool.expertsystem.questionnaire.Fact;

import java.util.ArrayList;
import java.util.List;

public class FactRepository {

    private Iterator factIterator;
    private List<Fact> factsList;

    public FactRepository() {
        this.factIterator = getIterator();
        this.factsList = new ArrayList<>();
    }

    public void addFacts(Fact fact) {
        factsList.add(fact);
    }

    public Iterator<Fact> getIterator() {
        return new FactIterator;
    }
}