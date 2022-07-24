package HW_2;

public class Dog {
    String name;
    int ves;
    public Dog(String dogName, int dogVes){
        this.name = dogName;
        this.ves = dogVes;
    }
    public int getDogVes() {
        return this.ves;
    }
    public String getDogName() {
        return this.name;
    }
    public void setDogName(String newName) {
        this.name = newName;
    }
}
