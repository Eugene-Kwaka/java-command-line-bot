package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Which web framework is based off Java?");

        String ans1 = "1. Django";
        System.out.println(ans1);
        String ans2 = "2. Spring Boot";
        System.out.println(ans2);
        String ans3 = "3. Laravel";
        System.out.println(ans3);
        String ans4 = "4. NET";
        System.out.println(ans4);

        String ans = scanner.nextLine();

        if (ans.equals("1")) {
            System.out.println("Please, try again.");
            test();
        } else if (ans.equals("2")) {
            end();
        } else if (ans.equals("3")) {
            System.out.println("Please, try again.");
            test();
        } else if (ans.equals("4")) {
            System.out.println("Please, try again.");
            test();
        }

    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
