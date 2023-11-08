public class Person {
    private String namePerson;
    private String designationPerson;

    public Person() {

    }

    public Person(String name, String designation) {
        this.namePerson = name;
        this.designationPerson = designation;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getDesignationPerson() {
        return designationPerson;
    }

    public void setDesignationPerson(String designationPerson) {
        this.designationPerson = designationPerson;
    }

    public void learn(){
        System.out.println("I learn");
    }
    public void walk(){
        System.out.println("I walk");
    }
    public void eat(){
        System.out.println("I eat ");
    }

    @Override
    public String toString() {
        return
                "Name:  " + namePerson + '\n' +
                "Designation:  " + designationPerson ;

    }
}
