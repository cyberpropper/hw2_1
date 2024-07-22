public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 90, 70, 95, 85, 90);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 50, 75, 90, 95, 80);
        Gryffindor ron = new Gryffindor("Рон Уизли", 80, 75, 60, 70, 90);


        harry.displayDescription();
        harry.displayDescriptionFacultyQualities();
        hermione.displayDescription();
        hermione.displayDescriptionFacultyQualities();
        ron.displayDescription();
        ron.displayDescriptionFacultyQualities();

        harry.compareGryffindorStudents(hermione);
        harry.compareGryffindorStudents(ron);
        hermione.compareGryffindorStudents(ron);

        Hufflepuff zaharia = new Hufflepuff("Захария Смит", 80, 70, 80,  70, 98);
        Hufflepuff sedrik = new Hufflepuff("Седрик Диггори", 90, 90, 50,  60, 70);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 75, 85, 90,  90, 50);

        zaharia.displayDescription();
        zaharia.displayDescriptionFacultyQualities();
        sedrik.displayDescription();
        sedrik.displayDescriptionFacultyQualities();
        justin.displayDescription();
        justin.displayDescriptionFacultyQualities();

        zaharia.compareHufflepuffStudents(sedrik);
        zaharia.compareHufflepuffStudents(justin);
        sedrik.compareHufflepuffStudents(justin);

        Ravenclaw jo = new Ravenclaw("Чжоу Чанг", 90, 11, 90,  90,  90,  100);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 99,  23,  80,75,100, 50);
        Ravenclaw markus = new Ravenclaw("Маркус Белби", 10,  80, 100,100,100,100);

        jo.displayDescription();
        jo.displayDescriptionFacultyQualities();
        padma.displayDescription();
        padma.displayDescriptionFacultyQualities();
        markus.displayDescription();
        markus.displayDescriptionFacultyQualities();

        jo.compareRavenclawStudents(padma);
        jo.compareRavenclawStudents(markus);
        padma.compareRavenclawStudents(markus);

        Slytherin drako = new Slytherin("Драко Малфой", 90, 100, 66, 70, 50, 100, 100);
        Slytherin grehem = new Slytherin("Грэхэм Монтегю", 100,10, 90, 90, 100, 60, 77);
        Slytherin gregor = new Slytherin("Грегори Гойл", 20, 50,  100, 100, 100, 99, 99);

        drako.displayDescription();
        grehem.displayDescription();
        gregor.displayDescription();
        drako.displayDescriptionFacultyQualities();
        grehem.displayDescriptionFacultyQualities();
        gregor.displayDescriptionFacultyQualities();

        drako.compareSlytherinStudents(grehem);
        drako.compareSlytherinStudents(gregor);
        grehem.compareSlytherinStudents(gregor);


        grehem.compareHogwartsStudents(jo);
        drako.compareHogwartsStudents(justin);
    }
}