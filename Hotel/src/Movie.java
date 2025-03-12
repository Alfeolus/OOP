public class Movie {
    private String title;
    private String id;
    private Director director;

    //Setter: memasukkan data ke class movie
    Movie(String title, String id, Director director){
        this.title = title;
        this.id = id;
        this.director = director;
    }

    //getter
    String getTtitle(){
        return title;
    }

    String getId(){
        return id;
    }

    String getDirector(){
        return director;
    }

}
