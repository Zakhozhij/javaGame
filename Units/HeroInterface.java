import java.util.ArrayList;

public interface HeroInterface {
    void step(Board board,ArrayList<Hero> moveList);
    String getInfo();
    void Attack(Hero target);
    String getName();
    Vector2 getPosition();
}
