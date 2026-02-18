public class Player {

    private String name;
    private int skillLevel;

    Player(String name, int skillLevel) {
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return skillLevel;
    }

    public String toString() {
        return "Name :" + name +
                " and Level :" + skillLevel;
    }

}
