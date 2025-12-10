

public class Garen extends Champion implements MeleeChampion {

    public Garen(String name, int level, int hp, int attackDamage, int defence) {
        super(name, level, hp, attackDamage, defence);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName() + "의 Q!!");
        target.takeDamage(getAttackDamage() + 30);
    }

    @Override
    public void dash(Champion target) {

    }


}
