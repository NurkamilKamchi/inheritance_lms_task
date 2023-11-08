public class Singer extends Person{

    private String groupnameSinger;

    public Singer(){

    }

    public Singer (String namePerson,String designationPerson,String groupnameSinger){
        super(namePerson,designationPerson);
        this.groupnameSinger=groupnameSinger;
    }



    public String getGroupnameSinger() {
        return groupnameSinger;
    }

    public void setGroupnameSinger(String groupnameSinger) {
        this.groupnameSinger = groupnameSinger;
    }
    public String singing(){
        return """
                Now I singing...
                """;
    }

    @Override
    public String toString() {
        return "🎤Singer\n" +
                "Groupname:  " + groupnameSinger +"\n"+super.toString();
    }
}
