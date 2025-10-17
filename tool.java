import java.util.Scanner;

public class tool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("         WELCOME TO MUVR          ");
        System.out.println("==================================");
        System.out.println("Please choose an option:");
        System.out.println("1. Check device connection");
        System.out.println("2. List packages or apps");
        System.out.println("3. Pull a package");
        System.out.println("4. Commands");
        System.out.println("5. Credits");
        System.out.print("Please enter your choice: ");

        String choice = scanner.nextLine();
        System.out.println("You picked: " + choice);

        try {
            switch (choice) {
                case "1":
                    runPowerShell("adb devices");
                    break;
                case "2":
                    runPowerShell("adb shell pm list packages");
                    break;
                case "3":
                    runPowerShell("adb pull /path/to/package");
                    break;
                case "4":
                    runPowerShell("Get-Command");
                    break;
                case "5":
                    System.out.println("Made by Jyomama28 on github!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } catch (Exception e) {
            System.out.println("Error running command: " + e.getMessage());
        }

        scanner.close();
    }

    private static void runPowerShell(String command) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("powershell.exe", "/c", command);
        pb.inheritIO(); 
        Process process = pb.start();
        process.waitFor(); 
    }
}
