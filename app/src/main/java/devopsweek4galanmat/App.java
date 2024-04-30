import devopsweek4galanmat.IRender;
import devopsweek4galanmat.Render;
import devopsweek4galanmat.IContextBuilder; // Import the missing class
import devopsweek4galanmat.Rectangle; // Import the missing class
import devopsweek4galanmat.Dot; // Import the missing class
import devopsweek4galanmat.ICanvas; // Import the missing class
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package devopsweek4galanmat;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        IRender render = new Render();
        IContextBuilder builder = render.newBuilder();
        builder.width(20).height(10);
        builder.element(new Rectangle());
        builder.element(new Dot());
        ICanvas canvas = render.render(builder.build());
        String s = canvas.getText();
        System.out.println(s);

        System.out.println(new App().getGreeting());
    }
}
