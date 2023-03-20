public class Bowman extends Shooter {

    public Bowman(String name, int team) {
        super(
                name,
                team,
                10,
                4,
                6,
                3,
                Bowman.r.nextInt(2, 4),
                16);
    }

    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }
    @Override
    public String getName(){
        return "Bowman";
    }

}
