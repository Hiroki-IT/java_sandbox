/**
 * 雛形クラス
 */
public class Template
{
    List<Fragment> fragmentList;

    /**
     * コンストラクタ
     * 
     * @param List
     */
    Template(List<Fragment> fragmentList)
    {
        this.fragmentList = fragmentList;
    }

    /**
     * 置換表を雛形に適用し、作成した文書を返却
     * 
     * @param Map
     * @return
     */
    public String apply(Map<String, List<String>> table)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for(Fragment fragment : fragmentList) { // 拡張for文
            stringBuilder.append(fragment.replace(table)); // StringBuilerクラスに格納
        }

        return stringBuilder.toString(); // オブジェクトを文字列に変換し、文書として返却
    }

}