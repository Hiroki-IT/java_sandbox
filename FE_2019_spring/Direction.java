/**
 * Enum型方角クラス
 */
public enum Direction
{
    NORTH(0,-1), // 座標定数
    EAST(1,0),
    SOUTH(0,1),
    WEST(-1,0);

    public int dx, dy;

    /**
     * コンストラクタ
     * 
     * @param dx
     * @param dy
     */
    private Direction(int dx, int dy)
    {
        this.dx = dx;
        this.dy = dy;
    }

    /**
     * 左の方角を返却
     * 
     * @return Direction
     */
    public Direction left()
    {
        return values()[(original() + 3) % 4];
    }

    /**
     * 右の方角を返却
     * 
     * @return Direction
     */
    public Direction right()
    {
        return values()[(original() + 1) % 4];
    }
}