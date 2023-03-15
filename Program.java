import java.util.ArrayList;
import java.util.Collections;
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
    public static int UNIT = 10;

    public static void main(String[] args) {

        Board board = new Board(new Hero[10][10]);
        ArrayList<Hero> list1 = new ArrayList<>();
        ArrayList<Hero> list2 = new ArrayList<>();
        ArrayList<Hero> movePriority = new ArrayList<>();

        for (int i = 0; i < UNIT; i++) {
            switch (ThreadLocalRandom.current().nextInt(0, 4)) {
                case 0:
                    list1.add(new Magician(getName(), 1));
                    break;
                case 1:
                    list1.add(new Robber(getName(), 1));
                    break;
                case 2:
                    list1.add(new Sniper(getName(), 1));
                    break;
                case 3:
                    list1.add(new Peasant(getName(), 1));
                    break;
                default:
                    break;
            }
            switch (ThreadLocalRandom.current().nextInt(0, 4)) {
                case 0:
                    list2.add(new Bowman(getName(), 2));
                    break;
                case 1:
                    list2.add(new Spearman(getName(), 2));
                    break;
                case 2:
                    list2.add(new Monk(getName(), 2));
                    break;
                case 3:
                    list2.add(new Peasant(getName(), 2));
                    break;
                default:
                    break;
            }
        }
        // Collections.sort(list1);
        // list1.forEach(u -> System.out.println(u.getInfo()));
        // System.out.println("----------------------------");
        // Collections.sort(list2);
        // list2.forEach(u -> System.out.println(u.getInfo()));
        // System.out.println("----------------------------");

        movePriority.addAll(list1);
        movePriority.addAll(list2);
        Collections.sort(movePriority);

        for (Hero unit : movePriority) {
            if (unit.getClass().getTypeName().equals("Peasant")) {
                ((Peasant) (unit)).setDelivery(1);
            }
        }
        board.setHeroCoordinates(list1, list2);
        board.getInfo();

        // movePriority.forEach(u -> System.out.println(u.getInfo()));
        movePriority.forEach(u -> u.step(board, movePriority));

        System.out.println("--------------------------");

    }

    private static String getName() {
        return Names.values()[ThreadLocalRandom.current().nextInt(Names.values().length)].toString();
    }

}
