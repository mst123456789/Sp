class MaxFinder {
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0)
            throw new IllegalArgumentException("Array is empty or null");

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

public class GenericMaxFinder {
    public static void main(String[] args) {
        Integer[] intArray = {10, 25, 5, 88, 42};
        Double[] doubleArray = {12.5, 7.8, 20.9, 2.3};
        String[] stringArray = {"Apple", "Orange", "Banana", "Peach"};

        System.out.println("Max Integer: " + MaxFinder.findMax(intArray));
        System.out.println("Max Double: " + MaxFinder.findMax(doubleArray));
        System.out.println("Max String: " + MaxFinder.findMax(stringArray));
    }
}