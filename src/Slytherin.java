public class Slytherin extends Hogwarts {
    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int authority;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int decisiveness, int ambition, int resourcefulness, int authority) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public void displayDescriptionFacultyQualities() {
        System.out.println("Хитрость: " + cunning);
        System.out.println("Решительность: " + decisiveness);
        System.out.println("Амбициозность: " + ambition);
        System.out.println("Находчивость: " + resourcefulness);
        System.out.println("Авторитет: " + authority);
    }


    public void compareSlytherinStudents(Slytherin student) {
        int totalPrivatePointsThisStudent = cunning + decisiveness + ambition + resourcefulness + authority;
        int totalPrivatePointsOtherStudent = student.cunning + student.decisiveness + student.ambition + student.resourcefulness + student.authority;

        if (totalPrivatePointsThisStudent > totalPrivatePointsOtherStudent) {
            System.out.println(getName() + " лучший Слизеринец, чем " + student.getName());
        } else if (totalPrivatePointsThisStudent < totalPrivatePointsOtherStudent) {
            System.out.println(student.getName() + " лучший Слизеринец, чем " + getName());
        } else {
            System.out.println(getName() + " и " + student.getName() + " равны по качествам Слизеринца");
        }
    }

}

