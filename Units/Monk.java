import java.util.ArrayList;

public class Monk extends Supports {


    public Monk(String name,int team) {
        super(
                name,
                team,
                30,
                5,
                12,
                7,
                -4,
                1);
    }
    public Monk() {
        super();
    }

    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

    @Override
    public String getName(){
        return "Monk";
    }
}
