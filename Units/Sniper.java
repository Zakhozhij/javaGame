public class Sniper extends Hero{
    
    private int shots;
    private int maxShots;

    public Sniper(String name) {
        super(
                name,
                200,
                Sniper.r.nextInt(1,10),
                Sniper.r.nextInt(1,5),
                Sniper.r.nextInt(4,7));
        this.maxShots = Sniper.r.nextInt(20,30);
        this.shots = maxShots;
    }
    @Override
    public String getInfo() {
        return String.format("%s shots: %d", super.getInfo(), this.shots);
    }

    @Override
    public void step(){
        System.out.println("Step sniper!");
    }

    @Override
    public void Attack() {
        System.out.println("Attack sniper!");
    }
}
