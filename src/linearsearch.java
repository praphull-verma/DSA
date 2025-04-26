public class linearsearch {

    static int LinearSearch(int a, int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                return i;

            }
        }
        return -1;

    }

    static int LinearSearchString(char a, String s){
        for (int i = 0; i < s.length(); i++){
            if(a==s.charAt(i)){
                return 1;
            }


        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(LinearSearch(1, new int[]{13, 42, 14, 53, 6, 4, 2, 64}));
        System.out.println(LinearSearchString('s', "Hello worlds."));


    }
}


