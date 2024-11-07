package animal;

public class Human extends Animal implements Thinkable {
    // 趣味の情報を保管するフィールド
    private String hobby;

    //コンストラクタ
    public Human() {
    }

    public Human(String name, int age, String hobby) {
        super(name, age); // スーパークラス(Animal)のコンストラクタを呼び出し
        this.hobby = hobby;
    }

    // thinkメソッド
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }

}
