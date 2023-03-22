import java.util.ArrayList;

/**
 * Infantry
 */
public class Infantry extends Hero {

    public Infantry(String name, int team, int hp, int speed, int attack, int defense, int damage) {
        super(
                name,
                team,
                hp,
                speed,
                attack,
                defense,
                damage);
    }

    public Infantry() {
        super();
    }

    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

    @Override
    public void step(Board board, ArrayList<Hero> moveList) {
        int teamNumber = this.team;
        Hero victim = null;
        double dist = 100;
        double minDist = 100;
        if (this.hp > 0) {
            for (Hero unit : moveList) {
                if (unit.hp > 0 && unit.team != teamNumber && unit != null) {

                    dist = board.checkDistance(this, unit);

                    if (dist <= minDist) {
                        minDist = dist;
                        // System.out.println("minDist->"+minDist);
                        victim = unit;
                    }
                }
            }
            Boolean canAttack = false;
            if (victim != null) {
                canAttack = board.getWayToVictim(this, victim);
                if (canAttack == true) {
                    this.Attack(victim);
                }
            }
        }

    }

    @Override
    public void Attack(Hero target) {
        int causedDamage = this.damage;
        // System.out.printf("%s attack %s\t", this.getClass().getSimpleName(),
        // target.getClass().getSimpleName());
        // System.out.printf("Power of knock = %d\n", causedDamage);
        target.GetDamage(causedDamage);
    }

}