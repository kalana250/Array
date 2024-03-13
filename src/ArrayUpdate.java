public class ArrayUpdate {

    static void updateElement(int arr[], int n, int x, int pos){
        for(int i = n-1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = x;  // Correct placement outside the loop
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 2;
        arr[1] = 8;
        arr[2] = 1;
        arr[3] = 16;
        arr[4] = 10;
        int n = 5;
        int x = 20;
        int pos = 2;
        System.out.println("Before Insertion :- ");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] );  //space-\t, new line - \n
        }
        updateElement(arr, n, x, pos);
        n += 1; // n = n+1 , += - +1
        System.out.println("\nAfter Insertion :- ");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);  //space-\t, new line - \n
        }
    }
}
