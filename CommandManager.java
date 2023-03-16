import javax.print.attribute.standard.DateTimeAtCreation;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class CommandManager {
    ScannerClass scanClass = new ScannerClass();
    Writer LW = new Writer();
    List<String> history = new ArrayList<>(11);
    public void generalCommands() throws Exception{
        boolean flag = true;
        while (flag){
            String command = scanClass.scan();
            String comms[] = command.split(" ");
            Reader LR = new Reader();


        switch (comms[0]) {
            case ("help"):
                System.out.println("help : вывести справку по доступным командам\n" +
                        "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                        "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                        "add {element} : добавить новый элемент в коллекцию\n" +
                        "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                        "remove_by_id id : удалить элемент из коллекции по его id\n" +
                        "clear : очистить коллекцию\n" +
                        "save : сохранить коллекцию в файл\n" +
                        "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                        "exit : завершить программу (без сохранения в файл)\n" +
                        "add_if_max {element} : добавить новый элемент в коллекцию, если его значение превышает значение наибольшего элемента этой коллекции\n" +
                        "remove_greater {element} : удалить из коллекции все элементы, превышающие заданный\n" +
                        "history : вывести последние 11 команд (без их аргументов)\n" +
                        "min_by_end_date : вывести любой объект из коллекции, значение поля endDate которого является минимальным\n" +
                        "print_unique_end_date : вывести уникальные значения поля endDate всех элементов в коллекции\n" +
                        "print_field_descending_start_date : вывести значения поля startDate всех элементов в порядке убывания");
                break;
            case ("info"):
                System.out.println("info command");
                break;
            case ("show"):
                LR.readd();
                LR.getWorkers();
                break;
            case ("add"):
                int id = scanClass.scanID();
                String name = scanClass.scanName();
                Coordinates coords = scanClass.scanCoordinates();
                int salary = scanClass.scanSalary();
                Position position = scanClass.scanPosition();
                Organization org = scanClass.scanOrganization();
                LocalDate ld = LocalDate.now();
                LocalDateTime ldt = LocalDateTime.now();
                ZonedDateTime zdt = ZonedDateTime.now();

                Worker worker = new Worker(id, name, coords, ld, salary, ldt, zdt, position, org);
                LR.addWorker(worker);
                LW.write(worker.toString());
                break;
            case ("update"):
                break;
            case ("remove_by_id"):
                break;
            case ("clear"):
                LW.clear();
            case ("exit"):
                flag=false;
                break;
            case ("history"):
                for (String com : history){System.out.println(com);}
                break;
            default:
                System.out.println("Incorrect command. Try help for receiving more information on the commands.");
            }
            if(history.size()==11){history.remove(0);}
            history.add(comms[0]);
        }
    }
}
