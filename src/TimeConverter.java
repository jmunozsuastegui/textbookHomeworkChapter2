import java.util.Scanner;
public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the total number of seconds: ");
        int totalSeconds = input.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("If the total number of seconds is " + totalSeconds + " it is " + hours + " hours, " + minutes +
                " minutes, and " + seconds + " seconds");
    }

}
