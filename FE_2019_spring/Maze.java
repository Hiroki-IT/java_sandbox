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
     * @param mazeData
     * @param width
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
     * @return Location
     */
    public Location getStartLocation()
    {
        return startLocation;
    }

    /**
     * 指定されたマス目がゴールかどうかを判定
     * 
     * @param loc
     * @return boolean
     */
    public boolean isGoal(Location loc)
    {
        return mazeData.charAt(loc.y * width + loc.x) == 'G';   
    }

    /**
     * 指定されたマス目が通路かどうかを判定
     * 
     * @param loc
     * @return boolean
     */
    public boolean isBlank(Location loc)
    {
        return mazeData.charAt(loc.y * width + loc.x) != '*';   
    }

    /**
     * 
     * @param String
     * @return Location
     */
    public Location locationOf(char c)
    {
        int index = mazeData.indexOf(c);
        return new Location(index % width, index / width);
    }

}