package chessGame;

import java.util.Arrays;

public class Board {

    private Position[][] positions = new Position[8][8];

    public Board() {
        for(int i=0; i<positions.length; i++){
            for(int j=0; j<positions.length; j++){
                this.positions[i][j] = new Position(i, j);
            }
        }
    }

    public Position getSpot(int x, int y) {
        return positions[x][y];
    }


    public Position getBox(int x, int y) throws Exception {

        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new Exception("Index out of bound");
        }

        return boxes[x][y];
    }

    @Override
    public String toString() {
        return "Board{" +
                "boxes=" + Arrays.toString(boxes) +
                '}';
    }
}
