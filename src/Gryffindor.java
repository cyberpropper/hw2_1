public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void displayDescriptionFacultyQualities() {
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }

    public void compareGryffindorStudents(Gryffindor student) {
        int totalPrivatePointsThisStudent = nobility + honor + bravery;
        int totalPrivatePointsOtherStudent = student.nobility + student.honor + student.bravery;

        if (totalPrivatePointsThisStudent > totalPrivatePointsOtherStudent) {
            System.out.println(getName() + " лучший Гриффиндорец, чем " + student.getName());
        } else if (totalPrivatePointsThisStudent < totalPrivatePointsOtherStudent) {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + student.getName() + " равны по качествам Гриффиндорца");
        }
    }
}

