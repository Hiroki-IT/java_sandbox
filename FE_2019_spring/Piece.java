import java.util.ArrayList;
import java.util.List;

/**
 * 迷路駒クラス
 */
public class Piece
{
    private final Maze maze;

    private Location location;

    private Direction direction = Direction.NORTH;

    private final List<Direction> history = new ArrayList<>();

    /**
     * コンストラクタ
     * 
     * @param maze
     */
    public Piece(Maze maze)
    {
        this.maze = maze;
        location = maze.getStartLocation();
    }

    /**
     * 左に向きを変える
     */
    public void turnLeft()
    {
        direction = direction.left();
    }

    /**
     * 右に向きを変える
     */
    public void turnRight()
    {
        direction = direction.right();
    }

    /**
     * 前方のマス目に進む
     * 
     * @return boolean
     */
    public boolean tryStepForward()
    {
        if(maze.isBlank(nextLocation)){ // 前方のマス目が通路の場合
            Location nextLocation = new Location(location.x + direction.dx, location.y + direction.dy);
            location = nextLocation; // 前方のマス目に進む
            history.add(direction);
            return true;
        }
        return false; // 前方のマス目が通路でない場合
    }

    /**
     * 現在地がゴールかどうかを判定
     * 
     * @return boolean
     */
    public boolean isAtGoal()
    {
        return maze.isGoal(location);
    }

    /**
     * 履歴リストを返却
     * 
     * @return List
     */
    public List<Direction> getHistory()
    {
        return new ArrayList<>(history);
    }
}