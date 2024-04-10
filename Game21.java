import java.util.*;
public class Game21 {
    public static void main(String[]args){
        int card1 = (int)(11*Math.random()+1);
        int card2 = (int)(11*Math.random()+1);
        int keepGoing;
        int other_card1;
        int other_card2;
        int other_card3;
        int sum;
        int other_sum;
        sum = card1 + card2;
        Scanner input = new Scanner (System.in);
        System.out.println("You have a " + card1 + " and a " +card2 + " for a total of " + sum);
        System.out.println("Enter a 1 if you want another card or any other number for no card: ");
        keepGoing = input.nextInt();
        input.close();
        if (keepGoing == 1){
            int card3 = (int)(11*Math.random()+1);
            sum += card3;
            System.out.println("You have a " + card1 + " ,a " + card2 + " and a " + card3 + " for a total of " + sum);
        }
        other_card1 = (int)(11*Math.random()+1);
        other_card2 = (int)(11*Math.random()+1);
        other_card3 = (int)(11*Math.random()+1);
        other_sum = other_card1 + other_card2 + other_card3;
        System.out.println("The dealer has a " + other_card1 + " ,a " + other_card2 + " and a " + other_card3 + " for a total of " + other_sum);
        if (sum > 21){
            System.out.println("Player loses");
        }else if (other_sum > 21){
            System.out.println("Player wins");
        }else if (sum > other_sum){
            System.out.println("Player wins");
        }
        else if (sum < other_sum){
            System.out.println("Player loses");
        }else{
            System.out.println("Tie");
        }
    }
}
