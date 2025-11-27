import java.util.Scanner;

public class MainShell {
    public static void main(String[] args) {
        Scanner shell = new Scanner(System.in);

        System.out.println("Welcome to GiyuGG Shell. Please type 'help' for the list of commands.");

        boolean running = true;
        while (running) {
            System.out.print("GiyuGG_Shell_CMDLine>> ");
            String cmdLine = shell.nextLine().trim();

            switch (cmdLine) {
                case "help":
                    help();
                    break;
                case "info":
                    info();
                    break;
                case "patch":
                    patch();
                    break;
                case "exit":
                    running = false;
                    System.out.println("Exiting GiyuGG_Shell. Goodbye!");
                    break;
                default:
                    if (!cmdLine.isEmpty()) {
                        System.out.println("Unknown command: " + cmdLine + ". Type 'help'.");
                    }
                    break;
            }
        }

        shell.close();
    }

    public static void help() {
        System.out.println("────────────────────────────────────────────");
        System.out.println("        GiyuGG_Shell — Command List");
        System.out.println("────────────────────────────────────────────");
        System.out.println("info                                 | Kyle's Information");
        System.out.println("patch                                | Version Information");
        System.out.println("exit                                 | Exit GiyuGG_Shell");
    }

    public static void info() {
        System.out.println("Kyle — GiyuGG: Developer info placeholder.");
    }

    public static void patch() {
        System.out.println("GiyuGG_Shell v0.1 — Patch/Version info placeholder.");
    }
}
