import java.util.ArrayList;

public class Monk extends Infantry {
    private int magic;
    private int maxMagic;

    public Monk(String name,int team) {
        super(
                name,
                team,
                30,
                5,
                12,
                7,
                -4);
        this.maxMagic = 1;
        this.magic = maxMagic;
    }
    public Monk() {
        super();
    }

    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

   

    public int getMagic() {
        return magic;
    }

    public int getMaxMagic() {
        return maxMagic;
    }
    @Override
    public String getName(){
        return "Monk";
    }
}
