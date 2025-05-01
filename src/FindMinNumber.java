public class FindMinNumber {

    public static void main(String[] args) {
        int[] arr = {18,43,31,-21,44};
        System.out.println(min(arr));

    }
    static int min(int[] arr){
        int minimum = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
}
