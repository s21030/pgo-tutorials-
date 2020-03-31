public class lab4 {
    public static void main(String[] args){


        User user1 = new User("borubar@gmail.com");
        User user2= new User("bomba@interia.pl");

        User user1 = new User( "Johny", "Bravo", "bravo@gmail.com","aaaa4321");
        User user2 = new User("xxxx", "yyyy", "xyxy@interia.pl", "aaaaaa1234");



        Product p1 = new Product("trousers", 100.00,234319875, 0);
        Product p2 = new Product("wipes", 1.99,988493746, 10);
        Product p3 = new Product("t-shirt", 90, 988736789, 200);
        p3.setPrice(1.99);
        p3.setPrice(90);

    }

}

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private boolean guest;

    public User(String email){
        this.email = email;
        this.guest = true;
    }

    public User(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.guest = false;
    }
    public User( User user, String name, String surname, String password){
        this.email = user.getEmail();
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.guest = false;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGuest() {
        return guest;
    }

    public void setIsGuest(boolean isGuest) {
        this.guest = isGuest;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", guest=" + guest +
                '}';
    }
}
public class Product {
    private String name;
    private double price;
    private int id;
    private int number;


    public Product(String name, double price, int id){
        this.name = name;
        this.price = price;
        this.id = id;
        this.number = 0;

        if(number < 0){
            throw new IllegalArgumentException("number of units can not be lower than 1.");
        }
    }

    public Product(String name, double price, int id, int number) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.number = number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public double getPrice(int i) {
        return price;
    }

    public int getId() {
        return id;
    }

    public int getNumber(int i) {
        return number;
    }



}

