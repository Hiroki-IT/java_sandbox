package FE_2019_spring;

/**
 * 迷路クラス
 */
public class Maze
{
    private final String mazeData;

    private final int width; // 西端から東端までのマス目の個数

    private final Location startLocation;

    /**
     * コンストラクタ
     *
     * @param mazeData the maze data
     * @param width    the width
     */
    public Maze(String mazeData, int width)
    {
        this.mazeData = mazeData;
        this.width = width;
        startLocation = locationOf('S');
    }

    /**
     * 開始地点の座標を返却
     *
     * @return Location start location
     */
    public Location getStartLocation()
    {
        return startLocation;
    }

    /**
     * 指定されたマス目がゴールかどうかを判定
     *
     * @param loc the loc
     *
     * @return boolean boolean
     */
    public boolean isGoal(Location loc)
    {
        return mazeData.charAt(loc.y * width + loc.x) == 'G';
    }

    /**
     * 指定されたマス目が通路かどうかを判定
     *
     * @param loc the loc
     *
     * @return boolean boolean
     */
    public boolean isBlank(Location loc)
    {
        return mazeData.charAt(loc.y * width + loc.x) != '*';
    }

    /**
     * Location of location.
     *
     * @param c the c
     *
     * @return Location location
     */
    public Location locationOf(char c)
    {
        int index = mazeData.indexOf(c);
        return new Location(index % width, index / width);
    }

}