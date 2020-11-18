package robotService.models.procedures;
import robotService.models.robots.interfaces.Robot;
public class Work extends BaseProcedure{




    @Override
    public void doService(Robot robot, int procedureTime) {
        // removes 6 energy and adds 12 happiness
        super.doService(robot, procedureTime);
        int newHappiness = robot.getHappiness() + 12;
        int newEnergy = robot.getEnergy() - 6;
        robot.setHappiness(newHappiness);
        robot.setEnergy(newEnergy);
    }
}
