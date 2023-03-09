public class Monk extends Hero {
    private int spiritEnergy;
    private int maxSpiritEnergy;

    public Monk(String name) {
        super(
                name,
                250,
                Monk.r.nextInt(1, 11),
                Monk.r.nextInt(4, 6),
                Monk.r.nextInt(4, 6));
        this.maxSpiritEnergy = Monk.r.nextInt(150, 200);
        this.spiritEnergy = maxSpiritEnergy;
    }

    @Override
    public String getInfo() {
        return String.format("%s  spiritEnergy: %d ", super.getInfo(), this.spiritEnergy);
    }

    @Override
    public void step() {
        System.out.println("Step monk!");
    }

    @Override
    public void Attack() {
        System.out.println("Attack monk!");
    }
}
