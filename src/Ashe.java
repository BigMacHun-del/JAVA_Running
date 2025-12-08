public class Ashe extends Champion {
    public Ashe(String name, int level, int hp, int attackDamage, int defence) {
        super(name, level, hp, attackDamage, defence);
    }

    @Override
    public void useQ(Champion target) {
        System.out.println(getName());
        target.takeDamage(getAttackDamage() + 30);
        System.out.println("에쉬만의 q");
    }
}
