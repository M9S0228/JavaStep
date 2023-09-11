public class Game{
    public enum Genre {ACTION, SPORT, RACE}
    public enum Type {VIRTUAL, PHYSICAL}
    private final String name;
    private final Genre genre;
    private final Type type;


    private Game(String name, Genre genre, Type type) {
        this.name = name;
        this.genre = genre;
        this.type = type;

    }


    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }

    public Type getType() {
        return type;
    }
    public static GameDisk getDisk(String name, Genre genre, String description){
        return new GameDisk(name, genre, description);
    }
    public static VirtualGame getVirtualGame(String name, Genre genre){
        return  new VirtualGame(name, genre);
    }





    public static class GameDisk{
        private final String description;
        private final Game data;

        private GameDisk(String name, Genre genre ,String description ){
            this.data = new Game(name,genre,Type.PHYSICAL);
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public Genre getGameGenre(){
            return data.getGenre();
        }

        public Game getData() {
            return data;
        }

        @Override
        public String toString() {
            return "GameDisk{" +
                    "description='" + description + '\'' +
                    ", data=" + data +
                    ",genre=" + getGameGenre()+
                    '}';
        }
    }

    public static class VirtualGame{
        private double rating;
        private final Game data;

        private VirtualGame(String name, Genre genre){
            this.data = new Game(name, genre, Type.VIRTUAL);
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            if (rating > 5 && rating < 0){
                return ;
            }
            else {
                this.rating = rating;
            }
        }
    }
}