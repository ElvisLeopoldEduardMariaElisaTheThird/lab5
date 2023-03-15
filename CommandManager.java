import java.time.LocalDate;

public class CommandManager {
        public void help(){
            System.out.println("Список доступных комманд: ");
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
        }

        public void info(String collectionType, LocalDate initialisationDate, int numberOfElements){
            System.out.println("Информация о коллекции: ");
            System.out.println("Тип коллекции: "+collectionType);
            System.out.println("Дата инициализации: "+initialisationDate);
            System.out.println("Количество элемеентов в коллекции: "+numberOfElements);
        }

//        public Worker addWorker(){
//            System.out.println("Добавление нового работника");
//            Worker newWorker = new Worker();
//
//
//
//            return newWorker;
//        }
}
