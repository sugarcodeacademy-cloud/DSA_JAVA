package Functions;

public class Login {

    static void validUser(String userID){
        if(userID == "Vinod"){
            System.out.println("normal user");
        }
        else if(userID == "Usha"){
            System.out.println("premium User");
        }
        else{
            System.out.println("Invalid user");
        }

    }
    public static void main(String[] args) {
        validUser("Vinod");
        validUser("Usha");
        validUser("Alex");
        validUser("Sony");

    }
}
