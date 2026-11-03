package school;
public class studentPOJO {
    private int id;
    private String name;
    private String email;
    private int marks;
    private String gender;

    public studentPOJO(){};

    public studentPOJO(String name ,String email , int marks , String gender){
      this.name = name ;
      this.email=email;
      this.marks=marks;
      this.gender=gender;
    }

    public String getName(){
      return name;
    }
    public String getEmail(){
      return email;
    }
    public int getMarks(){
      return marks;
    }
    public String getGender(){
      return gender;
    }
}
