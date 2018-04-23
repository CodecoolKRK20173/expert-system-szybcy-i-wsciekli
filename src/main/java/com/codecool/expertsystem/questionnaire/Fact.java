package com.codecool.expertsystem.questionnaire;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 * Class representing fact.
 */
public class Fact
{
    private Map<String, boolean> valueMap;
    private final String description;
    private final String id;
    private boolean value;

    public Fact(String id, String description)
    {
        this.id = id;
        this.valueMap = new HashMap<String, boolean>();
        this.description = description;
    }

    public Set<String> getIdSet()
    {
        return this.valueMap.keySet();
    }

    public void setFactValueById(String id, boolean value)
    {
        this.valueMap.put(id, value);
    }

    public String getDescription()
    {
        return this.description;
    }

    public boolean getValueById(String id)
    {
        return this.valueMap.get(id);
    }

}
