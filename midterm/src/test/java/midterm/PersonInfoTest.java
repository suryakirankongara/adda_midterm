package midterm;
public class PersonInfoTest {

    public void testCorrectInput() {
        PersonInfo personInfo = new PersonInfo();
        String name = "ram";
        int id = 3025;

        String response = personInfo.getInfo(name, id);

        if ("Correct Response for Correct Input".equals(response)) {
            System.out.println("Test for correct input passed.");
        } else {
            System.out.println("Test for correct input failed.");
        }
    }

    public void testIncorrectInput() {
        PersonInfo personInfo = new PersonInfo();
        String name = "incorrectName";
        int id = 1234;

        String response = personInfo.getInfo(name, id);

        if ("Incorrect Input".equals(response)) {
            System.out.println("Test for incorrect input passed.");
        } else {
            System.out.println("Test for incorrect input failed.");
        }
    }

    public static void main(String[] args) {
        PersonInfoTest test = new PersonInfoTest();
        test.testCorrectInput();
        test.testIncorrectInput();
    }
}
