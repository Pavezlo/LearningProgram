public class Horse extends classNew1{
    String name = "horse";
    String body = "big";
    String hands = "big";
    String legs = "big";

    @Override
    public void full() {
        System.out.println("Creature: " + name + ",hi have: " + body + ", "+ hands + ", " + legs);
    }
}
