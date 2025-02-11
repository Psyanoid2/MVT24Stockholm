package UppgiftOOP.DOG;

public class Monster {
    private String monsterName;
    private String behavior= " smular.";
    private int monsterAge;

    public Monster(String name) {
        this.monsterName = name;
    }

    public void roar() {
        System.out.println(monsterName + " säger: KAKA!!");
    }

    public void printName() {
        System.out.println("Monstrets namn är: " + monsterName + ".");
    }

    public void behavior() {
        System.out.println(monsterName + behavior);
    }

    public void setMonsterAge(int age) {
        this.monsterAge = age;
    }
    public void monsterAge(){
        System.out.println(monsterName + " är " + monsterAge + " år gammal.");
    }

}
