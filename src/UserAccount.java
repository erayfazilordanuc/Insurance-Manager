import java.util.*;

public class UserAccount {
    
    private String nickname = "admin";
    private String name;
    private String surname;
    private String email = "admin";
    private int age;
    private String phone;
    private String job;
    private int wage;
    private Address homeAddress = new Address("Home address");
    private Address BusinessAddress = new Address("Business address");
    private String password = "admin";
    private String type;
    private InsuranceManagement insurances;
    private boolean AuthenticationStatus = false; // isim değişebilir
    // Sisteme son giriş tarihi

    public void makeAccount(){

        if(!AuthenticationStatus){
            
        Scanner in = new Scanner(System.in);

        while(getType() == null){

        System.out.print("\nAccount type:\n\n1-Individual\n2-Enterprise\n\nYour choice : ");

        switch(in.next()){

            case "1" : setType("Individual");
            break;

            case "2" : setType("Enterprise");
            break;

            default : System.out.println("\nInvalid value!");

        }

        }
            
        System.out.print("\nNickname : ");

        setNickname(in.next());

        in.nextLine();

        System.out.print("\nName : ");

        setName(in.nextLine());

        System.out.print("\nSurname : ");

        setSurname(in.next());

        System.out.print("\nE-mail : ");

        setEmail(in.next());

        System.out.print("\nAge (Number) : ");

        setAge(in.nextInt());

        in.nextLine();

        System.out.print("\nPhone (Ex: +90 111 111 11 11) : ");

        setPhone(in.nextLine());

        System.out.print("\nJob : ");

        setJob(in.nextLine());

        System.out.print("\nWage (Number): ");

        setWage(in.nextInt());

        System.out.print("\nPassword : ");

        setPassword(in.next());

        AuthenticationStatus = true;

        System.out.println("\nAccount creation has done");
        
        }else{
            System.out.println("\nYou already have an account");
        }
    }

    public void info(){

        System.out.print("\nAccount type: " + getType() + "\nNickname: " + getNickname() 
        + "\nName: " + getName() + "\nSurname: " + getSurname() + "\nE-mail: " + getEmail()
        + "\nAge: " + getAge() + "\nPhone: " + getPhone() + "\nJob: " + getJob()
         + "\nWage: " + getWage() + "\nPassword: " + getPassword());


    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPassword() {
        return password;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String Job) {
        this.job = Job;
    }
    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
    public InsuranceManagement getInsurances() {
        return insurances;
    }
    public void setInsurances(InsuranceManagement insurances) {
        this.insurances = insurances;
    }
    public boolean isAuthenticationStatus() {
        return AuthenticationStatus;
    }
    public void setAuthenticationStatus(boolean authenticationStatus) {
        AuthenticationStatus = authenticationStatus;
    }
    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getBusinessAddress() {
        return BusinessAddress;
    }

    public void setBusinessAddress(Address BusinessAddress) {
        this.BusinessAddress = BusinessAddress;
    }

}
