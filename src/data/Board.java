package data;

import java.util.Collections;
import java.util.List;

/**
 * Created by exinqan on 6/26/2017.
 */
public class Board {
    List<Integer> mTiles;

    public Board(List<Integer> tiles) {
        mTiles = tiles;
        Shuffle();
    }

    private void Shuffle() {
        Collections.shuffle(mTiles);
    }
    public int Deal(boolean order){
        if (mTiles.isEmpty()){
            return 0;
        }
        if (order){
            return mTiles.remove(0);
        }else {
            return mTiles.remove(mTiles.size()-1);
        }
    }
}
