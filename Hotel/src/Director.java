public class Director {
    String name;
    String biography;

    Director(String name, String biography){
        this.name = name;
        this.biography = biography;
    }


    //getter
    String getName(){
        return name;
    }

    String getBiography(){
        return biography;
    }
}
