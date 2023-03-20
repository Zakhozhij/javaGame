import java.util.ArrayList;

public class Peasant extends Hero {

    
    private int delivery;

    public Peasant(String name,int team) {
        super(
                name,
                team,
                1,
                3,
                1,
                1,
                1);
        this.delivery = 1;
    }
    public Peasant() {
        super();
    }
    
    @Override
    public String getInfo() {
        return String.format("%s", super.getInfo());
    }

    @Override
    public void step(Board board,ArrayList<Hero> moveList) {
        //System.out.println("Step peasant!");
    }

    @Override
    public void Attack(Hero target) {
        //System.out.println("Attack peasant!");
    }


    public int getDelivery() {
        return delivery;
    }
    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }
    @Override
    public String getName(){
        return "Peasant";
    }
}
