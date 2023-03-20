import java.util.ArrayList;
import java.util.Arrays;

public class Board {

    protected Hero[][] board = new Hero[10][10];

    public Board(Hero[][] board) {
        this.board = board;
    }

    public void setHeroCoordinates(ArrayList<Hero> team, ArrayList<Hero> team2) {
        int x;
        int y;
        x = 0;
        y = 0;
        for (Hero unit : team) {
            this.board[x][y] = unit;
            unit.position=new Vector2(x+1,y+1);
            y++;
        }
        x = 9;
        y = 0;
        for (Hero unit : team2) {
            this.board[x][y] = unit;
            unit.position=new Vector2(x+1,y+1);
            y++;
        }
    }

    public void getInfo() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.board[i][j] != null) {
                    System.out.printf("Coors [%d,%d] %s\n", i, j, ((Hero) (this.board[i][j])).getInfo());
                }
            }
        }
    }

    public double checkDistance(Hero h1, Hero h2) {
        int x1 = -1;
        int y1 = -1;
        int x2 = -1;
        int y2 = -1;
        double dist = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (this.board[i][j] != null && this.board[i][j].equals(h1)) {
                    x1 = i;
                    y1 = j;
                    // System.out.printf("Hero 1 Coors [%d,%d]
                    // %s\n",i,j,((Hero)(this.board[i][j])).getInfo());
                }
                if (this.board[i][j] != null && this.board[i][j].equals(h2)) {
                    x2 = i;
                    y2 = j;
                    // System.out.printf("Hero 2 Coors [%d,%d]
                    // %s\n",i,j,((Hero)(this.board[i][j])).getInfo());
                }
            }
        }
        if (x1 >= 0 && y1 >= 0 && x2 >= 0 && y2 >= 0) {
            dist = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        } else {
            dist = 11;
        }
        // System.out.printf("[%d,%d] -> [%d,%d] -> %f\n",x1,y1,x2,y2,dist);
        return dist;
    }

    @Override
    public String toString() {
        return "Board [board=" + Arrays.toString(board) + "]";
    }

}
