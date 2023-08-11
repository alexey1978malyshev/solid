package homework;

import homework.sys.Syst;
import homework.sys.SystPersister;
import homework.sys.SystemReporter;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        UserPersister userPersister = new UserPersister(user); //реализовал srp - за сохранение  отвечает класс Persister, также из класса User ушли все методы, кроме геттера
        UserReporter userReport = new UserReporter(user.getName());//реализовал ocp - за отчеты отвечает отдельный класс, т.о. при появлении новых объектов, кроме юзера достаточно имплементировать интерфейс Reportable для формирования отчета
        userReport.report();
        userPersister.save();

        //   isp - функционал отчета и сохранения разделен на два интерфейса

        Syst system = new Syst("Ubuntu", "20.04");
        SystemReporter sr = new SystemReporter(system);
        SystPersister sp = new SystPersister(system);
        sr.report();
        System.out.println();
        sp.save();
    }
}