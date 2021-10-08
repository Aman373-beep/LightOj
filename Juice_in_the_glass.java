/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert1;
import java.util.*;
import java.io.*;
public class Juice_in_the_glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i =1;i<=test;i++)
        {
            double r1,r2,h,p;
            r1 = sc.nextDouble(); r2 = sc.nextDouble(); h = sc.nextDouble(); p = sc.nextDouble();
            double new_r = r2 +(r1-r2)*(p/h);
            double volume = Math.PI/3 * p * (new_r*new_r + new_r*r2 + r2*r2);
            //Case 1: 58.643062867
            System.out.println("Case "+i+": "+volume);
        }
    }
}
