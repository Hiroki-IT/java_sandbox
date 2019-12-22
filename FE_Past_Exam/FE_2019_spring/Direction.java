/**
 * 現在の方角クラス
 */
public enum Direction
{
    NORTH(0,-1), // 0番目
    EAST(1,0), // 1番目
    SOUTH(0,1), // 2番目
    WEST(-1,0); // 3番目

    public int dx;

    public int dy;

    /**
     * コンストラクタ
     * 
     * @param int
     * @param int
     */
    private Direction(int dx, int dy)
    {
        this.dx = dx;
        this.dy = dy;
    }

    /**
     * 現在の座標定数から、向かって左方角の座標を返却
     * 
     * @return Direction
     */
    public Direction left()
    {
        // 左方角の座標の定義番号（0〜3）返却
        return values()[(ordinal() + 3) % 4];
    }

    /**
     * 現在の座標定数から、向かって右方角の座標を返却
     * 
     * @return Direction
     */
    public Direction right()
    {
        // 右方角の座標の定義番号（0〜3）を返却
        return values()[(ordinal() + 1) % 4];
    }
}