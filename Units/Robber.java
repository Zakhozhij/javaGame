import java.util.ArrayList;

public class Robber extends Hero {

    public Robber(String name) {
        super(
                name,
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
    public void step(ArrayList<Hero> team,ArrayList<Hero> team2) {
        System.out.println("Step robber!");
    }

    @Override
    public void Attack(Hero target) {
        System.out.println("Attack robber!");
    }
}