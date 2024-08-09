public class Student1 {
    private String name;
    private String email;

    public Student1(){
        name = "Unassigned";
        email = "Unassigned";
    }
    public void SetName(String studentName){
        name = studentName;
    }
    public void SetEmail(String address){
        email = address;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
}
