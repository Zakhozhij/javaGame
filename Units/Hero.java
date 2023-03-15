import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Hero implements HeroInterface, Comparable<Hero> {
    protected static int number;
    protected static ThreadLocalRandom r;

    protected final String NAME;
    protected int hp;
    protected int maxHp;
    protected int speed;
    protected int attack;
    protected int defense;
    protected int damage;
    protected int team;

    static {
        Hero.number = 0;
        Hero.r = ThreadLocalRandom.current();
    }

    public Hero(String name, int team, int hp, int speed, int attack, int defense, int damage) {
        this.NAME = name;
        this.team = team;
        this.hp = hp;
        this.speed = speed;
        this.maxHp = hp;
        this.attack = attack;
        this.defense = defense;
        this.damage = damage;
    }

    public Hero() {
        this.NAME = this.getClass().getSimpleName();
    }

    // public void GetDamage(int damage) {
    // if (this.hp - damage > 0) {
    // this.hp -= damage;
    // }
    // }

    // public void Attack(Hero target) {
    // int damage = Hero.r.nextInt(20);
    // target.GetDamage(damage);
    // }
    @Override
    public void step(Board board,ArrayList<Hero> moveList) {
        System.out.println("Шаг.");
    }

    @Override
    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Attack: %d Defense: %d Speed: %d Type: %s ",
                this.NAME, this.hp, this.attack, this.defense, this.speed, this.getClass().getSimpleName());
    }

    @Override
    public void Attack(Hero target) {
    }

    @Override
    public int compareTo(Hero o) {
        if (this.speed > o.speed)
            return -1;
        else if (this.speed < o.speed)
            return 1;
        else
            return 0;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
            System.out.printf("%s is alive and has %s hp\n", this.NAME, this.hp);
        } else {

            System.out.printf("%s is died\n", this.NAME);
            //die(this);
        }
    }
}
