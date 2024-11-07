package animal;

public class Animal {
    // 名前と年齢を格納するフィールド
    private String name;
    private int age;

    // コンストラクタ
    public Animal(){
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // sayという名前のpublicなメソッド
    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }

}
