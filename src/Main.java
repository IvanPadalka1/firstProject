import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.greet("Aid", "2018");
        main.remindName();
        main.guessAge();
        main.count();
        main.test();
        main.end();
    }

    void greet(String assistantName, String birthYear) {
        System.out.println(" Hello! My name is " + assistantName + ".\n" +
                " I was created in " + birthYear + ".\n" +
                " Please, remind me your name.");
    }

    void remindName() {
        String name = scanner.nextLine();
        System.out.println(" What a great name you have, " + name + "!");
    }

    void guessAge() {
        int age;
        System.out.println(" Let me guess your age.\n " +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        age = (scanner.nextInt() * 70 + scanner.nextInt() * 21 + scanner.nextInt() * 15) % 105;
        System.out.println(" Your age is " + age + "; that's a good time to start programming!");
    }

    void count() {
        int num;
        System.out.println(" Now I will prove to you that I can count to any number you want.");
        num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    void test() {
        int switcher;
        System.out.println(" Let's test your programming knowledge.\n " +
                "Why do we use methods?\n " +
                "1. To repeat a statement multiple times.\n " +
                "2. To decompose a program into several small subroutines.\n " +
                "3. To determine the execution time of a program.\n " +
                "4. To interrupt the execution of a program.");
        loop: while (true){
        switcher = scanner.nextInt();
        switch (switcher){
            default:{
                System.out.println(" Please, try again.");
                break;
            }
            case 3,4:{
                new Main().end();
                break loop;
            }
        }
        }
    }

    void end() {
        System.out.println(" Congratulations, have a nice day!");
    }
}
