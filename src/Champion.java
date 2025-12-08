public abstract class Champion {
    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defence;

    public Champion(String name, int level, int hp, int attackDamage, int defence) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defence = defence;
    }

    public void takeDamage(int damage) {
        int actDamage = damage - this.defence;
        if (actDamage < 0) {
            actDamage = 0;
        }
        this.hp -= actDamage;

        System.out.println(this.name + "이(가)" + actDamage + "만큼 피해를 받았습니다.");
        System.out.println("남은 HP: " + this.hp);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttackDamage(){
        return attackDamage;
    }

    public abstract void useQ(Champion target); //구현체마다 로직이 다르기 때문에 형식만 남김

    //에쉬 -> 챔피언, 가렌 -> 챔피언
    //챔피언 -> 챔피언 공격
//    public void basicAttackToGaren(Garen target) {
//        System.out.println(getName() + "의 target = " + target.getName());
//        target.takeDamage(getAttackDamage());
//    }

    //챔피언이 챔피언 공격
    public void basicAttack(Champion target) { //다형성 활용
        System.out.println(getName() + "의 target = " + target.getName());
        target.takeDamage(getAttackDamage());
    }
}
