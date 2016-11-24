package jp.ac.uryukyu.ie.e165714;

/**
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 */
public class LivingThing {
    //フィールド変数
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    //コンストラクタ
    /**
     *  String name; //敵の名前
     *  int hitPoint; //敵のHP
     *  int attack; //敵の攻撃力
     *  boolean dead; //敵の生死状態。true=死亡。
     */
    public LivingThing (String name, int hitPoint,int attack){
        this.name=name;
        this.hitPoint=hitPoint;
        this.attack=attack;
        dead=false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n",name,hitPoint,attack);
    }

    //メソッド
    public boolean isDead(){return dead;}

    public String getName(){return name;}
    /**
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     */
    public void attack(LivingThing opponent){
        if (dead==false) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n",name, opponent.getName(), damage);

            opponent.wounded(damage);
        }

    }
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     */

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}



