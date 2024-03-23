import java.util.*;

public class Address {

    private String name,country, city, district, neighbourhood, street;
    int no;

    public Address(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void addAddress(){

        String country, city, district, neighbourhood, street;
        int no;

        Scanner in = new Scanner(System.in);

        System.out.print("\nCountry : ");

        this.country = in.next();

        System.out.print("\nCity : ");

        this.city = in.next();

        System.out.print("\nDistrict : ");

        this.district = in.next();

        System.out.print("\nNeighbourhood : ");

        this.neighbourhood = in.next();

        System.out.print("\nStreet : ");

        this.street = in.next();

        System.out.print("\nNo (Number) : ");

        this.no = in.nextInt();

    }

    public String getAddress(){

        if(country == null){
            return "No " + this.name;
        }else{
        return this.name + ": " + this.country + " / " + this.city + " / " + this.district + " / " + this.neighbourhood + " neighbourhood / " + this.street + " street / No: " + this.no;
        }
    }
    
}
