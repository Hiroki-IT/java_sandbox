package FE_2019_spring;

import java.util.List;

/**
 * mainメソッド実行クラス
 */
public class PlayMaze
{
    /**
     * mainメソッド
     *
     * @param args the input arguments
     */
    public static void main(String... args)
    {
        Maze maze = new Maze("*******" +
                             "*..*..*" +
                             "*S**.**" + 
                             "*****.*" + 
                             "*****.*" + 
                             "*G....*" + 
                             "*******", 7
                             ); // 迷路を定義

        Piece piece = new Piece(maze);

        while (!piece.isAtGoal) {
            piece.turnLeft();
            
            while(!piece.tryStepForward()){
                piece.turnRight();
            }
        }

        List<Direction> history = piece.getHistory();
        
        System.out.println(history);
    }

}