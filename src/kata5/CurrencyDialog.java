/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.awt.PopupMenu;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author Anže
 */
public class CurrencyDialog extends JPanel{
    public CurrencyDialog(){
        super();
        add(createComboBox());
    }

    private JComboBox createComboBox() {
        return new JComboBox(new String [] {"EUR", "USD", "GBP"});
    }
}
