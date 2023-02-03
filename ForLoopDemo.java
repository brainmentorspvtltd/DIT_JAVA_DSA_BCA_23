package Programs;

public class ForLoopDemo {
    public static void main(String[] args) {
        // for(int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }

        int arr[] = {3,5,6,7,3,1};
        // i = 0,1,2,3,4,5
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        
        // i = 3,5,6,7,3,1
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
