public class Bowman extends Hero {

    private int shots;
    private int maxShots;

    public Bowman(String name) {
        super(
                name,
                200,
                Bowman.r.nextInt(1, 10),
                Bowman.r.nextInt(1, 5),
                Bowman.r.nextInt(4, 7));
        this.maxShots = Bowman.r.nextInt(20, 30);
        this.shots = maxShots;
    }

    @Override
    public String getInfo() {
        return String.format("%s shots: %d", super.getInfo(), this.shots);
    }

    @Override
    public void step() {
        System.out.println("Step bowman!");
    }

    @Override
    public void Attack() {
        System.out.println("Attack bowman!");
    }
}
