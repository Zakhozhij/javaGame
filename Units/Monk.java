import java.util.ArrayList;

public class Monk extends Hero {
    private int magic;
    private int maxMagic;

    public Monk(String name) {
        super(
                name,
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
        return String.format("%s  Magic: %d ", super.getInfo(), this.magic);
    }

    @Override
    public void step(ArrayList<Hero> team,ArrayList<Hero> team2) {
        System.out.println("Step monk!");
    }

    @Override
    public void Attack(Hero target) {
        System.out.println("Attack monk!");
    }

    public int getMagic() {
        return magic;
    }

    public int getMaxMagic() {
        return maxMagic;
    }
    
}
