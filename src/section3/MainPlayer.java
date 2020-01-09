package section3;

import java.util.Scanner;

public class MainPlayer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu \r\n" + "1.Cricket Player Details \r\n"
                + "2.Hockey Player Details \r\n" + "Enter choice ");
        Integer choice = input.nextInt();
        input.nextLine();
        System.out.println("Enter player name\n");
        String name = input.next();
        System.out.println("Enter team name\n");
        String teamName = input.next();
        System.out.println("Enter number of matches played\n");
        Integer noOfMatches = input.nextInt();
        Integer noOfWicketsTaken = 0;
        if (choice == 1) {

            System.out.println("Enter total runs scored\n");
            Integer totalRunsScored = input.nextInt();
            System.out.println("Enter total number of wickets taken\n");
            noOfWicketsTaken = input.nextInt();
            IPlayerStatistics cricket = new CricketPlayer(name, teamName, noOfMatches,
                    totalRunsScored, noOfWicketsTaken);
            cricket.displayPlayerStatistics();
        }

        if (choice == 2) {

            System.out.println("Enter the position\n");
            String position = input.next();
            System.out.println("Enter total number of goals taken\n");
            Integer goals = input.nextInt();
            IPlayerStatistics hockey = new HockeyPlayer(name, teamName, noOfMatches, position,
                    goals);
            hockey.displayPlayerStatistics();

        }
        input.close();

    }

}
