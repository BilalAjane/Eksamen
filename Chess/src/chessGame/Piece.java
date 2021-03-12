package chessGame;

public abstract class Piece {

    public String color = "";

    public Piece(String color) {
        if(color.equals("Black") || color.equals("White")) {
        this.color = color;
        } else {
            System.out.println("Color unable!");
        }
    }
  // Enumerated type!


}
