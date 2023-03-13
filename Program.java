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
    public static void main(String[] args) {

        ArrayList<Hero> list1 = new ArrayList<>();
        ArrayList<Hero> list2 = new ArrayList<>();
        ArrayList<Hero> movePriority = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (ThreadLocalRandom.current().nextInt(0, 4)) {
                case 0:
                    list1.add(new Magician(getName()));
                    break;
                case 1:
                    list1.add(new Robber(getName()));
                    break;
                case 2:
                    list1.add(new Sniper(getName()));
                    break;
                case 3:
                    list1.add(new Peasant(getName()));
                    break;
                // case 4:
                // list1.add(new Peasant(getName()));
                // break;
                // case 5:
                // list1.add(new Spearman(getName()));
                // break;
                // case 6:
                // list1.add(new Monk(getName()));
                // break;
                default:
                    break;
            }
            switch (ThreadLocalRandom.current().nextInt(0, 4)) {
                // case 0:
                // list2.add(new Magician(getName()));
                // break;
                // case 1:
                // list2.add(new Robber(getName()));
                // break;
                // case 2:
                // list2.add(new Sniper(getName()));
                // break;
                case 0:
                    list2.add(new Bowman(getName()));
                    break;
                // case 4:
                // list2.add(new Peasant(getName()));
                // break;
                case 1:
                    list2.add(new Spearman(getName()));
                    break;
                case 2:
                    list2.add(new Monk(getName()));
                    break;
                case 3:
                    list2.add(new Peasant(getName()));
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
        movePriority.forEach(u -> System.out.println(u.getInfo()));
        list2.forEach(u -> u.step(list1, list2));
    }

    private static String getName() {
        return Names.values()[ThreadLocalRandom.current().nextInt(Names.values().length)].toString();
    }

}
