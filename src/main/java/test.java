
public class test{
    public static void main(String[] args) {
        Animal cat=() ->System.out.println("吃猫粮");
        cat.eat();
        Animal dog=() ->System.out.println("吃狗粮");
        dog.eat();
    }
}
