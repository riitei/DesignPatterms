/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverMode02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author riitei
 */
public class SwingObserverExample {

    JFrame jFrame;
    
    public static void main(String[] args) {
                
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.go();
    }

    public void go(){
        jFrame = new JFrame();
        JButton button = new JButton("Should I do it? ");
        button.addActionListener(new AngeListener());
        button.addActionListener(new DevilListener());
        // 製造出兩個監聽器(也就是觀察者)一個天使一個惡魔
        jFrame.getContentPane().add(BorderLayout.CENTER,button);
        // 在此設定jFrame的屬性
    }
    
    class AngeListener implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it !! ");
        }
    
    }
    
    class DevilListener implements ActionListener{
    
        @Override
        public void actionPerformed(ActionEvent e) {
            // 當主題(JButton)的狀態改變，在範例中不是呼叫upDate()，而是呼叫actionPerformed()
            
            System.out.println("Come on, do it !! ");
        }
    
    }
}
