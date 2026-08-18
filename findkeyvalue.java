public class findKeyValue {
    public static void main(String[] args) {
        int[] arr = {27, 7, 3, 2, 17};
        int key = 7;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                System.out.println("Key found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Key not found");
        }
    }
}
