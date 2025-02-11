package UppgiftOOP.DOG;

public class Cat {
    private String catName;
    private String behavior = " spinner.";
    private int catAge;

    public Cat(String name) {
        this.catName = name;
    }
    
    public void meow() {
        System.out.println(catName + " säger: Mjau!");
    }

    public void getName() {
        System.out.println("Kattens namn är: " + catName + ".");
    }

    public void behavior() {
        System.out.println(catName + behavior);
    }

    public void setCatAge(int age) {
        this.catAge = age;
    }
    public void catAge(){
        System.out.println(catName + " är " + catAge + " år gammal.");
    }
}
