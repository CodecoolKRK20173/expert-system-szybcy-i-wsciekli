package com.codecool.expertsystem.questionnaire;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 * Class representing fact.
 */

public class Fact {
    
    private Map<String, Boolean> valueMap;
    private final String DESCRIPTION;
    private final String ID;

    public Fact(String id, String description) {

        initializeMap();
        this.ID = id;
        this.DESCRIPTION = description;

    }

    private void initializeMap() {

        this.valueMap = new HashMap<>();

        this.valueMap.put("family", false);
        this.valueMap.put("money", false);
        this.valueMap.put("comfort", false);
        this.valueMap.put("luxury", false);

    }

    public Set<String> getIdSet() {

        return this.valueMap.keySet();

    }

    public void setFactValueById(String id, boolean value) {

        this.valueMap.put(id, value);

    }

    public String getDescription() {

        return this.DESCRIPTION;

    }

    public boolean getValueById(String id) {

        return this.valueMap.get(id);

    }

}
