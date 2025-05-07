import java.util.ArrayList;

public class CharStringArrayList {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        addElement(list, 'A');
        addElement(list, "Hello");
        addElement(list, 'B');
        addElement(list, "Java");
        addElement(list, 100);

        System.out.println("Valid Char & String List: " + list);
    }

    public static void addElement(ArrayList<Object> list, Object element) {
        if (element instanceof Character || element instanceof String) {
            list.add(element);
        } else {
            System.out.println("Error: Only Character and String are allowed! Attempted to add: " + element);
        }
    }
}
