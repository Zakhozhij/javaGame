import java.util.ArrayList;

public class Magician extends Supports {

   

    public Magician(String name,int team) {
        super(
                name,
                team,
                30,
                9,
                17,
                12,
                -5,
                1
                );
    }
    public Magician() {
        super();
    }

    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

    @Override
    public void step(Board board,ArrayList<Hero> moveList) {
        //System.out.println("Step magician!");
    }

    @Override
    public void Attack(Hero target) {
        //System.out.println("Attack magician!");
    }

    
    @Override
    public String getName(){
        return "Magician";
    }
    
}