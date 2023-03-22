import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Board {

    protected Hero[][] board = new Hero[11][11];

    public Board(Hero[][] board) {
        this.board = board;
    }

    public void setHeroCoordinates(ArrayList<Hero> team, ArrayList<Hero> team2) {
        int x;
        int y;
        x = 1;
        y = 1;
        for (Hero unit : team) {
            this.board[x][y] = unit;
            unit.position=new Vector2(x,y);
            y++;
        }
        x = 10;
        y = 1;
        for (Hero unit : team2) {
            this.board[x][y] = unit;
            unit.position=new Vector2(x,y);
            y++;
        }
    }

    public void getInfo() {
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                if (this.board[i][j] != null) {
                    System.out.printf("Coors [%d,%d] %s\n", i, j, ((Hero) (this.board[i][j])).getInfo());
                }
            }
        }
    }

    public double checkDistance(Hero h1, Hero h2) {
        int x1 = h1.position.x;
        int y1 = h1.position.y;
        int x2 = h2.position.x;
        int y2 = h2.position.y;
        double dist = 0;
        dist = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        
        // System.out.printf("[%d,%d] -> [%d,%d] -> %f\n",x1,y1,x2,y2,dist);
        return dist;
    }

    public boolean getWayToVictim(Hero h1, Hero h2) {
        int x1 = h1.position.x;
        int y1 = h1.position.y;
        int x2 = h2.position.x;
        int y2 = h2.position.y;
        Map<Integer,Integer> ways = new HashMap<>();
        checkCeils(x1,y1,ways,x2,y2);
        
        //System.out.println(ways);
        
        if((x1+1==x2 && y1==y2) || (x1-1==x2 && y1==y2) || (y1+1==y2 && x1==x2) || (y1-1==y2 && x1==x2)){
            return true;
        }else{
            double minWay=100.0;
            int minX=100;
            int minY=100;
            for (var entry : ways.entrySet()) {
                
                if(minWay>(Math.sqrt((Math.pow((x2 - entry.getKey()), 2) + Math.pow((y2 - entry.getValue()), 2))))){
                    minWay=(Math.sqrt((Math.pow((x2 - entry.getKey()), 2) + Math.pow((y2 - entry.getValue()), 2))));
                    minX=entry.getKey();
                    minY=entry.getValue();
                }
            }
            if(minX!=100 && minY!=100){
                h1.setPositionX(minX);
                h1.setPositionY(minY);
                this.board[x1][y1] = null;
            }
            return false;
        }


    }
    public void checkCeils(int x1, int y1,Map<Integer,Integer> ways,int x2, int y2){
        //System.out.println(x1+"->"+y1);
        if((x1>0 && x1+1<11 && (this.board[x1+1][y1]==null || this.board[x1+1][y1].hp==0))){
            ways.put(x1+1,y1);
        }
        if((x1-1>0 && x1<11 && (this.board[x1-1][y1]==null || this.board[x1-1][y1].hp==0))){
            ways.put(x1-1,y1);
        }
        if((y1>0 && y1+1<11 && (this.board[x1][y1+1]==null || this.board[x1][y1+1].hp==0))){
            ways.put(x1,y1+1);
        }
         if((y1-1>0 && y1<11 && (this.board[x1][y1-1]==null || this.board[x1][y1-1].hp==0))){
            ways.put(x1,y1-1);
        }
    }

    @Override
    public String toString() {
        return "Board [board=" + Arrays.toString(board) + "]";
    }

}
