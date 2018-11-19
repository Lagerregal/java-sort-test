package de.example;

import java.util.*;


/**
 * Class Player
 */
class Player{
	private String name;
	private int score;

    /**
     * Constructor for Player
     * @param a First parameter
     * @param b Second parameter
     */
    Player(String a, int b){
        this.name = a;
        this.score = b;
    }
}


// @toDo: Write your Checker class here


class Solution {

    /**
     * Main function to start the project
     *
     * @param args Arguments from the CLI
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

		Arrays.sort(player, checker);
		for(int i = 0; i < player.length; i++){
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}
    }
}
