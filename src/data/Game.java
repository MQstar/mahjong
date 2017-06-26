package data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by exinqan on 6/26/2017.
 */
public class Game {
    List<Player> mPlayers;
    Board mBoard;

    public Game() {
        mPlayers=new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            mPlayers.add(new Player());
        }
        ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = -8; i < 144; i++) {

        }
        mBoard=new Board(tmp);
    }
}
