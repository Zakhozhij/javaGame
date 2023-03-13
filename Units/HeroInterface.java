import java.util.ArrayList;

public interface HeroInterface {
    void step(ArrayList<Hero> team,ArrayList<Hero> team2);
    String getInfo();
    void Attack(Hero target);
}
