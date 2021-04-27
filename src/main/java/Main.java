import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Worker[] workers = new Worker[5];
        int normalValue;
        String surnameAndInitials;
        String position;
        int yearWhenStarted;

        try {
            for (int i = 0; i < workers.length; i++) {
                System.out.println("Surname and initials : ");
                surnameAndInitials = input.next();
                System.out.println("Position : ");
                position = input.next();
                System.out.println("Year when started :  ");
                yearWhenStarted = Integer.parseInt(input.next());
                workers[i] = new Worker(surnameAndInitials, position, yearWhenStarted);
            }

        } catch (NumberFormatException e) {
            System.err.println("Wrong year format");
        }

        Arrays.sort(workers, Worker::compareTo);
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        System.out.println("Enter the experience value : ");
        normalValue = Integer.parseInt(input.next());
        try {
            int experience;
            for (Worker worker : workers) {

                experience = 2021 - worker.yearWhenStarted;
                if (experience > normalValue) {
                    System.out.println(worker.surnameAndInitials);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong number format");
        }

    }


}