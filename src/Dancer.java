public class Dancer extends Person {


    private String bandNameDancer;

    public Dancer() {

    }


    public Dancer(String namePerson,String designationPerson,String bandNameDancer){
      super(namePerson,designationPerson);
        this.bandNameDancer=bandNameDancer;
    }
    public String getBandNameDancer() {
        return bandNameDancer;
    }

    public void setBandNameDancer(String bandNameDancer) {
        this.bandNameDancer = bandNameDancer;
    }
    public String dansing(){
        return """
                Now I am dansing...
                """;
    }

    @Override
    public String toString() {
//        System.out.println(dancer);
//        System.out.println(dancer);
//        System.out.println(dancer);
        return "🕺Dancer" +"\n"+
                "BandName: " + bandNameDancer +"\n"+super.toString();
    }
}
