public class Garen extends Champion implements MeleeChampion,PhysicsChampion {
    public Garen(String name, int level, int hp, int attackDamage, int defence) {
        super(name, level, hp, attackDamage, defence);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 Q!!");
        target.takeDamage(getAttackDamage() + 30);
    }

    @Override
    public void useW(Champion target) {
        System.out.println(getName() + "의 W!!");
        System.out.println("둔화 효과 무시!");
    }

    @Override
    public void useE(Champion target) {
        System.out.println(getName() + "의 E!!");
        //5연타 공격
        for (int i = 0; i < 5; i++){
            target.takeDamage(getAttackDamage() - 20);
        }
    }

    @Override
    public void useR(Champion target) {
        System.out.println(getName() + "의 R!!");
        if (target.getHp() < 150){
            System.out.println("처형!");
        }
        target.takeDamage(getAttackDamage());
    }

    @Override
    public void dash(Champion target) {

    }

    @Override
    public void attackPower() {

    }
}
