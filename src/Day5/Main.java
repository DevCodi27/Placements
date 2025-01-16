package Day5;

import java.util.Scanner;

public class Main {
    public  static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
//        NumberofGuest numberofGuest= new NumberofGuest();
//
//        int[] arr ={7,0,5,1,3};
//        int[] arr2={1,2,1,3,4};
//
//        numberofGuest.guest(arr,arr2);
//        ZeroEnd zeroEnd = new ZeroEnd();
//        int[] arr = {0,1,0,3,12};
//        zeroEnd.zero(arr, arr.length);
//        SumOfDiagonal sumOfDiagonal = new SumOfDiagonal();
//        int[][] arr = {{1,2,3},{4,5,6},{9,8,9}};
//        sumOfDiagonal.sum(arr);
//        AddIndex addIndex = new AddIndex();
//        int n = 3 , m = 3;
//        addIndex.sum(n,m);
//        FindPair findPair = new FindPair();
//        int t = 30;
//        int n = 8;
//        int[] arr={14,-15,9,16,25,45,12,8};
//        findPair.pair(arr,n,t);
        Maxrow maxrow = new Maxrow();
        int n = 4,m=3;
        int[][] arr = {{0,1,0},{1,1,0},{1,0,1},{1,1,1}};
        maxrow.sumrow(arr,n,m);

//        FirstLastOccurance firstLastOccurance=new FirstLastOccurance();
//        int n = sc.nextInt();
//        int[] arr =new int[n];
//        for (int i = 0;i<n;i++)
//        {
//            arr[i]= sc.nextInt();
//        }
//        int find = sc.nextInt();
//        int [] ans =  firstLastOccurance.present(arr,find);
//        for(int i = 0;i<2;i++)
//        {
//            System.out.println(ans[i]);
//        }

    }
}
