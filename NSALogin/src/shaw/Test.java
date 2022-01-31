package shaw;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        User user = new User(password);

        System.out.println("Password:" + user.getPassword());
        System.out.println("Salt: " + user.getSalt());
        System.out.println("Hashed Password: " + user.getHashedPassword());

        try {
            NSALoginController.hashUserPassword(user);

            System.out.println("Password: " + user.getPassword());
            System.out.println("Salt: " + user.getSalt());
            System.out.println("Hashed Password: " + user.getHashedPassword());

            System.out.print("Enter password: ");
            password = scanner.nextLine();
            user.setPassword(password);

            if (NSALoginController.verifyPassword(user)) {
                System.out.println("Verified!");
            } else {
                System.out.println("Not Verified!");
            }
        }
        catch (WeakPasswordException e) {
            System.out.println("Weak Password Error:" + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Exception " + e.toString());
        }
    }
}
