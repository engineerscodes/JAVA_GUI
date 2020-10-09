/**
 * 
 */

/**
 * @author M.NAVEEN
 RANDOM CODER'S
 *
 */
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.*;

import java.net.URL;
import javax.swing.*;

public class LoadWebPage extends JFrame
{

public LoadWebPage()
{
setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
setSize(620,440);
JScrollPane sp=new JScrollPane();
JEditorPane editorPane = new JEditorPane();
editorPane.setEditable(false);
sp.setViewportView(editorPane);
add(sp);
try {
    editorPane.setPage(new URL("https://covid19dashinfonav.herokuapp.com/"));
    } catch (Exception ex) {ex.printStackTrace();}
}

public static void main(String args[])
{
new LoadWebPage().setVisible(true);
}

}