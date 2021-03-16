/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFG;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lenovo
 */
public class TicTacToe {
    public static void main(String[] args) {
        char side,cSide;
        boolean br = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Welcome User!");
            System.out.println("This is a Tic Tac Toe Game\n");
            System.out.println("Choose Player1 side");
            System.out.println("o/x");
            side = sc.next().charAt(0);
            if(side=='o'||side=='O'||side=='x'||side=='X'){
                System.out.println("Player1 side is : "+side);
                break;
            }
            else
                System.out.println("choose correct side");
        }while(true);
        
        if(side=='x'||side=='X')
            cSide = 'o';
        else
            cSide = 'x';
        System.out.println(side+" "+cSide);
        System.out.println("Player2 side is : "+cSide);
        
        char array[] = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
        int place = -1;
        int cPlace = -1;
        System.out.println("Here is the position of game you have to choose");
        System.out.println("1|2|3");
        System.out.println("------");
        System.out.println("4|5|6");
        System.out.println("------");
        System.out.println("7|8|9");
        
        do{
        
            do{
                System.out.println("choose Player1 chance");
                place = sc.nextInt();
                if(place<1||place>9){
                    System.out.println("eneter a valid place!");
                    continue;
                }
                if(array[place-1]==' '){
                    array[place-1] = side;
                    getPrint(array);
                    if(check(array)){
                        System.out.println("Congratulations Player1 has won");
                        br=false;
                    }
                    break;
                }
                else{
                    System.out.println("position already entered!");
                }
            }while(true);
            if(br==false)
                break;
            do{
                System.out.println("Now Player 2 chance");
                cPlace = sc.nextInt();
                if(cPlace<1||cPlace>9){
                    System.out.println("eneter a valid place!");
                    continue;
                }
                if(array[cPlace-1]==' '){
                    array[cPlace-1] = cSide;
                    getPrint(array);
                    if(check(array)){
                        System.out.println("Congratulations Player2 has won");
                        br=false;
                    }
                    break;
                }
                else{
                    System.out.println("position already entered!");
                }

            }while(true);
            
        }while(br);
        
        
        System.out.println("");
    }
    
    static void getPrint(char array[]){
        System.out.println(array[0]+"|"+array[1]+"|"+array[2]);
        System.out.println("------");
        System.out.println(array[3]+"|"+array[4]+"|"+array[5]);
        System.out.println("------");
        System.out.println(array[6]+"|"+array[7]+"|"+array[8]);
    }
    static boolean check(char array[]){
        if((array[0]==array[1] && array[0]==array[2] && array[0]!=' ') || 
           (array[3]==array[4] && array[3]==array[5] && array[3]!=' ') ||
           (array[6]==array[7] && array[6]==array[8] && array[6]!=' ') ||
           (array[0]==array[3] && array[0]==array[6] && array[0]!=' ') ||
           (array[1]==array[4] && array[1]==array[7] && array[1]!=' ') ||
           (array[2]==array[5] && array[2]==array[8] && array[2]!=' ') ||
           (array[0]==array[4] && array[0]==array[8] && array[0]!=' ') ||
           (array[2]==array[4] && array[2]==array[6] && array[2]!=' ')
          ){
                return true;
            }
        return false;
    }
}
