public abstract class Champion {
    private String name;
    private int level;
    private int hp;
    private int attackDamage;
    private int defence;
    public boolean isDead;

    private static int createdCount = 0;  //static으로 생성자가 챔피언을 생성할 때마다 카운트

    public Champion(String name, int level, int hp, int attackDamage, int defence) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.attackDamage = attackDamage;
        this.defence = defence;

        createdCount++;
    }

    public int getCreatedCount() {
        return createdCount;
    }

    public void takeDamage(int damage) {
        if(isDead) {
            System.out.println(this.name + "은 사망했습니다");
            return;
        }

        int actDamage = damage - this.defence;
        if (actDamage < 0) {
            actDamage = 0;
        }
        this.hp -= actDamage;

        System.out.println(this.name + "이(가)" + actDamage + "만큼 피해를 받았습니다.");
        if (hp <= 0) {
            System.out.println("남은 HP: 0");
        } else {
            System.out.println("남은 HP: " + this.hp);
        }

        // 사망 로직
        if(this.hp <= 0) {
            this.isDead = true;
            System.out.println(this.name + "이(가) 체력이 0이되어 사망했습니다.");
        }
    }

    public boolean getIsDead() {
        return isDead;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int setattackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
        return attackDamage;
    }

    public int getAttackDamage(){
        //난수로 300이상이 나오면 치명타 판정
        if (attackDamage >= 300){
            System.out.println("치명타 발생!!");
        }
        return attackDamage;
    }

    public abstract void useQ(Champion target); //구현체마다 로직이 다르기 때문에 형식만 남김
    public abstract void useW(Champion target);
    public abstract void useE(Champion target);
    public abstract void useR(Champion target);
    //에쉬 -> 챔피언, 가렌 -> 챔피언
    //챔피언 -> 챔피언 공격
//    public void basicAttackToGaren(Garen target) {
//        System.out.println(getName() + "의 target = " + target.getName());
//        target.takeDamage(getAttackDamage());
//    }

    //챔피언이 챔피언 공격
    public void basicAttack(Champion target) { //다형성 활용
        if(isDead) {
            System.out.println(this.name + "은 사망했습니다");
            return;
        }
        System.out.println(getName() + "의 target = " + target.getName());
        target.takeDamage(getAttackDamage());
    }

    //레벨업 메서드
    public void levelUp(Champion champion) {
        this.level++;
        this.hp += 10;
        this.attackDamage += 10;
        System.out.println(this.name + " 레벨 증가!! 현재 레벨: " + this.level );
        System.out.println("공격력, 체력 10 증가!! 현재 공격력, 체력: " + this.attackDamage + " / " + this.hp);
    }


}
