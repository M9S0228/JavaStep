import java.util.Arrays;
import java.util.Comparator;

public class PlayRoom {
    public static void main(String[] args) {
       Game.GameDisk[] physicalDisks = new Game.GameDisk[4];
       physicalDisks[0] = Game.getDisk("CS:GO 2", Game.Genre.ACTION, "Shooter... to the best haters" );
       physicalDisks[1] = Game.getDisk("Forza Horizon 5", Game.Genre.RACE, "Racing... to the best haters" );
       physicalDisks[2] = Game.getDisk("NBA2022", Game.Genre.SPORT, "BasketBall... to the best haters" );
       physicalDisks[3] = Game.getDisk("PES2023", Game.Genre.SPORT, "FootBall... to the best haters" );


       Game.VirtualGame[] virtualGames = new Game.VirtualGame[4];
       virtualGames[0] = Game.getVirtualGame("PUBG", Game.Genre.ACTION);
       virtualGames[1] = Game.getVirtualGame("Valorant", Game.Genre.ACTION);
       virtualGames[2] = Game.getVirtualGame("Minecraft", Game.Genre.ACTION);
       virtualGames[3] = Game.getVirtualGame("Forza Horizon 4", Game.Genre.RACE);

       GameConsole console = new GameConsole(GameConsole.Brand.MICROSOFT, "BX4263");


       Arrays.sort(physicalDisks, new Comparator<Game.GameDisk>() {
           @Override
           public int compare(Game.GameDisk o1, Game.GameDisk o2) {
               return o1.getGameGenre().compareTo(o2.getGameGenre());
           }
       });
        for (int i = 0; i < physicalDisks.length; i++) {
            System.out.println(physicalDisks[i].toString());
        }
    }
}
