package OOPDZ4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Великий Герой", 120, new Staff(), new HeavyShield());
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Везиль", 100, new Bow(), new BucklerShield(), 10));
        red.add(new Archer("Робин Гуд", 100, new Bow(), 10));
        red.add(new Archer("Берди Крог", 100, new LongBow(), new BucklerShield(), 10));
        Hero hero2 = new Hero("Леголас", 150, new Bow(), new HeavyShield());
        Team<Mage> white = new Team<>(hero2);
        white.add(new Mage("Гендольф", 80, new Staff(), new RoundShield(), 15, 100));
        white.add(new Mage("Йеннифэр", 80, new Staff(), new RoundShield(), 15, 100));
        white.add(new Mage("Доктр Стрэндж", 80, new Staff(), 15, 100));
        Hero hero3 = new Hero("Мастер", 160, new Bow());
        Team<Warrior> multi = new Team<>(hero3);
        multi.add(new Mage("Геральт", 80, new Staff(), new RoundShield(), 15, 100));
        multi.add(new Archer("Рункер", 100, new Bow(), new BucklerShield(), 10));
        multi.add(new Archer("Сибелия", 100, new Bow(), new BucklerShield(), 10));
        System.out.println(red);
        System.out.println(white);
        System.out.println(multi);
        System.out.println(red.getTeamHealthPoint());
        System.out.println(white.getTeamHealthPoint());
        System.out.println(multi.getTeamHealthPoint());

    }
}
