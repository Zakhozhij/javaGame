public class Magician extends Hero {

    private int mana;
    private int maxMana;

    public Magician(String name) {
        super(
                name,
                170,
                Magician.r.nextInt(1, 11),
                Magician.r.nextInt(4, 7),
                Magician.r.nextInt(1, 5));
        this.maxMana = Magician.r.nextInt(120, 150);
        this.mana = maxMana;
    }

    @Override
    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }

    @Override
    public void step() {
        System.out.println("Step magician!");
    }

    @Override
    public void Attack() {
        System.out.println("Attack magician!");
    }
}