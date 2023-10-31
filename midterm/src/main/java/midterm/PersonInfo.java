package midterm;
public class PersonInfo {
    public String getInfo(String name, int id) {
        if ("ram".equals(name) && id == 3025) {
            return "Correct Response for Correct Input";
        } else {
            return "Incorrect Input";
        }
    }
}



