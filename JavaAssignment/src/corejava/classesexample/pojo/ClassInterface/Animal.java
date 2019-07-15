package corejava.classesexample.pojo.ClassInterface;

public abstract class Animal {

    private String type;
    private String name;
    private int noOfLegs;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfLages() {
        return noOfLegs;
    }

    public void setNoOfLages(int noOfLages) {
        this.noOfLegs = noOfLages;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
