package a;


import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[7];
        for (int i = 0; i < 7; i++) {
            int randomNumber = random.nextInt(49) + 1;
            numbers[i] = randomNumber;
        }
        System.out.println("Randomly selected numbers: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}