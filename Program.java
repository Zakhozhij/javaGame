import java.util.ArrayList;
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
        list1.add(new Magician(getName()));
        list1.add(new Robber(getName()));
        list1.add(new Sniper(getName()));
        list1.add(new Bowman(getName()));
        list1.add(new Peasant(getName()));
        list1.add(new Spearman(getName()));
        list1.add(new Monk(getName()));
        list1.add(new Sniper(getName()));
        list1.add(new Spearman(getName()));
        list1.add(new Magician(getName()));
        list1.forEach(u -> System.out.println(u.getInfo()));
        System.out.println("----------------------------");
        ArrayList<Hero> list2 = new ArrayList<>();
        list2.add(new Magician(getName()));
        list2.add(new Robber(getName()));
        list2.add(new Sniper(getName()));
        list2.add(new Bowman(getName()));
        list2.add(new Peasant(getName()));
        list2.add(new Spearman(getName()));
        list2.add(new Monk(getName()));
        list2.add(new Sniper(getName()));
        list2.add(new Spearman(getName()));
        list2.add(new Magician(getName()));
        list2.forEach(u -> System.out.println(u.getInfo()));

    }

    private static String getName() {
        return Names.values()[ThreadLocalRandom.current().nextInt(Names.values().length)].toString();
    }
}
