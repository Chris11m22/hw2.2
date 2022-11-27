package transport;

public class Driver {
    private String name;
    private boolean licence;
    private int experience;

    public Driver(String name, boolean licence, int experience) {
        this.name = name;
        this.licence = licence;
        this.experience = experience;
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

    public void startMove() {
    }
    public void stopMove() {
    }
    public void refuel(){

    }
}
