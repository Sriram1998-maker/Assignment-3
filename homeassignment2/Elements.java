package homeassignment2;

public class Elements {

	public static void main(String[] args) {
        // Create instances of the subclasses
        Button b = new Button();
        TextField tf = new TextField();
        CheckBoxButton cb = new CheckBoxButton();
        RadioButton rb = new RadioButton();
        b.click();
        b.submit();
        tf.click();
        tf.setText("Hello World");
        cb.click();
        cb.clickCheckButton();
        rb.click();
        rb.selectRadioButton();
        System.out.println("TextField text: " + tf.getText());
    }
}