import java.util.ArrayList;

public class Magician extends Hero {

    private int magic;
    private int maxMagic;

    public Magician(String name,int team) {
        super(
                name,
                team,
                30,
                9,
                17,
                12,
                -5
                );
        this.maxMagic = 1;
        this.magic = maxMagic;
    }
    public Magician() {
        super();
    }

    @Override
    public String getInfo() {
        return String.format("%s  Magic: %d", super.getInfo(), this.magic);
    }

    @Override
    public void step(Board board,ArrayList<Hero> moveList) {
        System.out.println("Step magician!");
    }

    @Override
    public void Attack(Hero target) {
        System.out.println("Attack magician!");
    }

    public int getMagic() {
        return magic;
    }

    public int getMaxMagic() {
        return maxMagic;
    }
    
}