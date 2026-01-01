package ex_24_Static_Keyword;

public class ex_04_Example3 {
    public static void main(String[] args){
        ATB1.doAssignment();
        ATB1 atb = new ATB1();     // object created, IIB runs

        atb.setName("Mittu");      // set name
        atb.setPhone("8986543278");// set phone

        System.out.println(atb.getName());
        System.out.println(atb.getPhone());

    }
}

class ATB1{
    {
        System.out.println("IIB -- this is called when object is created");
        //What is the purpose
        //Here you can write the code related to
        //start a website or anything related to
        //web automation or api automation
    }
    static{
        System.out.println("whenever the class is loaded static method is called");
    }
    private String name;
    private String phone;
    static String course_name = "ATB12x0;";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    void read_document(){
        System.out.println("Non ststic Method");
        System.out.println(course_name);
    }
    static void doAssignment(){
        // System.out.println(phone) -- ststic method cannot access the nonstatic variable
        System.out.println("Do Assignment");
    }
}
