public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgressionDistance;

    public void compareHogwartsStudents(Hogwarts student) {
        int totalPointsThisStudent = getMagicPower() + getTransgressionDistance();
        int totalPointsOtherStudent = student.getMagicPower() + student.getTransgressionDistance();

        if (totalPointsThisStudent > totalPointsOtherStudent) {
            System.out.println(getName() + " обладает бОльшей мощностью магии, чем " + student.getName());
        } else if (totalPointsThisStudent < totalPointsOtherStudent) {
            System.out.println(student.getName() + " обладает бОльшей мощностью магии, чем " + getName());
        } else {
            System.out.println(getName() + " и " + student.getName() + " равны по качествам");
        }
    }

    public Hogwarts(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public void displayDescription() {
        System.out.println("Студент: " + name);
        System.out.println("Сила магии: " + magicPower);
        System.out.println("Расстояние трансгрессии: " + transgressionDistance);
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
}
