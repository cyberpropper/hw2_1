public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void displayDescriptionFacultyQualities() {
        System.out.println("Трудолюбие: " + hardworking);
        System.out.println("Верность: " + loyal);
        System.out.println("Честь: " + honest);
    }

    public void compareGryffindorStudents(Hufflepuff student) {
        int totalPointsThisStudent = getMagicPower()+ getTransgressionDistance();
        int totalPointsOtherStudent = student.getMagicPower() + student.getTransgressionDistance();
        int totalPrivatePointsThisStudent = hardworking + loyal + honest;
        int totalPrivatePointsOtherStudent = student.hardworking + student.loyal + student.honest;

        if (totalPrivatePointsThisStudent > totalPrivatePointsOtherStudent) {
            System.out.println(getName() + " лучший Пуфендуец, чем " + student.getName());
        } else if (totalPrivatePointsThisStudent < totalPrivatePointsOtherStudent) {
            System.out.println(student.getName() + " лучший Пуфендуец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + student.getName() + " равны по качествам Пуфендуйца");
        }

        if (totalPointsThisStudent > totalPointsOtherStudent) {
            System.out.println(getName() + " обладает бОльшей мощностью магии, чем " + student.getName());
        } else if (totalPointsThisStudent < totalPointsOtherStudent) {
            System.out.println(student.getName() + " обладает бОльшей мощностью магии, чем " + getName());
        } else {
            System.out.println(getName() + " и " + student.getName() + " равны по качествам");
        }
    }

}