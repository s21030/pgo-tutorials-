import java.util.*;
public class lab11_2 {
    public static void main(String[] args) {


        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        HashSet<Item> hashSet = new HashSet<>();
        ArrayList<Item> items = new ArrayList<>();

        Item i1 = new Item("thing1", 1);
        Item i2 = new Item("thing2", 2);
        Item i3 = new Item("thing3", 3);
        Item i4 = new Item("thing4", 4);
        Item i5 = new Item("thing5", 5);


        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);

        i1.show();
        i2.show();
        i3.show();
        i4.show();
        i5.show();
        for (Item i : items) {
            hashMap.put(i.getId(), i.getName());
        }
        for (Map.Entry<Integer, String> entry : hashMap.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());

        Item i6 = new Item("thing6", 6);
        Item i7 = new Item("thing7", 7);
        Item i8 = new Item("thing8", 8);
        Item i9 = new Item("thing9", 9);
        Item i10 = new Item("thing10", 10);
        Item i11 = new Item("thing11", 11);
        Item i12 = new Item("thing12", 12);
        Item i13 = new Item("thing13", 13);
        Item i14 = new Item("thing14", 14);
        Item i15 = new Item("thing15", 15);

        items.add(i6);
        items.add(i7);
        items.add(i8);
        items.add(i9);
        items.add(i10);
        items.add(i11);
        items.add(i12);
        items.add(i13);
        items.add(i14);
        items.add(i15);
        try {
            List<Item> items2 = items.subList(0, 5);
            for (Item i : items2) {
                hashSet.add(i);
            }

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception : " + e);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception : " + e);
        }
    }
}
class Item {

    private String name;
    private int id;

    public Item (String name, int id){
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(this.name);
    }

}