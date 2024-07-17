package ca.sheridancollege.WarGame;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sakuraghimire
 */
public class Main {
    public static void main(String[] args) {
        Games game = new Games("War");
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter player 1 Name: ");
        Players player1 = new Players(in.nextLine());
        System.out.print("Enter player 2 Name: ");
        Players player2 = new Players(in.nextLine());
        //        using if condition to compare names
        
         if (player1.equals(player2)) {
            System.out.println("Error: Player names cannot be the same. Please enter different names.");
            System.out.print("Enter player 2 name: ");
            player2 = new Players(in.nextLine().trim());
        }

        game.addPlayer(player1);
        game.addPlayer(player2);
       
    game.play();

    }        

}


