public class Peasant extends Hero {

    private int endurance;
    private int maxEndurance;

    public Peasant(String name) {
        super(
                name,
                150,
                Peasant.r.nextInt(1, 6),
                Peasant.r.nextInt(1, 4),
                Peasant.r.nextInt(1, 4));
        this.maxEndurance = Peasant.r.nextInt(80, 120);
        this.endurance = maxEndurance;
    }

    @Override
    public String getInfo() {
        return String.format("%s  endurance: %d ", super.getInfo(), this.endurance);
    }

    @Override
    public void step() {
        System.out.println("Step peasant!");
    }

    @Override
    public void Attack() {
        System.out.println("Attack peasant!");
    }
}
