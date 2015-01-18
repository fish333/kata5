/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Anže
 */
//Import SWING
class MoneyCalculatorFrame extends JFrame{

    public MoneyCalculatorFrame() {
        setTitle("MoneyCalculator");
        setMinimumSize(new Dimension(300, 300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        createComponents();
        setVisible(true);
    }

    private void createComponents() {
        add(createExchangeDialog());
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private Component createExchangeDialog() {
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
    }

    private Component createToolbar() {
       JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
       panel.add(createCalculateButton());
       panel.add(createCancelButton());
       return panel;
    }

    private JButton createCalculateButton() {
        JButton calculate = new JButton("calculate");
        calculate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("calculation....");
            }
        });
        return calculate;
    }

    private JButton createCancelButton() {
        JButton cancel = new JButton("cancel");
        cancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose();
            }
        });
        return cancel;
    }
    void execute() {
    }
    
}
