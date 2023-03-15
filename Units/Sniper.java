import java.util.ArrayList;

public class Sniper extends Hero{
    
    private int shots;
    private int maxShots;

    public Sniper(String name, int team) {
        super(
                name,
                team,
                15,
                9,
                12,
                10,
                Sniper.r.nextInt(8,11));
        this.maxShots = 32;
        this.shots = maxShots;
    }
    public Sniper() {
        super();
    }
    @Override
    public String getInfo() {
        return String.format("%s Shots: %d", super.getInfo(), this.shots);
    }

    @Override
    public void step(Board board,ArrayList<Hero> moveList){
        System.out.println("Step sniper!");
    }

    @Override
    public void Attack(Hero target) {
        System.out.println("Attack sniper!");
    }
    public int getShots() {
        return shots;
    }
    public int getMaxShots() {
        return maxShots;
    }
    
}
