package restaurant;

import people.Chef;
import people.Visitor;
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private ArrayList<Menu> menus = new ArrayList<Menu>();
    private ArrayList<Chef> chefs = new ArrayList<Chef>();

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    public void showMenu() {
        System.out.println("Rumah Sambal Menu: ");
        for (Menu menu : menus) {
            System.out.println(menu.getType());
            for (Food food : menu.getFoods()) {
                System.out.println(food.getName() + " - Rp" + food.getPrice());
            }
        }
    }

    public void showChef() {
        System.out.println("Rumah Sambal Chef: ");
        for (Chef chef : chefs) {
            System.out.println(chef.getName());
        }
    }
    
}
