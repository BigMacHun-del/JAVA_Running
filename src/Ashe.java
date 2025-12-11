public class Ashe extends Champion implements  RangedChampion, PhysicsChampion{
    public Ashe(String name, int level, int hp, int attackDamage, int defence, boolean isdead) {
        super(name, level, hp, attackDamage, defence);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 Q!!");
        target.takeDamage(getAttackDamage() + 30);
    }

    @Override
    public void useW(Champion target) {

    }

    @Override
    public void useE(Champion target) {

    }

    @Override
    public void useR(Champion target) {

    }

    @Override
    public void kite() {

    }

    @Override
    public void attackPower() {

    }

}
