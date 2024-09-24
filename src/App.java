public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("(Program started)");
        System.out.println();

        Player theHero = new Player();
        Player theEnemy = new Player();

        theHero.name = "Belerothon";
        theHero.healthPower = 20;
        System.out.println(theHero.name+" has "+theHero.healthPower);

        theEnemy.name = "Caimera";
        theEnemy.healthPower = 20;
        System.out.println(theEnemy.name+" has "+theEnemy.healthPower);
    }
}
