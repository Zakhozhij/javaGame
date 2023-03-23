import java.util.ArrayList;

public class Supports extends Hero {
    private int magic;
    private int maxMagic;

    public Supports(String name, int team, int hp, int speed, int attack, int defense, int damage,int maxMagic) {
        super(
                name,
                team,
                hp,
                speed,
                attack,
                defense,
                damage);
        this.maxMagic = maxMagic;
        this.magic = maxMagic;
    }

    public Supports() {
        super();
    }
    public int getMagic() {
        return magic;
    }

    public int getMaxMagic() {
        return maxMagic;
    }

    @Override
    public void step(Board board, ArrayList<Hero> moveList) {
        int teamNumber = this.team;
        Hero victim = null;
        double minHp = 100;
        if (this.hp > 0) {
            for (Hero unit : moveList) {
                if (unit.hp>0 && unit.hp < unit.maxHp && unit.team == teamNumber && unit != null) {
                    if (unit.hp <= minHp) {
                        minHp = unit.hp;
                        // System.out.println("minDist->"+minDist);
                        victim = unit;
                    }
                }
            }
            if (victim != null) {
                this.Сure(victim);
                
            }

        }

    }
    @Override
    public void Сure(Hero target) {
        int causedCure = this.magic+2;
        // System.out.printf("%s attack %s\t", this.getClass().getSimpleName(), target.getClass().getSimpleName());
        // System.out.printf("Power of knock = %d\n", causedDamage);
        //System.out.println(target.getInfo());
        //System.out.println(causedCure);
        target.GetСure(causedCure);
    }

    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

}
