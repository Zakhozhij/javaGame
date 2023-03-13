import java.util.ArrayList;

public class Spearman extends Hero{


    public Spearman(String name) {
        super(
                name,
                10,
                4,
                4,
                5,
                Spearman.r.nextInt(1, 4));
    }
    public Spearman() {
        super();
    }
    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }
    
    @Override
    public void step(ArrayList<Hero> team,ArrayList<Hero> team2){
        System.out.println("Step spearman!");
    }

    @Override
    public void Attack(Hero target) {
        System.out.println("Attack spearman!");
    }
    
}
