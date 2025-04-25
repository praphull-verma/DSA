public class linearsearch {

    static int LinearSearch(int a, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                return i;

            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println("Element is present at: " + LinearSearch(1, new int[]{13, 42, 14, 53, 6, 4, 2, 64}));

    }
}


