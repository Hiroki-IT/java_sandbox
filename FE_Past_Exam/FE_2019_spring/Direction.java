package FE_2019_spring;

/**
 * 現在の方角クラス
 */
public enum Direction
{
    /**
     * North direction.
     */
    NORTH(0,-1), // 0番目
    /**
     * East direction.
     */
    EAST(1,0), // 1番目
    /**
     * South direction.
     */
    SOUTH(0,1), // 2番目
    /**
     * West direction.
     */
    WEST(-1,0); // 3番目

    /**
     * The Dx.
     */
    public int dx;

    /**
     * The Dy.
     */
    public int dy;

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
     * 現在の座標定数から、向かって左方角の座標を返却
     *
     * @return Direction direction
     */
    public Direction left()
    {
        // 左方角の座標の定義番号（0〜3）返却
        return values()[(ordinal() + 3) % 4];
    }

    /**
     * 現在の座標定数から、向かって右方角の座標を返却
     *
     * @return Direction direction
     */
    public Direction right()
    {
        // 右方角の座標の定義番号（0〜3）を返却
        return values()[(ordinal() + 1) % 4];
    }
}