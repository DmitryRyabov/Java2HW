package HW1;

public class Main {
    public static void main(String[] args) {

        Members[] group1 = {new Members("Евгений",25, 10.5f),
                new Members("Иннокентий",25, 11.5f),
                new Members("Борис",26, 18f),
                new Members("Семён",22, 15.4f)};

        Team team1 = new Team(group1, "Победители");

        Course c = new Course();
        c.doit(team1);

    }
}
