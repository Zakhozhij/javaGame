public class Robber extends Hero {

    private int endurance;
    private int maxEndurance;

    public Robber(String name) {
        super(
                name,
                300,
                Robber.r.nextInt(1, 11),
                Robber.r.nextInt(1, 5),
                Robber.r.nextInt(4, 7));
        this.maxEndurance = Robber.r.nextInt(120, 150);
        this.endurance = maxEndurance;
    }

    @Override
    public String getInfo() {
        return String.format("%s  endurance: %d ", super.getInfo(), this.endurance);
    }

    @Override
    public void step() {
        System.out.println("Step robber!");
    }

    @Override
    public void Attack() {
        System.out.println("Attack robber!");
    }
}