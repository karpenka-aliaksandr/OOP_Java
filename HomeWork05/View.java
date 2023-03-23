import java.util.Scanner;

public class View {
    private String data;
    private Menu menu;
    private String bar;
    Scanner scan;

    public View(String data, Menu menu) {
        this.data = data;
        this.menu = menu;
        this.bar = "";
        this.scan = new Scanner(System.in);
    }

    public View(String data) {
        this(data, new Menu());
    }

    public View(Menu menu) {
        this("", menu);
    }

    public View() {
        this("");
    }

    public void show() {
        System.out.print("\033[H\033[J");
        System.out.println(data);
        System.out.println(menu);
        System.out.println(bar);
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
        show();
    }

    public void setData(String data) {
        this.data = data;
        show();
    }
    
    public void setBar(String bar) {
        this.bar = bar;
        show();
    }

    public int getInt() {
        String s = scan.next();
        int x = -1;
        try {
            x = Integer.parseInt(s);   
        } catch (Exception e) {
            
        }
        return x;
    }
    
    public Menu getMenu() {
        return menu;
    }

}
