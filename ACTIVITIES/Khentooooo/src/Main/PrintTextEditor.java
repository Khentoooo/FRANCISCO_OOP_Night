
package Main;

public class PrintTextEditor extends TextEditor {

    public PrintTextEditor(String text) {
        super(text);
        setText(text); 
    }

    public void print() {
        System.out.println(getText());
    }
}
