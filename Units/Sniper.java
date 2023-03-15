import java.util.ArrayList;

public class Sniper extends Shooter{
    

    public Sniper(String name, int team) {
        super(
                name,
                team,
                15,
                9,
                12,
                10,
                Sniper.r.nextInt(8,11),
                32,
                32);
    }
    public Sniper() {
        super();
    }
    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

    
}
