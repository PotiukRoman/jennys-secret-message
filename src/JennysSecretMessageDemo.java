class Greeter {
    static String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        }
        return String.format("Hello, %s!", name);

    }
}

public class JennysSecretMessageDemo {
    public static void main(String[] args) {
        System.out.println(Greeter.greet("Jim"));
        System.out.println(Greeter.greet("Jane"));
        System.out.println(Greeter.greet("Simon"));
        System.out.println(Greeter.greet("Johnny"));
    }

}
