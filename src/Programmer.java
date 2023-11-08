public class Programmer extends Person {

    private String companyNameOfProgrammer;

    public Programmer() {

    }


    public Programmer(String namePerson, String designationPerson, String companyNameOfProgrammer) {
        super(namePerson, designationPerson);

        this.companyNameOfProgrammer = companyNameOfProgrammer;
    }
    public String getCompanyNameOfProgrammer() {
        return companyNameOfProgrammer;
    }

    public void setCompanyNameOfProgrammer(String companyNameOfProgrammer) {
        this.companyNameOfProgrammer = companyNameOfProgrammer;
    }
    public String coding(){
        return """
                Now I coding...
                """;
    }

    @Override
    public String toString() {
        return "👨‍💻Programmer\n" +
                "CompanyName:   " + companyNameOfProgrammer + '\n' +
                super.toString();
    }
}
