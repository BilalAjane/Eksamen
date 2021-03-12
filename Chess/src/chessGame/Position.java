package chessGame;

public class Position<T> {
    private T piece;
    private int x;
    private int y;

    public Position(int x, int y, T piece)
    {
        this.setX(x);
        this.setY(y);
        this.piece = piece;
    }

    public T getPiece()
    {
        return this.piece;
    }

    public void setPiece(T p)
    {
        this.piece = p;
    }

    public int getX()
    {
        return this.x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return this.y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Piece: " + piece +
                ", x: " + x +
                ", y: " + y;
    }
}
