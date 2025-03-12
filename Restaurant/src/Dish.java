public class Dish {
    public String name;
    public String id;
    public Chef chef;

    public Dish(String name, String id, Chef chef){
        this.name = name;
        this.id = id;
        this.chef = chef;
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }

    public Chef getChef(){
        return chef;
    }

    public void display(){
        System.out.println("Dish Name : " + name);
        System.out.println("Dish ID : " + id);
        System.out.println("Chef Name : " + chef.getName());
        System.out.println("Chef Biography : " + chef.getBiography());
    }
}
