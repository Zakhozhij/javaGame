import java.util.ArrayList;
public abstract class Shooter extends Hero {

    private int shots;

    public Shooter(String name, int team, int hp, int speed, int attack, int defense, int damage,int shots) {
        super(
                name,
                team,
                hp,
                speed,
                attack,
                defense,
                damage);
        this.shots = shots;
    }

    public Shooter() {
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
        double dist = 11;
        double minDist = 11;
        if (this.shots > 0 && this.hp > 0) {
           // System.out.println("Могу стрелять!");

            for (Hero unit : moveList) {
                if (unit.hp > 0 && unit.team != teamNumber) {
                    dist = board.checkDistance(this, unit);
                    if (dist <= minDist) {
                        minDist = dist;
                        // System.out.println("minDist->"+minDist);
                        victim = unit;
                    }
                }

            }
            //System.out.println(victim.getInfo());
            if (victim != null) {
                this.Attack(victim);
                this.shots--;
            }

            for (Hero unit : moveList) {
                if (unit.getClass().getTypeName().equals("Peasant") && unit.hp > 0
                        && ((Peasant) (unit)).getDelivery() > 0 && unit.team == teamNumber) {
                    this.shots++;
                    //System.out.println("Крестьянин вернул стрелу!");
                    ((Peasant) (unit)).setDelivery(0);
                    // System.out.printf("Осталось стрел %s\n",this.shots);
                    break;
                }
            }

        } else if (this.shots == 0 && this.hp > 0) {
            //System.out.println("Не могу стрелять!");
        } else if (this.hp <= 0) {
            //System.out.println("Арбалетчик мертв!");
        }
    }

    @Override
    public void Attack(Hero target) {
        int causedDamage = this.damage;
        // System.out.printf("%s attack %s\t", this.getClass().getSimpleName(), target.getClass().getSimpleName());
        // System.out.printf("Power of knock = %d\n", causedDamage);
        target.GetDamage(causedDamage);
    }


}
