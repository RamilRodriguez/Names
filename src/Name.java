import java.util.ArrayList;

public class Name {
    public static void main(String[] args) {

        ArrayList<String> name = new ArrayList<String>();
        name.add("Boris");
        name.add("Vlad");
        name.add("Alex");
        name.add("Joe");
        name.add(1, "Pavel");

        if (name.contains("Joe")) {
            System.out.println("Great");
        } else {
            System.out.println("Not found");

        }

    }
}
