import java.io.*;
import java.util.*;

public class Person {
    private int age;

    public Person(int initialAge) {
        if (initialAge > 0) {
            this.age = initialAge;
            return;
        }
        this.age = 0;
        System.out.println("Age is not valid, setting age to 0.");

        return;
    }

    public void amIOld() {
        if (this.age < 13) {
            System.out.println("You are young.");
            return;
        }

        if (this.age >= 13 && this.age < 18) {
            System.out.println("You are a teenager.");
            return;
        }

        System.out.println("You are old.");
    }

    public void yearPasses() {
        this.age++;
    }


    public static void main(String[] args) {