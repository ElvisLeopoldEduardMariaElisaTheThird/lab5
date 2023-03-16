import java.util.Scanner;
public class ScannerClass {
    Scanner in = new Scanner(System.in);
    public void scanWorker(){
        System.out.println("Input a worker stats");
        String worker = in.nextLine();
        String[] elements = worker.split(",");
        // Обработка данных
        /*Worker holder = new Worker();
        holder.setID(Integer.parseInt(elements[0]));
        holder.setName(elements[1]);
        return holder;*/
    }
    public int scanID(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input worker's ID. It should be greater than zero.");
        int id = in.nextInt();
        return id;
    }
    public String scanName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input worker's name");
        String name = in.nextLine();
        return name;
    }
    public Coordinates scanCoordinates(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input worker's coordinates");
        String cords = in.nextLine();
        String[] coordinates = cords.split(" ");
        Long x = Long.parseLong(coordinates[0]);
        if(coordinates.length > 1){float y = Float.valueOf(coordinates[1]);Coordinates localCoords = new Coordinates(x,y);return localCoords;}
        else{Coordinates localCoords = new Coordinates(x);return localCoords;}
    }
    public int scanSalary(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input worker's salary. It should be greater than zero");
        int salary = in.nextInt();
        return salary;
    }
    public Position scanPosition(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input worker's position. Here is a lit of positions: MANAGER, LABORER, MANAGER_OF_CLEANING");
        String pos = in.nextLine();
        return Position.valueOf(pos);
    }
    public Organization scanOrganization(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input worker's organization's employee count");
        int count = in.nextInt();
        Scanner inn = new Scanner(System.in);
        System.out.println("Input worker's organization's type out of these: COMMERCIAL, PRIVATE_LIMITED_COMPANY, OPEN_JOINT_STOCK_COMPANY");
        String type = inn.nextLine();
        OrganizationType otype = OrganizationType.valueOf(type);
        Organization org = new Organization(count, otype);
        return org;
    }

    public String scan() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a command");
        String command = in.nextLine();
        return command;
    }
}
