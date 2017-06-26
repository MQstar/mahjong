package data;

import java.util.List;

/**
 * Created by exinqan on 6/26/2017.
 */
public class Player {
    List<Integer> mTiles;
    List<Meld> mMelds;
    int points;//may be short
    public Player() {
    }
    public void Draw(int tile){
        mTiles.add(tile);
    }
    public boolean Discard(int tile){
        if (mTiles.contains(tile)){
            mTiles.remove(tile);
            return true;
        }
        return false;
    }
    public void Pong(int tile){

    }
    public void Kong(int tile){

    }
    public void Chow(int tile){

    }
    public void readyHand(){

    }
}
