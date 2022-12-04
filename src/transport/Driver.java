package transport;

import jdk.jfr.Category;

public class Driver<C extends Category> {
    private String name;
    private boolean licence;
    private int experience;
    private C category;

    public Driver(String name, boolean licence, int experience, C category) {
        this.name = name;
        this.licence = licence;
        this.experience = experience;
    }

    public Driver(String name, boolean licence, int experience) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLicence() {
        return licence;
    }

    public void setLicence(boolean licence) {
        this.licence = licence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public C getCategory() {
        return category;
    }

    public void setCategory(C category) {
        if ( category == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
        this.category = category;
    }

    public void startMove() {
    }
    public void stopMove() {
    }
    public void refuel(){

    }
}
