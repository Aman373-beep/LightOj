
package Prob_solve;
import java.util.*;
public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for(int i =1;i<=in;i++){
            int bin = sc.nextInt();
        String s = "";long sum=0;
        while(bin!=0){
            sum+=(bin%2);
            bin/=2;
        }
        
        //Case 1: odd
        //Case 1: odd
        if(sum%2!=0){
            System.out.println("Case "+i+":"+" "+"odd");
        }
        else{
            System.out.println("Case "+i+":"+" "+"even");
        }
        }
        
    }
}
