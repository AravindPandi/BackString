/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aravind
 */
public class Bckstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Enter the Strings:");
        Scanner s=new Scanner(System.in);
        String g=s.nextLine();
        int n=g.length();
        char[] c=new char[100];
        
     //int[] a=new int[100];
     for(int i=0;i<n;i++)
     {
         c[i]=g.charAt(i);
         //System.out.println(c[i]);
         
     }
     for(int i=0;i<n;i++){
         int o=(int) c[i];
         if(o==97){
             System.out.println("z");
         }
             else{
             System.out.print((char) o);
    }
     
     }
    }
    }

