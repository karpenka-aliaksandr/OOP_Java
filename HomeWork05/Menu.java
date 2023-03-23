
import java.util.ArrayList;

public class Menu {
    private ArrayList<PunktMenu> puncts;
    public int countPunkts;

    public Menu() {
        this.puncts = new ArrayList<>();
        this.countPunkts = 0;
    }

    public void addPunkt(PunktMenu punktMenu) {
        if (puncts.add(punktMenu))
            countPunkts++;
    }

    public void clear() {
        this.puncts = new ArrayList<>();
        this.countPunkts = 0;
    }

    public PunktMenu getPunkt(int number){
        if (number >0 && number <= countPunkts){
            return this.puncts.get(number-1);
        } else {
            return null;
        }
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        sb.append("Меню:\n");
        for (PunktMenu punktMenu : puncts) {
            sb.append(String.format("%d. %s\n", i++, punktMenu));
        }
        return sb.toString();
    }
}
