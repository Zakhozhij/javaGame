import java.util.ArrayList;

public class Spearman extends Hero{


    public Spearman(String name, int team) {
        super(
                name,
                team,
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
    public void step(Board board,ArrayList<Hero> moveList){
        //System.out.println("Step spearman!");
    }

    @Override
    public void Attack(Hero target) {
        //System.out.println("Attack spearman!");
    }
    @Override
    public String getName(){
        return "Spearman";
    }
}
