package zulpikar;



public abstract class Movie{
    public abstract void makeMovie();
}

abstract class Comedy extends Movie{
    public abstract void makeJoke();
}

class StandUP extends Comedy{
    public void makeJoke(){
        System.out.println("Joke");
    }
}