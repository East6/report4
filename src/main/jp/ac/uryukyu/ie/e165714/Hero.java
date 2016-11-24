package jp.ac.uryukyu.ie.e165714;

/**
 * Created by yonaminehigashi on 2016/11/18.
 */
/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 */
public class Hero extends LivingThing{
    public Hero(String name, int hitPoint,int attack){
        super(name,hitPoint,attack);
    }
}
