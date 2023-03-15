public class Organization {
    private long employeesCount; //Значение поля должно быть больше 0
    private OrganizationType type; //Поле не может быть null

    public Organization(){
        this.employeesCount = 1L;
        type = OrganizationType.COMMERCIAL;
    }

    public Long getEmpoyeesCount(){return this.employeesCount;}

}