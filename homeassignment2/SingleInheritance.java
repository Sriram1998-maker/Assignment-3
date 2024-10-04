package homeassignment2;

public class SingleInheritance {
    public static void main(String[] args) {
        TestData td = new TestData();
        LoginTestData lg = new LoginTestData();
        td.enterCredentials();
        td.navigateToHomePage();  
        lg.enterUsername();     
        lg.enterPassword();      
        lg.enterCredentials();   
        lg.navigateToHomePage();
    }
}