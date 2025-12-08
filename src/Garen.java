public class Garen extends Champion{

    public Garen(String name, int level, int hp, int attackDamage, int defence) {
        super(name, level, hp, attackDamage, defence);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName());
        target.takeDamage(getAttackDamage() + 30);
        System.out.println("가렌의 q");
    }
}
