import java.util.Scanner;

public class SupportCareSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display options to user
        System.out.println("Welcome to Lenovo Support Care System");
        System.out.println("Please choose your plan:");
        System.out.println("1. Basic Support");
        System.out.println("2. Medium Support");
        System.out.println("3. Premium Support");
        
        int choice = scanner.nextInt();
        
        // Declare the abstract type SupportCare
        SupportCare support = null;

        // Choose the support plan based on user input
        switch (choice) {
            case 1:
                support = new BasicSupportCare();
                System.out.println("You have selected Basic Support.");
                break;
            case 2:
                support = new MediumSupportCare();
                System.out.println("You have selected Medium Support.");
                break;
            case 3:
                support = new PremiumCare();
                System.out.println("You have selected Premium Support.");
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                return;
        }

        // Display the selected plan's service details
        System.out.println(support.getServiceDetails());

        scanner.close();
    }
}



abstract class SupportCare {
    public abstract String getServiceDetails();
}


class BasicSupportCare extends SupportCare {
    @Override
    public String getServiceDetails() {
        return "Basic Support includes: \n- 9 AM to 6 PM Service \n- Monday to Friday availability.";
    }
}

class MediumSupportCare extends SupportCare {
    @Override
    public String getServiceDetails() {
        return "Medium Support includes: \n- 24/7 Service \n- Priority resolution of issues.";
    }
}


class PremiumCare extends SupportCare {
    @Override
    public String getServiceDetails() {
        return "Premium Support includes: \n- 24/7 Dedicated Support \n- VIP access to technical specialists.";
    }
}
