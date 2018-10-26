import edu.mum.fpp.lab3.model.MyStringList;

public class Main {

    public static void main(String[] args) {

        MyStringList l = new MyStringList();
        System.out.println(l.size());
        l.add("Bob");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Steve");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Susan");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Mark");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Dave");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.remove("Mark");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.remove("Bob");
        System.out.println("The list of size " + l.size() + " is " + l);
    }
}
