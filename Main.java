package main;
// we want to generate random values for the dices, so we use random objects and we call out its library in the util:
import java.util.Random;

public class Main{
	public static void main(String[] args) {
		//making the random object.
		Random dice = new Random();
		
		int total_1 = 0,total_2 = 0,total_3 = 0;
		
		while(total_1 < 15 && total_2 < 15 && total_3 < 15) // using while loop so if the condition is true, it'll run the statement inside for us till the condition goes to be proved false. the condition here is any of the players score above the 15 the game is over.
		{
		  int d1 = dice.nextInt(6)+1; // in here, we have variables which will store the value of object in them and because we want points to be from 1 to 6, we add 6 to our random and limit it to 0 to 5 and then add one from out side if it to be 1 to 6
		  int d2 = dice.nextInt(6)+1;// 6 variables, each player has to dice twice in their turn
		  int d3 = dice.nextInt(6)+1;
		  int d4 = dice.nextInt(6)+1;
		  int d5 = dice.nextInt(6)+1;
		  int d6 = dice.nextInt(6)+1;
		  total_1 += (d1+d2); // in the each loop, the sum of the dice scores'll be added up to the player's total points.
		  total_2 += (d3+d4);
		  total_3 += (d5+d6);
		  System.out.println("Player 1 rolls a " + d1 + " and a " + d2);
		  System.out.println("Player now has " + total_1); 
		  	while(d1==d2) // now for the doublet for Player 1
		  	{ 
		  	  int a1 = dice.nextInt(6)+1; 
		  	  int a2 = dice.nextInt(6)+1; 
		  	  total_1 += (a1+a2); // again it'll be added up to the players total points.
		  	  System.out.println("Player 1 rolls a " + a1 + " and a " + a2);
		  	  System.out.println("Player now has " + total_1); 
		  	  if(a1 != a2)
		  			break; // now here we use an if condition to end the loop of the doublet condition. we use break so if the next 2 dices after the doublet are not equal then the loop will stop.
		  } // ***now we apply all of the codes to player 1 to the other two players simply below:
		  System.out.println("Player 2 rolls a " + d3 + " and a " + d4);  
		  System.out.println("Player now has " + total_2); 
		  	while(d3==d4)
		  	{ 
			  int a3 = dice.nextInt(6)+1;
			  int a4 = dice.nextInt(6)+1;
			  total_2 += (a3+a4);
			  System.out.println("Player 2 rolls a " + a3 + " and a " + a4);
			  System.out.println("Player now has " + total_2); 
			  if(a3 != a4)
				  break;
		  }
		  System.out.println("Player 3 rolls a " + d5 + " and a " + d6);
		  System.out.println("Player now has " + total_3); 
		  	while(d5==d6)
		  	{ 
			  int a5 = dice.nextInt(6)+1; 
			  int a6 = dice.nextInt(6)+1; 
			  total_3 += (a5+a6);
			  System.out.println("Player 3 rolls a " + a5 + " and a " + a6);
			  System.out.println("Player now has " + total_3); 
			  if(a5 != a6)
				  break;
		  }
		}
		
		
		String p1_1= "PLayer 1 wins the first place with a total of ";
		String p1_2= "PLayer 1 wins the second place with a total of ";
		String p1_3= "PLayer 1 wins the third place with a total of ";
		String p2_1= "PLayer 2 wins the first place with a total of ";
		String p2_2= "PLayer 2 wins the second place with a total of ";
		String p2_3= "PLayer 2 wins the third place with a total of ";
		String p3_1= "PLayer 3 wins the first place with a total of ";
		String p3_2= "PLayer 3 wins the second place with a total of ";
		String p3_3= "PLayer 3 wins the third place with a total of ";
		
		
		//now, each possibility of having two, three or one person as the 1st. or even one 1st and two 2nds.
		if(total_1 >= 15 || total_2 >= 15 || total_3 >= 15) {  
			if(total_1 == total_2 && total_2 == total_3) {
				System.out.println(p1_1 + total_1);
				System.out.println(p2_1 + total_2);
				System.out.println(p3_1 + total_3);
			}
			if(total_1 > total_2 && total_2 > total_3) {
				System.out.println(p1_1 + total_1);
				System.out.println(p2_2 + total_2);
				System.out.println(p3_3 + total_3);
			}
			if(total_1 > total_2 && total_2 == total_3) {
				System.out.println(p1_1 + total_1);
				System.out.println(p2_2 + total_2);
				System.out.println(p3_2 + total_3);
			}
			if(total_2 > total_1 && total_1 > total_3) {
				System.out.println(p2_1 + total_2);
				System.out.println(p1_2 + total_1);
				System.out.println(p3_3 + total_3);
			}
			if(total_2 > total_1 && total_1 == total_3) {
				System.out.println(p2_1 + total_2);
				System.out.println(p1_2 + total_1);
				System.out.println(p3_2 + total_3);
			}
			if(total_2 > total_3 && total_3 > total_1) {
				System.out.println(p2_1 + total_2);
				System.out.println(p3_2 + total_3);
				System.out.println(p1_3 + total_1);
			}
			if(total_3 > total_2 && total_2 > total_1) {
				System.out.println(p3_1 + total_3);
				System.out.println(p2_2 + total_2);
				System.out.println(p1_3 + total_1);
			}
			if(total_3 > total_1 && total_1 > total_2) {
				System.out.println(p3_1 + total_3);
				System.out.println(p1_2 + total_1);
				System.out.println(p2_3 + total_2);
			}
			if(total_3 >total_2 && total_2 == total_1) {
				System.out.println(p3_1 + total_3);
				System.out.println(p1_2 + total_1);
				System.out.println(p2_2 + total_2);
			}
			if(total_3 == total_2 && total_2 > total_1) {
				System.out.println(p2_1 + total_2);
				System.out.println(p3_1 + total_3);
				System.out.println(p1_2 + total_1);
			}
			if(total_1 > total_3 && total_3 > total_2) {
				System.out.println(p1_1 + total_1);
				System.out.println(p3_2 + total_3);
				System.out.println(p2_3 + total_2);
			}
			if(total_1 == total_3 && total_3 > total_2) {
				System.out.println(p1_1 + total_1);
				System.out.println(p3_1 + total_3);
				System.out.println(p2_2 + total_2);
			}
			if(total_1 == total_2 && total_2 > total_3) {
				System.out.println(p1_1 + total_1);
				System.out.println(p2_1 + total_2);
				System.out.println(p3_2 + total_3);
			}
		}
		
		
		
	}
}