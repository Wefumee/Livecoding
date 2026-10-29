/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecture;

//import java.util.Scanner;
public class Lecture {

    public static void main(String[] args) {

   
        int var = evenodd(35);

        System.out.println(var);
  
        int check = Trigo(3, 6, 10 );
  
        
        System.out.println( check);
        
    }
    // Let n = the number that you want to check if it is odd or even
    static int evenodd(int n) {

        if (n % 2 == 0) 
        {
            return 1;
        } else {
            return 0;
        }

    }
    // Let s1= 1st side, s2 = 2nd side, s3=  3rd side
    static int Trigo(int s1, int s2, int s3) {

        if (s1 == s2 && s1 == s3) {
            return 1;
        } else if (s1 == s2 || s2 == s3 || s1 == s3) {
            return 2;
        }
        else if (s1<1 || s2< 1 || s3<1 || s1 + s2 < s3 || s1 + s3< s2 || s2 + s3 < s1){
        return 0;}
        
        else {
          return 3;
        }
    }

}
  
    
    

