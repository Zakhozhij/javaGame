public class Spearman extends Hero{
    private int endurance;
    private int maxEndurance;

    public Spearman(String name) {
        super(
                name,
                150,
                Spearman.r.nextInt(1, 6),
                Spearman.r.nextInt(1, 4),
                Spearman.r.nextInt(1, 4));
        this.maxEndurance = Spearman.r.nextInt(80, 120);
        this.endurance = maxEndurance;
    }
    @Override
    public String getInfo() {
        return String.format("%s  endurance: %d ", super.getInfo(), this.endurance);
    }
    
    @Override
    public void step(){
        System.out.println("Step spearman!");
    }

    @Override
    public void Attack() {
        System.out.println("Attack spearman!");
    }
}
