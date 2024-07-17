public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public void displayDescriptionFacultyQualities() {
        System.out.println("Ум: " + smart);
        System.out.println("Мудрость: " + wise);
        System.out.println("Остроумность: " + witty);
        System.out.println("Креативность: " + creativity);
    }

    public void compareGryffindorStudents(Ravenclaw student) {
        int totalPointsThisStudent = getMagicPower()+ getTransgressionDistance();
        int totalPointsOtherStudent = student.getMagicPower() + student.getTransgressionDistance();
        int totalPrivatePointsThisStudent = smart + wise + witty + creativity;
        int totalPrivatePointsOtherStudent = student.smart + student.wise + student.witty + student.creativity;

        if (totalPrivatePointsThisStudent > totalPrivatePointsOtherStudent) {
            System.out.println(getName() + " лучший Когтевранец, чем " + student.getName());
        } else if (totalPrivatePointsThisStudent < totalPrivatePointsOtherStudent) {
            System.out.println(student.getName() + " лучший Когтевранец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + student.getName() + " равны по качествам Когтевранца");
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

