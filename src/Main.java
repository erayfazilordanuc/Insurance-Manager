import java.util.*;

public class Main {
public static void main(String[] args) throws Exception {

boolean system = true, login = false, address = false;  

Scanner in = new Scanner(System.in);

UserAccount user = new UserAccount();

InsuranceManagement insurances = new InsuranceManagement(user);

while(system){

    System.out.print("\n    WELCOME TO ORDANUÇ INSURANCE    \n\n1-Log In \n2-Create Account \nq-Exit \n\nYour choice : ");

    switch(in.next()){

        case "1" : 
        
        if(user.isAuthenticationStatus()){

            System.out.print("\nNickname or e-mail : ");
            String enterance = in.next();

            System.out.print("\nPassword : ");
            String password = in.next();

            if((enterance.equals(user.getNickname()) || enterance.equals(user.getEmail())) && password.equals(user.getPassword())){

                System.out.print("\nYou have logged in");

                login = true;

                while(login){

                System.out.print("\n\n1-Insurance transactions \n2-Address operations \n3-Account info \nq-Exit \n\nYour choice : ");

                switch(in.next()){

                    case "1" : insurances.run();
                    break;

                    case "2" :

                    address = true;

                    while(address){

                        System.out.print("\n\n1-Show addresses \n2-Add home address \n3-Add job adress  \nq-Exit \n\nYour choice : ");

                        switch(in.next()){  

                            case "1" : 
                            System.out.println("\n" + user.getHomeAddress().getAddress());
                            System.out.println(user.getBusinessAddress().getAddress());
                            break;

                            case "2" : 
                            System.out.println("\nHome address");
                            user.getHomeAddress().addAddress();
                            break;

                            case "3" : 
                            System.out.println("\nJob address");
                            user.getBusinessAddress().addAddress();
                            break;

                            case "q" : address = false;
                            break;

                            default : System.out.println("\nInvalid value!");

                        }                   
        
                    }
                    break;

                    case "3" : user.info();
                    break;

                    case "q" : login = false;
                    break;

                    default : System.out.println("\nInvalid value!");

                }
                }
            }else{
                System.out.print("\nNickname or password are wrong");
            }

        }else{
            System.out.println("\nYou don't have an account");
        }
        break;

        case "2" : user.makeAccount(); insurances = new InsuranceManagement(user);
        break;

        case "q" : 
        System.out.println();
        system = false;
        break;

        default : System.out.println("\nInvalid value!");

    }

}

}
}
