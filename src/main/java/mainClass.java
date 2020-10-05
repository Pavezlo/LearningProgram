public class mainClass {
    public static void main(String[] args) {
        classNew1 main1 = new Human();
        classNew1 main2 = new Horse();
        classNew1 main3 = new monkey();

        main1.full();
        main2.full();
        main3.full();

        kings papam = new kings() {
            public int param(int a, int b) {
                return a+b;
            }
        };
        kings i = (a,b) -> a+b;
        System.out.println(i.param(12,4));
        classNew2<Integer> pochka = new classNew2<>();
        pochka.setValue(12);
        System.out.println(pochka.getValue());
    }
}
