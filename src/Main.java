import java.util.ArrayList;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pasazer pas1 = new Pasazer("ryszard","wow",12);
        pas1.wyswietl();
        Pasazer pas2 = new Pasazer("Fifi","fajfel",20);
        pas2.wyswietl();
        ArrayList<Pasazer> pasazerowie = new ArrayList<>();
        pasazerowie.add(pas1);
        pasazerowie.add(pas2);
        Wagon wagon = new Wagon(20, pasazerowie);
        wagon.wyswietlInfoWagonu();
    }
}