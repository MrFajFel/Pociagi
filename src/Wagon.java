import java.util.ArrayList;

public class Wagon {

    private int maxMiejsc;
    private ArrayList<Pasazer> listaPasazerow = new ArrayList<>();

    public Wagon(int maxmiejsc, ArrayList<Pasazer> pasazerowie) {
        this.maxMiejsc = maxmiejsc;
        this.listaPasazerow = pasazerowie;
    }

    public int getMaxMiejsc() {
        return maxMiejsc;
    }

    public ArrayList<Pasazer> getListaPasazerow() {
        return listaPasazerow;
    }

    public void setListaPasazerow(ArrayList<Pasazer> listaPasazerow) {
        this.listaPasazerow = listaPasazerow;
    }

    public void wyswietlInfoWagonu(){
        System.out.println("Pasażerowie:");
        wyswietlPasazerow();
        System.out.printf("Liczba miejsc: %d\n", maxMiejsc);
        System.out.printf("Liczba pasażerów w wagonie: %d\n", listaPasazerow.size());
        System.out.printf("Liczba wolnych miejsc: %d\n", maxMiejsc - listaPasazerow.size());
    }


    public void wyswietlPasazerow(){
        for (Pasazer pasazer: listaPasazerow){
            System.out.println(pasazer.toString());
        }
    }
    public int ileZeZnizkaSeniora(){
        int emeryci=0;
        for (Pasazer pasazer: listaPasazerow){
            if (pasazer.getWiek()>=65){
                emeryci++;
            }
        }
        return emeryci;


    }
}
