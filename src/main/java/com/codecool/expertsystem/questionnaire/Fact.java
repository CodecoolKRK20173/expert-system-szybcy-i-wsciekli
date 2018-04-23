package com.codecool.expertsystem.questionnaire;

/**
 * Class representing fact.
 */
public class Fact
{
    private final Map<String, boolean> valueMap;
    private final String description;
    private boolean value;

    public Fact(String id, String description)
    {
        this.valueMap = generateIdSet(id);
        this.description = description;
    }

    public Set<String> getIdSet()
    {
        return this.valueMap.keySet();
    }

    public void setFactValueById(String id, boolean value)
    {
        this.valueMap.get(id) = value;
    }

    public String getDescription()
    {
        return this.description;
    }

}
