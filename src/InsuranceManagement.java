import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashMap;

public class InsuranceManagement {

    Scanner in = new Scanner(System.in);
    
    private TreeSet<Insurance> insuranceList = new TreeSet<>(new CompareAlphabetic());

    HashMap<String, Insurance> map = new HashMap<>();

    UserAccount user;

    Insurance HealthInsurance = new Insurance("Health insurance", 35400, new Date("02", "03", "04"), user);
    
    Insurance CarInsurance = new Insurance("Car insurance", 36400, new Date("02", "03", "04"), user);

    Insurance ResidanceInsurance = new Insurance("Residance insurance", 37400, new Date("02", "03", "04"), user);

    Insurance TravelInsurance = new Insurance("Travel insurance", 34400, new Date("02", "03", "04"), user);
    
    public InsuranceManagement(UserAccount user) {
        this.user = user;
    }

    public void run(){

    boolean state = true;

    while(state){

    System.out.print("\n1-Show insurances\n2-Add insurance\n3-Delete insurance\nq-Exit\n\nYour choice : ");

        switch(in.next()){

            case "1" : printList();
            break;

            case "2" : addInsurance();
            break;

            case "3" : deleteInsurance();
            break;

            case "q" : state = false;
            break;

        }

    }

    }

    public void printList(){// iterator

        if(this.insuranceList.size() > 0){

        Iterator<Insurance> iterator = insuranceList.iterator();

        System.out.println();

        int sayac = 1;

        while (iterator.hasNext()) {

            Insurance element = iterator.next();

            System.out.println(sayac++ + "-" + element.getName());

        }

        }else{

            System.out.println("\nNo insurance");

        }
        
    }

    public void addInsurance(){

    System.out.print("\nChoose the type of insurance\n\n1-Health insurance\n2-Car insurance\n3-Residance insurance\n4-Travel insurance\n\nYour choice : ");

    switch(in.next()){

        case "1" :

        if(!this.insuranceList.contains(HealthInsurance)){
        insuranceList.add(HealthInsurance);
        }else{
            System.out.println("\nYou already have a health insurance");
        }

        break;

        case "2" :
        
        if(!this.insuranceList.contains(CarInsurance)){
        insuranceList.add(CarInsurance);
        }else{
            System.out.println("\nYou already have a car insurance");
        }

        break;

        case "3" :

        if(!this.insuranceList.contains(ResidanceInsurance)){
        insuranceList.add(ResidanceInsurance);
        }else{
            System.out.println("\nYou already have a residance insurance");
        }

        break;

        case "4" :

        if(!this.insuranceList.contains(TravelInsurance)){
        insuranceList.add(TravelInsurance);
        }else{
            System.out.println("\nYou already have a travel insurance");
        }

        break;

    }

    int value = 1;
    for (Insurance element : insuranceList) {
        map.put(Integer.toString(value++), element);
    }

    }

    public void deleteInsurance(){

    printList();

    if(this.insuranceList.size() > 0){

    System.out.print("n-No one\n\nYour choice : ");

    String choice = in.next();

    if(!choice.equals("n")){
    insuranceList.remove(map.get(choice));
    }

    int value = 1;
    for (Insurance element : insuranceList) {
        map.put(Integer.toString(value++), element);
    }

    }

    }

}
