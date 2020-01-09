package section3;

public class HockeyPlayer extends Player implements IPlayerStatistics{
    private String position;
    private Integer noOfGoals;
    public HockeyPlayer(String name, String teamName, Integer noOfMatches,String position,Integer noOfGoals) {
        super(name, teamName, noOfMatches);
       this.position=position;
       this.noOfGoals=noOfGoals;
    }

    @Override
    public void displayPlayerStatistics() {
       System.out.println("Player Details\nPlayer name:"+name);
       System.out.println("Player name:"+name);
       System.out.println("Team name:"+teamName);
       System.out.println("No of matches:"+noOfMatches);
       System.out.println("Position:"+position);
       System.out.println("No of Goals Taken:"+noOfGoals);
    }

    

}
