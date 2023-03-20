import java.util.ArrayList;

public class Monk extends Hero {
    private int magic;
    private int maxMagic;

    public Monk(String name,int team) {
        super(
                name,
                team,
                30,
                5,
                12,
                7,
                -4);
        this.maxMagic = 1;
        this.magic = maxMagic;
    }
    public Monk() {
        super();
    }

    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

    @Override
    public void step(Board board,ArrayList<Hero> moveList) {
        //System.out.println("Step monk!");
    }

    @Override
    public void Attack(Hero target) {
        //System.out.println("Attack monk!");
    }

    public int getMagic() {
        return magic;
    }

    public int getMaxMagic() {
        return maxMagic;
    }
    @Override
    public String getName(){
        return "Monk";
    }
}
