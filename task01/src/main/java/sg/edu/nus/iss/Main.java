package sg.edu.nus.iss;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please request: java -cp sg.edu.nus.iss.Main <CSV file> <Template file>");
            return;
        }

        String csvPath = args[0];
        String templatePath = args[1];

        System.out.println("CSV path: " + csvPath);
        System.out.println("Template path: " + templatePath);
    }
}
