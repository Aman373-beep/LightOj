/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert1;
import java.util.*;
public class Brush {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
     
        for(int i = 1;i<=test;i++)
        {
            int n = sc.nextInt();int sum = 0;
            for(int y =1;y<=n;y++){
                int a = sc.nextInt();
            if(a>0){
                sum+=a;
            }
            //Case 1: 16
           
            }
             System.out.println("Case "+i+":"+" "+sum);
        }
    }
}
