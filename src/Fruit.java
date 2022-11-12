public class Fruit {
    private int id;
    private static int counter;
    private String name;

    public Fruit(String name) {
        this.name = name;
        id = counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
