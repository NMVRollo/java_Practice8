package com.company.iterator;

import java.util.List;

public class JavaDeveloper implements  Collection{

    private String name;
    private List<String> skills;

    public JavaDeveloper(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator{

        private int index;

        @Override
        public boolean hasNext() {
            return index < skills.size();
        }

        @Override
        public Object next() {
            return skills.get(index++);
        }
    }

}
