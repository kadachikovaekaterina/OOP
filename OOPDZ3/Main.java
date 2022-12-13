package Homework3;

public class Main {
    public static void main(String[] args) {
        CustomList<User> cl = new CustomList<>();
        cl.add(new User("Аркадий", "Шишков", 23));
        cl.add(new User("Лев", "Великов", 550));
        cl.add(new User("Виктор", "Щукин", 25));
        cl.add(new User("Пабло", "Пикассо", 645));
        cl.add(new User("Гек", "Бубкин", 12));
        cl.add(new User("Чук", "Бубкин", 12));
        for (Node node : cl) {
            System.out.println(node.getData());
        }
    }
}
