import java.util.Scanner;
import java.lang.Math;

public class NumberGuess{
    public static void main(String args[]){
        System.out.println("Number Guessing game");
        Scanner sc=new Scanner(System.in);
        int num=(int)(Math.random()*100);
        System.out.println(num);
        int i=1;
        while(i<6){
        System.out.println("Enter any number b/w 0 to 100");
        int a=sc.nextInt();
        
            if(a==num){
                System.out.println("Correct answer");
            }else{
                System.out.println("Wrong answer!\nPlease try again");
            }
            i++;
            }
        }

    }
