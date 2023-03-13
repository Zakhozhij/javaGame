import java.util.ArrayList;

public class Sniper extends Hero{
    
    private int shots;
    private int maxShots;

    public Sniper(String name) {
        super(
                name,
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
    public void step(ArrayList<Hero> team,ArrayList<Hero> team2){
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
