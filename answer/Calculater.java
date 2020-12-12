
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javafx.scene.*;
import javafx.scene.layout.*;


public class Calculater {
    
    private JFrame frame;
    private String operation;
    private int hold1=0,hold2=0;
    private double answer=0;
    private String holds="";

    
    public Calculater(String title){
        frame=new JFrame(title);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JPanel panel1=new JPanel(new BorderLayout(5,5));
        
        JPanel panel2 =new JPanel(new GridLayout(4,4,5,5));
        
        JTextField text=new JTextField("Enter...");
        javax.swing.border.Border border=BorderFactory.createLineBorder(Color.BLUE,2);
        text.setBorder(border);
        text.setText("");
        text.setToolTipText("Enter....");
        
        
        JButton b1=new JButton("7");
        b1.setBackground(Color.lightGray);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("7");
                text.setText(""+text.getText()+"7");         
            }
        }); 
        b1.setToolTipText("7");
        
        
        JButton b2=new JButton("8");
        b2.setBackground(Color.lightGray);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("8");
                text.setText(""+text.getText()+"8");         
            }
        }); 
        b2.setToolTipText("8");
        
        
        JButton b3=new JButton("9");
        b3.setBackground(Color.lightGray);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("9");
                text.setText(""+text.getText()+"9");         
            }
        }); 
        b3.setToolTipText("9");
            
            
        JButton b4=new JButton("/");
        b4.setBackground(Color.lightGray);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("/");
                hold1=Integer.parseInt(text.getText());
                text.setText(""); 
                operation="/";
            }
        }); 
        b4.setToolTipText("divide");
            
            
            
        JButton b5=new JButton("4");
        b5.setBackground(Color.lightGray);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("4");
                text.setText(""+text.getText()+"4");         
            }
        }); 
        b5.setToolTipText("4");
        
        
        JButton b6=new JButton("5");
        b6.setBackground(Color.lightGray);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("5");
                text.setText(""+text.getText()+"5");         
            }
        }); 
        b6.setToolTipText("5");
        
        
        JButton b7=new JButton("6");
        b7.setBackground(Color.lightGray);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("6");
                text.setText(""+text.getText()+"6");         
            }
        }); 
        b7.setToolTipText("6");
        
        
        JButton b8=new JButton("*");
        b8.setBackground(Color.lightGray);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("*");
                hold1=Integer.parseInt(text.getText());
                text.setText(""); 
                operation="*";
            }
        }); 
        b8.setToolTipText("multiply");
        
        
        JButton b9 =new JButton("1");
        b9.setBackground(Color.lightGray);
        b9.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("1");
                text.setText(""+text.getText()+"1");
            }
        });
        b9.setToolTipText("1");
        
        JButton b10=new JButton("2");
        b10.setBackground(Color.lightGray);
        b10.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("2");
                text.setText(""+text.getText()+"2");
            }
        });
        b10.setToolTipText("2");
        
        
        JButton b11=new JButton("3");
        b11.setBackground(Color.lightGray);
        b11.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("3");
                text.setText(""+text.getText()+"3");
            }
        });
        b11.setToolTipText("3");
        
        
        JButton b12=new JButton("-");
        b12.setBackground(Color.lightGray);
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("-");
                hold1=Integer.parseInt(text.getText());
                text.setText(""); 
                operation="-";
            }
        }); 
        b12.setToolTipText("minus");
        
        
        JButton b13=new JButton("0");
        b13.setBackground(Color.lightGray);
        b13.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("0");
                text.setText(""+text.getText()+"0");
            }
        });
        b13.setToolTipText("0");
        
        
        JButton b14=new JButton(".");
        b14.setBackground(Color.lightGray);
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(".");
                hold1=Integer.parseInt(text.getText());
                text.setText(""); 
                operation=".";
            }
        }); 
        b14.setToolTipText("point");
        
        
        JButton b15=new JButton("=");
        b15.setBackground(Color.lightGray);
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("=");
                hold2=Integer.parseInt(text.getText());
                switch (operation){
                    case "+":
                        answer=hold1+hold2;
                        break;
                    case "*":
                        answer=hold1*hold2;
                        break;
                    case "%":
                        answer=hold1%hold2;
                        break;
                    case "-":
                        answer=hold1-hold2;
                        break;
                    case "/":
                        answer=hold1/hold2;
                        break;
                    default:
                        break;
                }
                
                
                text.setText(""+answer);
            }
        });
        b15.setToolTipText("equal");
        
        
        JButton b16=new JButton("+");
        b16.setBackground(Color.lightGray);
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("+");
                hold1=Integer.parseInt(text.getText());
                text.setText(""); 
                operation="+";
            }
        }); 
        b16.setToolTipText("sum");
        
        
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
        panel2.add(b4);
        
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel2.add(b8);
        
        panel2.add(b9);
        panel2.add(b10);
        panel2.add(b11);
        panel2.add(b12);
        
        panel2.add(b13);
        panel2.add(b14);
        panel2.add(b15);
        panel2.add(b16);
        
        
        JPanel panel3=new JPanel(new BorderLayout(5,5));
        
        
        JButton b17=new JButton("AC");
        b17.setBackground(Color.lightGray);
        int Yb17=b17.getPreferredSize().height+42;
        int Xb17=b17.getPreferredSize().width;
        b17.setPreferredSize(new Dimension(Yb17,Xb17));
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("AC");
                text.setText(""); 
            }
        }); 
        b17.setToolTipText("All Clear");
        
        text.addKeyListener(new KeyAdapter(){
            
            @Override
            public void keyTyped(KeyEvent e){
                switch(e.getKeyChar()){
                    case '+':
                        hold1=Integer.parseInt(holds);
                        operation="+";
                        holds="";
                        text.setText("");
                        break;
                    case '-':
                        hold1=Integer.parseInt(holds);
                        operation="-";
                        holds="";
                        text.setText("");
                        break;
                    case '*':
                        hold1=Integer.parseInt(holds);
                        operation="*";
                        holds="";
                        text.setText("");
                        break;
                    case '%':
                        hold1=Integer.parseInt(holds);
                        operation="%";
                        holds="";
                        text.setText("");
                        break;
                    case '/':
                        hold1=Integer.parseInt(holds);
                        operation="/";
                        holds="";
                        text.setText("");
                        break;
                    case '=':
                        hold2=Integer.parseInt(holds);
                        switch (operation){
                            case "+":
                                text.setText("");
                                answer=hold1+hold2;
                                break;
                            case "*":
                                answer=hold1*hold2;
                                text.setText("");
                                break;
                            case "%":
                                answer=hold1%hold2;
                                text.setText("");
                                break;
                            case "-":
                                answer=hold1-hold2;
                                text.setText("");
                                break;
                            case "/":
                                answer=hold1/hold2;
                                text.setText("");
                                break;
                            default:
                                break;
                        }
                        
                        text.setText(""+answer);
                        break;
                    default:
                        holds+=e.getKeyChar();
                        break;
                        
                    
                }
            }
            
        });
        
        
        
        panel3.add(text,BorderLayout.CENTER);
        panel3.add(b17,BorderLayout.EAST);
        
        panel1.add(panel2,BorderLayout.CENTER);
        panel1.add(panel3,BorderLayout.NORTH);
        
        frame.add(panel1);
        
        JMenuBar bar=new JMenuBar();
        
        JMenu m1=new JMenu("item");
        
        JMenuItem mi1=new JMenuItem("Exit");
        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
        
        JMenuItem mi2=new JMenuItem("Copy");
        mi2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
        
        m1.add(mi2);
        m1.add(mi1);
        bar.add(m1);
        
        frame.setJMenuBar(bar);
        
    }
    
    public void showGUI(){
        frame.setVisible(true);
    }
    
}
