import java.util.ArrayList;

public class Team {

    private String teamName;
    private ArrayList<Player> players;

    Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    public String getTeamName() {
        return teamName;
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.getName() + " joined " + teamName);
    }

    public double getAverageSkillLevel() {
        if (players.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (Player p : players) {
            sum += p.getLevel();
        }
        return (double) (sum / players.size());

    }
    public void printTeam(){
        System.out.println();
        System.out.println("=== " + teamName + " ===");
        for (Player p : players) {
            System.out.println(p);
        }
    }

    public void compete(Team oppenent) {
        if (getAverageSkillLevel() > oppenent.getAverageSkillLevel()) {
            System.out.println("Winner :" + teamName);
        } else if (getAverageSkillLevel() < oppenent.getAverageSkillLevel()) {
            System.out.println("Winner :" + oppenent.teamName);
        } else {
            System.out.println("Uafgjort");
        }


    }

    public Player findBestPlayer() {
        Player bestPlayer = players.get(0);
        for (Player p : players) {
            if (bestPlayer.getLevel() < p.getLevel()) {
                bestPlayer = p;
            }
        }
        return bestPlayer;
    }



}
