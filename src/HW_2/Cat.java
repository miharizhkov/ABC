package HW_2;

public class Cat {
    String name;
    int ves;
    public Cat(String catName, int catVes) {
        this.name = catName;
        this.ves = catVes;
    }
    public int getCatVes() {
        return this.ves;
    }
    public String getCatname() {
        return this.name;
    }
    public void setCatName(String newName) {
        this.name = newName;
    }
}
