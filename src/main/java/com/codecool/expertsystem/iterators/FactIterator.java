package com.codecool.expertsystem.iterators;

import com.codecool.expertsystem.questionnaire.Fact;
import java.util.ArrayList;
import java.util.List;

public class FactIterator implements Iterator {

    private List<Fact> factsList;
    private int index = 0;

    public FactIterator(ArrayList<Fact> factsList) {
        this.factsList = factsList;
    }

    public boolean hasNext() {

        return index < this.factsList.size()
      
    }

    public Fact next() {
        return this.factsList.get(index++);
    }
}
