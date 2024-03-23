public class Insurance{
    
    private String name;
    private double cost;
    private Date date;
    private UserAccount user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public Insurance(String name, double cost, Date date, UserAccount user){

        this.name = name;
        this.cost = cost;
        this.date = date;
        this.user = user;

    }

    public double calculate(){

        return cost;

    }
    
}
