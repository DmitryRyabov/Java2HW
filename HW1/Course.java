package HW1;

public class Course {
    private int[] course = {150, 150, 150, 150};

    public void doit(Team team) {
        double result = 0;
        for (int i = 0; i< course.length; i++) {
            for (int j = 0; j < team.getTeam().length; j++) {
                result = course[i] / team.getTeam()[i].getSpeed();
            }
            System.out.println(team.getTeam()[i].getName() + " из команды " + team.getTeamName() + " прошел дистанцию за " + result + " секунд ");
        }
    }
}
