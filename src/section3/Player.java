package section3;

public abstract class Player {
    protected String name,teamName;
    Integer noOfMatches;
    public  Player(String name, String teamName, Integer noOfMatches) {
        super();
        this.name = name;
        this.teamName = teamName;
        this.noOfMatches = noOfMatches;
    }
    

}
