
import java.util.HashSet;
import java.util.Scanner;

public class Sp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        int k = input.nextInt();
        int [] arr2 = new int[k];
        System.out.println("I arrayin reqemlerini daxil edin : ");
        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("II arrayin reqemlerini daxil edin : ");
        for(int i = 0; i<k; i++){
            arr2[i] = input.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(int num : arr){
            set.add(num);
        }

        for(int num : arr2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }

        System.out.println("Cavab : " + intersection);
    }
}
