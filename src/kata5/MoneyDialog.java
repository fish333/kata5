/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Anže
 */
public class MoneyDialog extends JPanel{
    
    public MoneyDialog(){
       super(new FlowLayout());
       add(createTextEdit());
       add(new CurrencyDialog());
    }
    private JTextField createTextEdit(){
        JTextField textfield = new JTextField(10);
        return new JTextField(10);
    }
}
