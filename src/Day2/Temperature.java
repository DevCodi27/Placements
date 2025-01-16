package Day2;

public class Temperature {
 public void temp(int n)
 {
     if(n<0)
     {
         System.out.println("Freezing Weather");
     }
     else if(n>=0 && n<=9)
     {
         System.out.println("Very cold weather");
     } else if (n>= 10 && n<=19) {
         System.out.println("Cold weather");
     } else if (n>= 20 && n<=29) {
         System.out.println("Normal in temperature");
     }else if (n>= 30 && n<=39)
     {
         System.out.println("Its hot");
     }
     else {
         System.out.println("Its very hot");
     }
 }
}
