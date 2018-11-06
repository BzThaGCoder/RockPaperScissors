import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        int player1Count = 0;
        int player2Count = 0;
        int player1;
        int player2 = 0; //Remove the eqaul to 3 when working here...

        Scanner scn = new Scanner(System.in);

        System.out.println("Player One: Choose your weapon!");
        player1 = scn.nextInt();

        if (player1 == 4)
        {
            System.out.println("Player One and Player Two are tied with " +  player1Count +  " points.");
            System.out.println("Quitting");
        }
        else
        {
            System.out.println("Good choice!");
            System.out.println("Player Two: Choose your weapon!");
            player2 = scn.nextInt();
            if (player2 == 4)
            {
                System.out.println("Player One and Player Two are tied with " +  player2Count +  " points.");
                System.out.println("Quitting");
            }
            else
            {
                System.out.println("Good choice!");
            }
        }

        while ((player1 != 4) && (player2 != 4))
        {
            switch(player1)
            {
                case 1:
//                  System.out.println("rock");
                    System.out.println("Player One chose: rock");
                    break;
                case 2:
                    System.out.println("Player One chose: paper");
                    break;
                case 3:
                    System.out.println("Player One chose: scissors");
                    break;
                /*case 4:
                    System.out.println("Quitting");
                    break;*/
            }
//            System.out.println("Player One chose: " + player1);

            switch (player2)
            {
                case 1:
                    System.out.println("Player Two chose: rock");
                    break;
                case 2:
                    System.out.println("Player Two chose: paper");
                    break;
                case 3:
                    System.out.println("Player Two chose: scissors");
                    break;
                /*case 4:
                    System.out.println("Quitting");
                    break;*/
            }


            //Player 1
            if (player1 == 1 && player2 == 2)
            {
                System.out.println("Player Two Wins!");
                ++player2Count;
            }
            else if (player1 == 1 && player2 == 3)
            {
                System.out.println("Player One Wins!");
                ++player1Count;
            }
            else if (player1 == 2 && player2 == 1)
            {
                System.out.println("Player One Wins!");
                ++player1Count;
            }
            else if (player1 == 2 && player2 == 3)
            {
                System.out.println("Player Two Wins!");
                ++player2Count;
            }
            else if (player1 == 3 && player2 == 1)
            {
                System.out.println("Player Two Wins!");
                ++player2Count;
            }
            else if (player1 == 3 && player2 == 2)
            {
                System.out.println("Player One Wins!");
                ++player1Count;
            }
            else if (player1 == player2)
            {
                System.out.println("It's a draw!");
            }

            //Where it starts
            //Player 2 options
            System.out.println("The score is now: " + player1Count + " - " + player2Count);


            System.out.println("Player One: Choose your weapon!");
            player1 = scn.nextInt();


            if (player1 == 4)
            {
                if (player1Count > player2Count)
                {
                    System.out.println("The winner is Player One with " + player1Count + " points.");
                    System.out.println("Quitting");
                }
                else if (player2Count > player1Count)
                {
                    System.out.println("The winner is Player Two with " + player2Count + " points.");
                    System.out.println("Quitting");
                }
                else
                {
                    System.out.println("Player One and Player Two are tied with " +  player1Count +  " points.");
                    System.out.println("Quitting");
                }
            }
            else
            {
                System.out.println("Good choice!");
                System.out.println("Player Two: Choose your weapon!");
                player2 = scn.nextInt();
                if (player2 == 4)
                {
                    if (player1Count > player2Count)
                    {
                        System.out.println("The winner is Player One with " + player1Count + " points.");
                        System.out.println("Quitting");
                    }
                    else if (player2Count > player1Count)
                    {
                        System.out.println("The winner is Player Two with " + player2Count + " points.");
                        System.out.println("Quitting");
                    }
                    else
                    {
                        System.out.println("Player One and Player Two are tied with " +  player1Count +  " points.");
                        System.out.println("Quitting");
                    }
                    //System.out.println("Quitting");
                }
                else
                    {
                    System.out.println("Good choice!");
                }

            }
        }
    }
}
