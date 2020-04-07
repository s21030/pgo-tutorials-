public class lab5 {

    public static void main(String[] args) {

        User user1 =new User(" walterwhite@gmail.com ");
        System.out.println("Hello!"+ user1.getEmail()+"Would you like to create an account?");

        User user2 = new User("eleven@gmail.com");
        System.out.println("Hello!"+ user2.getEmail()+"Would you like to create an account?");
        user2.setName("Janusz");
        user2.setSurname("Bravo");
        user2.setPassword("haaahaha123");
        System.out.println(user2.getName() + user2.getSurname() + ", thank you for creating an account!");

        User user3 =new User(" tommy@onet.pl ");
        System.out.println("Hello!"+ user1.getEmail()+"Would you like to create an account?");

        Product product1=new Product("Wallpaper",4.99, 7777, 14);
        Product product2=new Product("Carrot",8.99,9876, 4 );
        Product product3=new Product("Chips", 4.50, 8764, 8);

        System.out.println("Product" + product1.getName() + " with code: "+ product1.getIdProduct() + " costs: "+product1.getPrice()+" zl" + " in an amount of " +product1.getNumberPiece()+" units");
        product2.setNumberPiece(5);

        System.out.println("New amount of units for product " + product2.getName()+ "- "+product2.getNumberPiece());

        System.out.println("Product " + product2.getName() + " with code: "+ product2.getIdProduct() + " costs: "+product2.getPrice()+" zł" + " in an amount of" +product2.getNumberPiece()+" units");
        product3.setPrice(9.80);

        System.out.println("New price for the product"+product3.getName()+"- "+ product3.getPrice()+" zł");

        System.out.println("Product " + product3.getName() + " with code: "+ product3.getIdProduct() + " costs: "+product3.getPrice()+" zł" + " in amount of" +product3.getNumberPiece()+" units");



        Category c1= new Category();
        Category c2= new Category ("milk", new ArrayList<String>());
        Category c3= new Category("tea");

        c1.productList.add("vegetables");
        c3.productList.add("fruits");


        Busket k1=new Busket();
        Busket k2=new Busket(new ArrayList<String>(), user2);
        Busket k3=new Busket( user3 );
        k2.products.add("cheese");
        k2.products.add("ham");
        k2.products.remove("sprite");
        k3.products.add("coca-cola");
        k3.products.add("mentos");

        System.out.println(user2.getName()+ ", in Busket are"+ k2.getProduct());
        System.out.println(user3.getName()+ ", in Busket are"+ k3.getProduct());


        for(int i=0; i<k3.product.size(); i++){
            String l=k3.product.get(i);
            System.out.println(l);
        }
        for(int i=0; i<k2.product.size(); i++){
            String l=k2.productr.get(i);
            System.out.println(l);
        }

        System.out.println("Would you like to pay for the products?");

        System.out.println(user2.getName()+", price of the products: " + product1.getPrice() + " zł");
        System.out.println(user3.getName()+", price of the products: " + (product1.getPrice()+product2.getPrice()) + " zł");


    }
}



public class Category {

    private String categoryName;
    protected ArrayList<String> productList = new ArrayList<String>();

    public Category() {
    }

    public Category(String name) {
        this.categoryName = categoryName;
    }

    public Category(String categoryName, ArrayList productList) {
        this.categoryName = categoryName;
        this.productList = productList;
    }
}


public class Busket {
    protected ArrayList<String> products = new ArrayList<>();
    Object User;



    public Busket (ArrayList<String> products, Object user) {
        this.products = products;
        User = user;
    }

    public Busket() {
    }

    public Busket(Object user) {
        User = user;
    }

    public ArrayList<String> getProducts() {
        return products;
    }

    public Object getUser() {
        return User;
    }
}

public class Product {

    private String name;
    private double price;
    private int IdProduct, NumberPiece;

    public Product(String name, double price, int IdProduct, int NumberPiece) {
        this.name = name;
        this.price = price;
        this.IdProduct = IdProduct;
        this.NumberPiece = NumberPiece;
    }

    public Product(String name, double price, int IdProduct) {
        this.name = name;
        this.price = price;
        this.IdProduct = IdProduct;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getIdProduct() {
        return IdProduct;
    }
    public int getNumberPiece() {
        return NumberPiece;
    }
    public void setNumberPiece(int NumberPiece) {
        this.NumberPiece = NumberPiece;
    }
}


public class User {

    private String name;
    private String surname;
    private String email;
    private String password;

    public User(String email) {
        this.email = email;
        if(name == null){
            System.out.println( "You are not logged in, you are shopping as a guest.");
        }
    }

    public User( String name, String surname, String email, String password) {

        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        System.out.println("You are logged in.");
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
}
