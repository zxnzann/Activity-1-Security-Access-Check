public class AccessCheck {
    public static void main(String[] args) {
       
       int userAge = 17;
       int securityPin = 4321;

       if (userAge >= 18) {
        System.out.println("Adult account Verified.");
       } if (securityPin == 4321) {
        System.out.println("Access Granted.");
       }
       else {
        System.out.println("Access Denied: Invalid Pin.");
       }
    }
} 