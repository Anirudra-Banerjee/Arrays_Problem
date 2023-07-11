import java.util.*;

class PairsOfSum{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
        int a = 0;
        for (int i = a + 1; i < n; i++) {
            if (arr[a] + arr[i] == sum) {
                System.out.println(arr[a] + "," + arr[i]);
            }
            if (i == n - 1) {
                a++;
                i = a;
            }
        }
    }
}