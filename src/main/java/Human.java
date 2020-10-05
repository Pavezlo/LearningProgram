public class Human extends classNew1 {
    String name = "human";
    String body = "medium";
    String hands = "medium";
    String legs = "medium";

    @Override
    public void full() {
        System.out.println("Creature: " + name + ",hi have: " + body + ", "+ hands + ", " + legs);
    }
}
