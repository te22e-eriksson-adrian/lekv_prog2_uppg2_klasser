public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("(Program started)");
        System.out.println();

        Player theHero = new Player();
        Player theEnemy = new Player();

        theHero.name = "Belerothon";
        theHero.healthPower = 20;
        System.out.println(theHero.name+" has "+theHero.healthPower+" as healthpower.");
        System.out.println();

        theEnemy.name = "Caimera";
        theEnemy.healthPower = 20;
        System.out.println(theEnemy.name+" has "+theEnemy.healthPower+" as healthpower.");
        System.out.println();

        theEnemy.healthPower = 2;
        System.out.println(theEnemy.name+" has "+theEnemy.healthPower+" as healthpower and therefore surrenderes to "+theHero.name+" who still has "+theHero.healthPower+" as healthpower.");
    }
}
