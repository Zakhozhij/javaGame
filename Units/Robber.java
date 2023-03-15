import java.util.ArrayList;

public class Robber extends Hero {

    public Robber(String name, int team) {
        super(
                name,
                team,
                10,
                6,
                8,
                3,
                Robber.r.nextInt(2, 5));
    }
    public Robber() {
        super();
    }


    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

    @Override
    public void step(Board board,ArrayList<Hero> moveList) {
        System.out.println("Step robber!");
    }

    @Override
    public void Attack(Hero target) {
        System.out.println("Attack robber!");
    }
}