public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(100);
        boss.setDefenseType("Physical Damage");
        System.out.println("Boss:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("DefenseType: " + boss.getDefenseType());

        Hero [] heroes = createHeroes();
        System.out.println("    ");
        System.out.println("Heroes");
        for (Hero hero : heroes) {

            System.out.println("Name: " + hero.getName());
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + hero.getSuperpower());
            System.out.println(   );
        }
    }
public static Hero[] createHeroes(){
    Hero hero1 = new Hero ("Artur", 200, 20, "Fire");
    Hero hero2 = new Hero ("Anvar", 150, 20, "water");
    Hero hero3 = new Hero( "Aman", 100, 20, "air");
    return new Hero[] {hero1, hero2, hero3};
}
}
