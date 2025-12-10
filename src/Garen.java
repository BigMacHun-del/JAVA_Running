public class Garen extends Champion implements MeleeChampion,PhysicsChampion {
    public Garen(String name, int level, int hp, int attackDamage, int defence, boolean isdead) {
        super(name, level, hp, attackDamage, defence);
    }

    @Override
    public void useQ(Champion target) {
        if(target.getIsDead()) {
            System.out.println(target.getName() + "은 사망했습니다");
            return;
        }
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
        if(target.getIsDead()) {
            System.out.println(target.getName() + "은 사망했습니다");
            return;
        }
        System.out.println(getName() + "의 E!!");
        //5연타 공격
        for (int i = 0; i < 5; i++){
            target.takeDamage(getAttackDamage() - 20);
        }
    }

    @Override
    public void useR(Champion target) {
        if(target.getIsDead()) {
            System.out.println(target.getName() + "은 사망했습니다");
            return;
        }
        System.out.println(getName() + "의 R!!");
        if (target.getHp() < 1000){
            System.out.println("처형!");
            execution(target);
        }
        target.takeDamage(getAttackDamage());
    }

    @Override
    public void dash(Champion target) {
        System.out.println(getName() + "의 대쉬!");
    }

    @Override
    public void attackPower() {
        setattackDamage(50);  //패시브로 공격력 보정
    }

    public void execution(Champion target) {   //가렌의 특수 메서드 처형
        target.isDead = true;
    }
}
