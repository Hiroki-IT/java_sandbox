import java.util.Random;

public class FortuneTelling
{
    public static void main(String[] args)
    {
        System.out.println("ようこそ。あなたの明日の運勢を占います。");
        
        System.out.println("名前を入力してください。");
        
        String name = new java.util.Scanner(System.in).nextLine();
        
        System.out.println("年齢を入力してください。");
        
        String ageString = new java.util.Scanner(System.in).nextLine();
        
        int age = Integer.parseInt(ageString);
        
        int fortune = new java.util.Random().nextInt(6) + 1;
        
        System.out.println(fortune);
        System.out.println("占いの結果が出ました。");
        System.out.println(age + "歳の" + name + "さん。");

        switch (fortune) {
            case 1:
            case 2:
            System.out.println("明日の運勢は大吉です。");
                break;
            case 3:
            case 4:
                System.out.println("明日の運勢は中吉です。");
                break;
            case 5:
            case 6:
                System.out.println("明日の運勢は吉です。");
                break;
            case 7:
                System.out.println("明日の運勢は凶です。");
                break;            
        };
    }
}