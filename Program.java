import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах. 
 * Для каждого сформировать список свойств и возможных действий. 
 * Напрнимер свойство скорость, действие нанести удар. 
 * Проанализировать получившиеся свойства и действия персонажей и 
 * создать Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. 
 * Создать этот класс. Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс. 
 * В основной программе создать по одному экземпляру каждого типа персонажей.
 * -------------------------------------------------------------------------------
 * Добавить файл с описанием интерфейса. В котором описать два метода, void step(); и String getInfo(); 
 * Реализовать интерфейсs в абстрактном классе и в наследниках так, чтобы getInfo возвращал тип персонажа. 
 * Создать два списка в классе main. В кждый из списков добавить по десять экземнляров наследников BaseHero. 
 * Удалить ненужные методы из абстрактного класса, если такие есть. 
 * В main пройти по спискам и вызвать у всех персонажей getInfo.
 */
public class Program {
    public static int GANG_SIZE = 10;
    public static ArrayList<Hero> whiteSide = new ArrayList<>();
    public static ArrayList<Hero> darkSide = new ArrayList<>();
    public static ArrayList<Hero> allUnits = new ArrayList<>();
    public static Board board = new Board(new Hero[10][10]);

    public static void main(String[] args) {

        init();
        Scanner sc = new Scanner(System.in);
        while (true) {
            rechargePeasants();
            ConsoleView.view();
            makeStep();
            sc.nextLine();
        }
        //sc.close();

    }

    private static void init() {
        for (int i = 0; i < GANG_SIZE; i++) {
            switch (ThreadLocalRandom.current().nextInt(0, 4)) {
                case 0:
                    whiteSide.add(new Magician(getName(), 1));
                    break;
                case 1:
                    whiteSide.add(new Robber(getName(), 1));
                    break;
                case 2:
                    whiteSide.add(new Sniper(getName(), 1));
                    break;
                case 3:
                    whiteSide.add(new Peasant(getName(), 1));
                    break;
                default:
                    break;
            }
            switch (ThreadLocalRandom.current().nextInt(0, 4)) {
                case 0:
                    darkSide.add(new Bowman(getName(), 2));
                    break;
                case 1:
                    darkSide.add(new Spearman(getName(), 2));
                    break;
                case 2:
                    darkSide.add(new Monk(getName(), 2));
                    break;
                case 3:
                    darkSide.add(new Peasant(getName(), 2));
                    break;
                default:
                    break;
            }
        }
        allUnits.addAll(whiteSide);
        allUnits.addAll(darkSide);
        Collections.sort(allUnits);

        board.setHeroCoordinates(whiteSide, darkSide);
        // board.getInfo();
    }

    private static void rechargePeasants() {
        for (Hero unit : allUnits) {
            if (unit.getClass().getTypeName().equals("Peasant")) {
                ((Peasant) (unit)).setDelivery(1);
            }
        }
    }

    private static String getName() {
        return Names.values()[ThreadLocalRandom.current().nextInt(Names.values().length)].toString();
    }

    private static void makeStep() {
        allUnits.forEach(u -> u.step(board, allUnits));
    }
}
