
public class Spearman extends Infantry{


    public Spearman(String name, int team) {
        super(
                name,
                team,
                10,
                4,
                4,
                5,
                Spearman.r.nextInt(1, 4));
    }
    public Spearman() {
        super();
    }
    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }
    @Override
    public String getName(){
        return "Spearman";
    }
}
