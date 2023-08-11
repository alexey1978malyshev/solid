package homework;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister(user); //реализовал srp - за сохранение  отвечает класс Persister, также из класса User ушли все методы, кроме геттера
        UserReporter userReport = new UserReporter(user.getName());//реализовал ocp - за отчеты отвечает отдельный класс, т.о. при появлении новых объектов, кроме юзера достаточно имплементировать интерфейс Reportable для формирования отчета
        userReport.report();
        persister.save();
    }
}