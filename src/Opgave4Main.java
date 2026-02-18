public class Opgave4Main {
    void main() {

        Team t1 = new Team("Red Team");
        Team t2 = new Team("Blue Team");

        t1.addPlayer(new Player("Feyzullah",99));
        t1.addPlayer(new Player("Sercan",85));
        t1.addPlayer(new Player("Poyraz",70));
        t1.addPlayer(new Player("Ela",60));

        t2.addPlayer(new Player("Ayhan",98));
        t2.addPlayer(new Player("Melek", 55));
        t2.addPlayer(new Player("Oyku",65));

        t1.printTeam();
        t2.printTeam();

        System.out.println();
        t1.compete(t2);
        t2.compete(t1);

        System.out.println("\nBest Player");
        System.out.println(t1.getTeamName() + " " + t1.findBestPlayer());
        System.out.println(t2.getTeamName() + " " + t2.findBestPlayer());


    }
}
