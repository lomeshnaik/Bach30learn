package corejava.classesexample.pojo;

public class Pen {

    private int length;
    private String name;
    private String brand;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length<=4){
            this.length = 4;
        }else{
            this.length = length;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Name : " + this.name +"\t Brand :" + getBrand() + "\t Length :" + length ;
    }
}
