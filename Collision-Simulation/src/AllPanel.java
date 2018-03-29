import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class AllPanel extends JPanel {
    //decimalFormat is created to print only two significant digits after the '.'
    DecimalFormat fmt = new DecimalFormat("0.##");


    //ball1
    private JTextField textFieldMassForBall1;
    private JTextField textFieldXPositionForBall1;
    private JTextField textFieldYPositionForBall1;
    private JTextField textFieldXVelocityForBall1;
    private JTextField textFieldYVelocityForBall1;
    //ball2
    private JTextField textFieldMassForBall2;
    private JTextField textFieldXPositionForBall2;
    private JTextField textFieldYPositionForBall2;
    private JTextField textFieldXVelocityForBall2;
    private JTextField textFieldYVelocityForBall2;
    //ball3
    private JTextField textFieldMassForBall3;
    private JTextField textFieldXPositionForBall3;
    private JTextField textFieldYPositionForBall3;
    private JTextField textFieldXVelocityForBall3;
    private JTextField textFieldYVelocityForBall3;
    //ball4
    private JTextField textFieldMassForBall4;
    private JTextField textFieldXPositionForBall4;
    private JTextField textFieldYPositionForBall4;
    private JTextField textFieldXVelocityForBall4;
    private JTextField textFieldYVelocityForBall4;
    //ball5
    private JTextField textFieldMassForBall5;
    private JTextField textFieldXPositionForBall5;
    private JTextField textFieldYPositionForBall5;
    private JTextField textFieldXVelocityForBall5;
    private JTextField textFieldYVelocityForBall5;
    //this is for time i am not sure
    private JTextField textField;
    //momentum areas
    private JTextField tfMomentumB1X;
    private JTextField tfMomentumB1Y;
    private JTextField tfMomentumB2X;
    private JTextField tfMomentumB2Y;
    private JTextField tfMomentumB3X;
    private JTextField tfMomentumB3Y;
    private JTextField tfMomentumB4X;
    private JTextField tfMomentumB4Y;
    private JTextField tfMomentumB5X;
    private JTextField tfMomentumB5Y;
    //creating a new collisionArea object
    public CollisionArea collisionPanel;
    public Timer timer;
    public int delay = 5;

    JButton buttonPlay;
    JButton btnStop;
    JButton btnReset;
    JButton btnRewind;

    JSlider sliderSpeed;

    public int clock ;
    int ms ;
    int s ;
    int m ;
    String clockStr ;

    /**
     * Create the panel.
     */
    public AllPanel() {

        setBackground(Color.DARK_GRAY);
        setLayout(null);
        setPreferredSize(new Dimension(1600,900));

          clock = 0;
          ms = 0;
        s = 0;
        m = 0;


        JPanel leftPanel = new JPanel();
        leftPanel.setBounds(12, 13, 220, 574);
        leftPanel.setBackground(Color.LIGHT_GRAY);
        add(leftPanel);
        leftPanel.setLayout(null);

        JCheckBox checkBoxForBall1 = new JCheckBox("");
        checkBoxForBall1.setBackground(Color.BLUE);
        checkBoxForBall1.setBounds(20, 24, 22, 22);
        leftPanel.add(checkBoxForBall1);


        textFieldMassForBall1 = new JTextField();
        textFieldMassForBall1.setBounds(8, 70, 50, 22);
        leftPanel.add(textFieldMassForBall1);
        textFieldMassForBall1.setColumns(10);


        JLabel labelMassForBall1 = new JLabel("Mass (kg):");
        labelMassForBall1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelMassForBall1.setBounds(8, 55, 50, 17);
        leftPanel.add(labelMassForBall1);


        JLabel labelPositionForBall1 = new JLabel("Position:");
        labelPositionForBall1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelPositionForBall1.setBounds(70, 9, 56, 16);
        leftPanel.add(labelPositionForBall1);

        textFieldXPositionForBall1 = new JTextField();
        textFieldXPositionForBall1.setBounds(70, 23, 60, 22);
        leftPanel.add(textFieldXPositionForBall1);
        textFieldXPositionForBall1.setColumns(10);

        textFieldYPositionForBall1 = new JTextField();
        textFieldYPositionForBall1.setBounds(134, 23, 60, 22);
        leftPanel.add(textFieldYPositionForBall1);
        textFieldYPositionForBall1.setColumns(10);

        JLabel labelVelocityForBall1 = new JLabel("Velocity (m/s):");
        labelVelocityForBall1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelVelocityForBall1.setBounds(70, 55, 96, 16);
        leftPanel.add(labelVelocityForBall1);

        textFieldXVelocityForBall1 = new JTextField();
        textFieldXVelocityForBall1.setBounds(70, 70, 60, 22);
        leftPanel.add(textFieldXVelocityForBall1);
        textFieldXVelocityForBall1.setColumns(10);

        textFieldYVelocityForBall1 = new JTextField();
        textFieldYVelocityForBall1.setBounds(134, 70, 60, 22);
        leftPanel.add(textFieldYVelocityForBall1);
        textFieldYVelocityForBall1.setColumns(10);


        textFieldMassForBall2 = new JTextField();
        textFieldMassForBall2.setBounds(8, 192, 50, 22);
        leftPanel.add(textFieldMassForBall2);
        textFieldMassForBall2.setColumns(10);


        JLabel labelMassForBall2 = new JLabel("Mass (kg):");
        labelMassForBall2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelMassForBall2.setBounds(8, 163, 56, 16);
        leftPanel.add(labelMassForBall2);

        textFieldXPositionForBall2 = new JTextField();
        textFieldXPositionForBall2.setBounds(70, 134, 60, 22);
        leftPanel.add(textFieldXPositionForBall2);
        textFieldXPositionForBall2.setColumns(10);

        textFieldYPositionForBall2 = new JTextField();
        textFieldYPositionForBall2.setBounds(134, 134, 60, 22);
        leftPanel.add(textFieldYPositionForBall2);
        textFieldYPositionForBall2.setColumns(10);

        JLabel labelPositionForBall2 = new JLabel("Position:");
        labelPositionForBall2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelPositionForBall2.setBounds(70, 116, 56, 16);
        leftPanel.add(labelPositionForBall2);

        JCheckBox checkBoxForBall2 = new JCheckBox("");
        checkBoxForBall2.setBackground(Color.MAGENTA);
        checkBoxForBall2.setBounds(20, 132, 22, 22);
        leftPanel.add(checkBoxForBall2);

        JLabel labelVelocityForBall2 = new JLabel("Velocity (m/s):");
        labelVelocityForBall2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelVelocityForBall2.setBounds(70, 163, 96, 16);
        leftPanel.add(labelVelocityForBall2);

        textFieldXVelocityForBall2 = new JTextField();
        textFieldXVelocityForBall2.setColumns(10);
        textFieldXVelocityForBall2.setBounds(70, 192, 60, 22);
        leftPanel.add(textFieldXVelocityForBall2);

        textFieldYVelocityForBall2 = new JTextField();
        textFieldYVelocityForBall2.setColumns(10);
        textFieldYVelocityForBall2.setBounds(134, 192, 60, 22);
        leftPanel.add(textFieldYVelocityForBall2);

        JCheckBox checkBoxForBall3 = new JCheckBox("");
        checkBoxForBall3.setBackground(Color.RED);
        checkBoxForBall3.setBounds(20, 258, 22, 22);
        leftPanel.add(checkBoxForBall3);

        JLabel labelPositionForBall3 = new JLabel("Position:");
        labelPositionForBall3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelPositionForBall3.setBounds(70, 240, 56, 16);
        leftPanel.add(labelPositionForBall3);

        textFieldXPositionForBall3 = new JTextField();
        textFieldXPositionForBall3.setColumns(10);
        textFieldXPositionForBall3.setBounds(70, 258, 60, 22);
        leftPanel.add(textFieldXPositionForBall3);

        textFieldYPositionForBall3 = new JTextField();
        textFieldYPositionForBall3.setColumns(10);
        textFieldYPositionForBall3.setBounds(134, 258, 60, 22);
        leftPanel.add(textFieldYPositionForBall3);

        JLabel labelMassForBall3 = new JLabel("Mass (kg):");
        labelMassForBall3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelMassForBall3.setBounds(8, 293, 56, 16);
        leftPanel.add(labelMassForBall3);

        JLabel labelVelocityForBall3 = new JLabel("Velocity (m/s):");
        labelVelocityForBall3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelVelocityForBall3.setBounds(70, 293, 96, 16);
        leftPanel.add(labelVelocityForBall3);

        textFieldMassForBall3 = new JTextField();
        textFieldMassForBall3.setColumns(10);
        textFieldMassForBall3.setBounds(8, 307, 50, 22);
        leftPanel.add(textFieldMassForBall3);

        textFieldXVelocityForBall3 = new JTextField();
        textFieldXVelocityForBall3.setColumns(10);
        textFieldXVelocityForBall3.setBounds(70, 307, 60, 22);
        leftPanel.add(textFieldXVelocityForBall3);

        textFieldYVelocityForBall3 = new JTextField();
        textFieldYVelocityForBall3.setColumns(10);
        textFieldYVelocityForBall3.setBounds(134, 307, 60, 22);
        leftPanel.add(textFieldYVelocityForBall3);

        JCheckBox checkBoxForBall4 = new JCheckBox("");
        checkBoxForBall4.setBackground(Color.YELLOW);
        checkBoxForBall4.setBounds(20, 382, 22, 22);
        leftPanel.add(checkBoxForBall4);

        JLabel labelMassForBall4 = new JLabel("Mass (kg):");
        labelMassForBall4.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelMassForBall4.setBounds(2, 405, 56, 16);
        leftPanel.add(labelMassForBall4);

        JLabel labelPositionForBall4 = new JLabel("Position:");
        labelPositionForBall4.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelPositionForBall4.setBounds(70, 365, 56, 16);
        leftPanel.add(labelPositionForBall4);

        textFieldXPositionForBall4 = new JTextField();
        textFieldXPositionForBall4.setColumns(10);
        textFieldXPositionForBall4.setBounds(70, 382, 60, 22);
        leftPanel.add(textFieldXPositionForBall4);

        textFieldYPositionForBall4 = new JTextField();
        textFieldYPositionForBall4.setColumns(10);
        textFieldYPositionForBall4.setBounds(134, 382, 60, 22);
        leftPanel.add(textFieldYPositionForBall4);

        JLabel labelVelocityForBall4 = new JLabel("Velocity (m/s):");
        labelVelocityForBall4.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelVelocityForBall4.setBounds(70, 405, 96, 16);
        leftPanel.add(labelVelocityForBall4);

        textFieldXVelocityForBall4 = new JTextField();
        textFieldXVelocityForBall4.setColumns(10);
        textFieldXVelocityForBall4.setBounds(70, 423, 60, 22);
        leftPanel.add(textFieldXVelocityForBall4);

        textFieldYVelocityForBall4 = new JTextField();
        textFieldYVelocityForBall4.setColumns(10);
        textFieldYVelocityForBall4.setBounds(134, 423, 60, 22);
        leftPanel.add(textFieldYVelocityForBall4);

        textFieldMassForBall4 = new JTextField();
        textFieldMassForBall4.setColumns(10);
        textFieldMassForBall4.setBounds(8, 423, 50, 22);
        leftPanel.add(textFieldMassForBall4);

        JCheckBox checkBoxForBall5 = new JCheckBox("");
        checkBoxForBall5.setBackground(Color.CYAN);
        checkBoxForBall5.setBounds(20, 489, 22, 22);
        leftPanel.add(checkBoxForBall5);

        JLabel labelMassForBall5 = new JLabel("Mass (kg):");
        labelMassForBall5.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelMassForBall5.setBounds(2, 516, 56, 16);
        leftPanel.add(labelMassForBall5);

        textFieldMassForBall5 = new JTextField();
        textFieldMassForBall5.setColumns(10);
        textFieldMassForBall5.setBounds(8, 536, 50, 22);
        leftPanel.add(textFieldMassForBall5);

        JLabel labelPositionForBall5 = new JLabel("Position:");
        labelPositionForBall5.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelPositionForBall5.setBounds(70, 476, 56, 16);
        leftPanel.add(labelPositionForBall5);

        textFieldXPositionForBall5 = new JTextField();
        textFieldXPositionForBall5.setColumns(10);
        textFieldXPositionForBall5.setBounds(70, 489, 60, 22);
        leftPanel.add(textFieldXPositionForBall5);

        textFieldYPositionForBall5 = new JTextField();
        textFieldYPositionForBall5.setColumns(10);
        textFieldYPositionForBall5.setBounds(134, 489, 60, 22);
        leftPanel.add(textFieldYPositionForBall5);

        JLabel labelVelocityForBall5 = new JLabel("Velocity (m/s):");
        labelVelocityForBall5.setFont(new Font("Tahoma", Font.PLAIN, 11));
        labelVelocityForBall5.setBounds(70, 515, 96, 16);
        leftPanel.add(labelVelocityForBall5);

        textFieldXVelocityForBall5 = new JTextField();
        textFieldXVelocityForBall5.setColumns(10);
        textFieldXVelocityForBall5.setBounds(70, 536, 60, 22);
        leftPanel.add(textFieldXVelocityForBall5);

        textFieldYVelocityForBall5 = new JTextField();
        textFieldYVelocityForBall5.setColumns(10);
        textFieldYVelocityForBall5.setBounds(134, 536, 60, 22);
        leftPanel.add(textFieldYVelocityForBall5);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setForeground(Color.CYAN);
        bottomPanel.setBackground(Color.WHITE);
        bottomPanel.setBounds(250, 740, 930, 136);
        add(bottomPanel);
        bottomPanel.setLayout(null);

        buttonPlay = new JButton("PLAY");
        buttonPlay.setBounds(100, 0, 95, 45);
        bottomPanel.add(buttonPlay);

         btnStop = new JButton("STOP");
        btnStop.setBounds(250, 0, 95, 45);
        bottomPanel.add(btnStop);

         btnReset = new JButton("RESET");
        btnReset.setBounds(400, 0, 95, 45);
        bottomPanel.add(btnReset);

         btnRewind = new JButton("REVERSE");
        btnRewind.setBounds(550, 0, 95, 45);
        bottomPanel.add(btnRewind);

        sliderSpeed = new JSlider();
        sliderSpeed.setBackground(Color.PINK);
        sliderSpeed.setBounds(730, 30, 175, 30);
        bottomPanel.add(sliderSpeed);

        JLabel labelSpeed = new JLabel("SIMULATION SPEED:");
        labelSpeed.setForeground(Color.RED);
        labelSpeed.setFont(new Font("Tahoma", Font.PLAIN, 20));
        labelSpeed.setBounds(720, 0, 200, 25);
        bottomPanel.add(labelSpeed);

        JButton btnHelp = new JButton("HELP");
        btnHelp.setBounds(780, 111, 67, 25);
        bottomPanel.add(btnHelp);

        JLabel lblTime = new JLabel("Time:");
        lblTime.setBounds(760, 69, 80, 29);
        bottomPanel.add(lblTime);

        //this is for time name could be better
        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(810, 73, 81, 25);
        bottomPanel.add(textField);
        textField.setColumns(10);

//        JButton btnBack = new JButton("BACK");
//        btnBack.setBounds(501, 111, 97, 25);
//        bottomPanel.add(btnBack);

        JEditorPane dtrpnMomentumOfBall1 = new JEditorPane();
        dtrpnMomentumOfBall1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        dtrpnMomentumOfBall1.setText("Momentum of \r\nBall 1 (kg.m/s):\r\n  Px              Py");
        dtrpnMomentumOfBall1.setBounds(30, 46, 81, 48);
        bottomPanel.add(dtrpnMomentumOfBall1);

        JEditorPane dtrpnMomentumOfBall2 = new JEditorPane();
        dtrpnMomentumOfBall2.setText("Momentum of \r\nBall 2 (kg.m/s):\r\n  Px              Py");
        dtrpnMomentumOfBall2.setFont(new Font("Tahoma", Font.PLAIN, 11));
        dtrpnMomentumOfBall2.setBounds(180, 46, 81, 48);
        bottomPanel.add(dtrpnMomentumOfBall2);

        JEditorPane dtrpnMomentumOfBall3 = new JEditorPane();
        dtrpnMomentumOfBall3.setText("Momentum of \r\nBall 3 (kg.m/s):\r\n  Px              Py");
        dtrpnMomentumOfBall3.setFont(new Font("Tahoma", Font.PLAIN, 11));
        dtrpnMomentumOfBall3.setBounds(330, 46, 81, 48);
        bottomPanel.add(dtrpnMomentumOfBall3);

        JEditorPane dtrpnMomentumOfBall = new JEditorPane();
        dtrpnMomentumOfBall.setText("Momentum of \r\nBall 4 (kg.m/s):\r\n  Px              Py");
        dtrpnMomentumOfBall.setFont(new Font("Tahoma", Font.PLAIN, 11));
        dtrpnMomentumOfBall.setBounds(480, 46, 81, 48);
        bottomPanel.add(dtrpnMomentumOfBall);

        JEditorPane dtrpnMomentumOfBall_1 = new JEditorPane();
        dtrpnMomentumOfBall_1.setText("Momentum of \r\nBall 5 (kg.m/s):\r\n  Px              Py");
        dtrpnMomentumOfBall_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
        dtrpnMomentumOfBall_1.setBounds(630, 46, 81, 48);
        bottomPanel.add(dtrpnMomentumOfBall_1);

        tfMomentumB1X = new JTextField();
        tfMomentumB1X.setEditable(false);
        tfMomentumB1X.setForeground(Color.BLUE);
        tfMomentumB1X.setBounds(0, 98, 65, 25);
        bottomPanel.add(tfMomentumB1X);
        tfMomentumB1X.setColumns(10);

        tfMomentumB1Y = new JTextField();
        tfMomentumB1Y.setEditable(false);
        tfMomentumB1Y.setForeground(Color.BLUE);
        tfMomentumB1Y.setColumns(10);
        tfMomentumB1Y.setBounds(70, 98, 65, 25);
        bottomPanel.add(tfMomentumB1Y);

        tfMomentumB2X = new JTextField();
        tfMomentumB2X.setEditable(false);
        tfMomentumB2X.setForeground(Color.MAGENTA);
        tfMomentumB2X.setColumns(10);
        tfMomentumB2X.setBounds(150, 98, 65, 25);
        bottomPanel.add(tfMomentumB2X);

        tfMomentumB2Y = new JTextField();
        tfMomentumB2Y.setEditable(false);
        tfMomentumB2Y.setForeground(Color.MAGENTA);
        tfMomentumB2Y.setColumns(10);
        tfMomentumB2Y.setBounds(220, 98, 65, 25);
        bottomPanel.add(tfMomentumB2Y);

        tfMomentumB3X = new JTextField();
        tfMomentumB3X.setEditable(false);
        tfMomentumB3X.setForeground(Color.RED);
        tfMomentumB3X.setColumns(10);
        tfMomentumB3X.setBounds(300, 98, 65, 25);
        bottomPanel.add(tfMomentumB3X);

        tfMomentumB3Y = new JTextField();
        tfMomentumB3Y.setEditable(false);
        tfMomentumB3Y.setForeground(Color.RED);
        tfMomentumB3Y.setColumns(10);
        tfMomentumB3Y.setBounds(370, 98, 65, 25);
        bottomPanel.add(tfMomentumB3Y);

        tfMomentumB4X = new JTextField();
        tfMomentumB4X.setEditable(false);
        tfMomentumB4X.setForeground(Color.YELLOW);
        tfMomentumB4X.setColumns(10);
        tfMomentumB4X.setBounds(450, 98, 65, 25);
        bottomPanel.add(tfMomentumB4X);

        tfMomentumB4Y = new JTextField();
        tfMomentumB4Y.setEditable(false);
        tfMomentumB4Y.setForeground(Color.YELLOW);
        tfMomentumB4Y.setColumns(10);
        tfMomentumB4Y.setBounds(520, 98, 65, 25);
        bottomPanel.add(tfMomentumB4Y);

        tfMomentumB5X = new JTextField();
        tfMomentumB5X.setForeground(Color.CYAN);
        tfMomentumB5X.setEditable(false);
        tfMomentumB5X.setColumns(10);
        tfMomentumB5X.setBounds(600, 98, 65, 25);
        bottomPanel.add(tfMomentumB5X);

        tfMomentumB5Y = new JTextField();
        tfMomentumB5Y.setForeground(Color.CYAN);
        tfMomentumB5Y.setEditable(false);
        tfMomentumB5Y.setColumns(10);
        tfMomentumB5Y.setBounds(670, 98, 65, 25);
        bottomPanel.add(tfMomentumB5Y);

        collisionPanel = new CollisionArea();
        collisionPanel.setBackground(Color.WHITE);
        collisionPanel.setBounds(250, 13, 1280, 720);
        add(collisionPanel);
        TimeListener listener = new TimeListener();
        timer = new Timer(delay,listener );
        // timer.start();

        buttonPlay.addActionListener(listener);
        btnStop.addActionListener(listener);
        btnReset.addActionListener(listener);
        btnRewind.addActionListener(listener);

        //ball1
        textFieldMassForBall1.addActionListener(listener);
        textFieldXPositionForBall1.addActionListener(listener);
        textFieldYPositionForBall1.addActionListener(listener);
        textFieldXVelocityForBall1.addActionListener(listener);
        textFieldYVelocityForBall1.addActionListener(listener);
        //ball2
        textFieldMassForBall2.addActionListener(listener);
        textFieldXPositionForBall2.addActionListener(listener);
        textFieldYPositionForBall2.addActionListener(listener);
       textFieldXVelocityForBall2.addActionListener(listener);
         textFieldYVelocityForBall2.addActionListener(listener);
        //ball3
        textFieldMassForBall3.addActionListener(listener);
        textFieldXPositionForBall3.addActionListener(listener);
        textFieldYPositionForBall3.addActionListener(listener);
        textFieldXVelocityForBall3.addActionListener(listener);
        textFieldYVelocityForBall3.addActionListener(listener);
        //ball4
        textFieldMassForBall4.addActionListener(listener);
        textFieldXPositionForBall4.addActionListener(listener);
         textFieldYPositionForBall4.addActionListener(listener);
        textFieldXVelocityForBall4.addActionListener(listener);
        textFieldYVelocityForBall4.addActionListener(listener);
        //ball5
        textFieldMassForBall5.addActionListener(listener);
        textFieldXPositionForBall5.addActionListener(listener);
        textFieldYPositionForBall5.addActionListener(listener);
        textFieldXVelocityForBall5.addActionListener(listener);
        textFieldYVelocityForBall5.addActionListener(listener);

    }

    class TimeListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            if ( timer.isRunning ()) {

                //masses are printed in the boxes
                textFieldMassForBall1.setText("" + fmt.format(collisionPanel.b1.getMass()));
                textFieldMassForBall2.setText("" + fmt.format(collisionPanel.b2.getMass()));
                textFieldMassForBall3.setText("" + fmt.format(collisionPanel.b3.getMass()));
                textFieldMassForBall4.setText("" + fmt.format(collisionPanel.b4.getMass()));
                textFieldMassForBall5.setText("" + fmt.format(collisionPanel.b5.getMass()));

                //velocities are printed in the boxes:

                //x-velocities
                textFieldXVelocityForBall1.setText("" + fmt.format(collisionPanel.b1.getVelocity().getX()));
                textFieldXVelocityForBall2.setText("" + fmt.format(collisionPanel.b2.getVelocity().getX()));
                textFieldXVelocityForBall3.setText("" + fmt.format(collisionPanel.b3.getVelocity().getX()));
                textFieldXVelocityForBall4.setText("" + fmt.format(collisionPanel.b4.getVelocity().getX()));
                textFieldXVelocityForBall5.setText("" + fmt.format(collisionPanel.b5.getVelocity().getX()));

                //y-velocities
                textFieldYVelocityForBall1.setText("" + fmt.format(collisionPanel.b1.getVelocity().getY()));
                textFieldYVelocityForBall2.setText("" + fmt.format(collisionPanel.b2.getVelocity().getY()));
                textFieldYVelocityForBall3.setText("" + fmt.format(collisionPanel.b3.getVelocity().getY()));
                textFieldYVelocityForBall4.setText("" + fmt.format(collisionPanel.b4.getVelocity().getY()));
                textFieldYVelocityForBall5.setText("" + fmt.format(collisionPanel.b5.getVelocity().getY()));

                //locations are printed in the boxes:

                //x-locations
                textFieldXPositionForBall1.setText("" + fmt.format(collisionPanel.b1.getPosition().getX()));
                textFieldXPositionForBall2.setText("" + fmt.format(collisionPanel.b2.getPosition().getX()));
                textFieldXPositionForBall3.setText("" + fmt.format(collisionPanel.b3.getPosition().getX()));
                textFieldXPositionForBall4.setText("" + fmt.format(collisionPanel.b4.getPosition().getX()));
                textFieldXPositionForBall5.setText("" + fmt.format(collisionPanel.b5.getPosition().getX()));

                //y-locations
                textFieldYPositionForBall1.setText("" + fmt.format(collisionPanel.b1.getPosition().getY()));
                textFieldYPositionForBall2.setText("" + fmt.format(collisionPanel.b2.getPosition().getY()));
                textFieldYPositionForBall3.setText("" + fmt.format(collisionPanel.b3.getPosition().getY()));
                textFieldYPositionForBall4.setText("" + fmt.format(collisionPanel.b4.getPosition().getY()));
                textFieldYPositionForBall5.setText("" + fmt.format(collisionPanel.b5.getPosition().getY()));


                //momentum printing:

                //x-momentums
                tfMomentumB1X.setText(""+ fmt.format(collisionPanel.b1.findMomentum().getX()));
                tfMomentumB2X.setText(""+ fmt.format(collisionPanel.b2.findMomentum().getX()));
                tfMomentumB3X.setText(""+ fmt.format(collisionPanel.b3.findMomentum().getX()));
                tfMomentumB4X.setText(""+ fmt.format(collisionPanel.b4.findMomentum().getX()));
                tfMomentumB5X.setText(""+ fmt.format(collisionPanel.b5.findMomentum().getX()));

                //y-momentums
                tfMomentumB1Y.setText(""+ fmt.format(collisionPanel.b1.findMomentum().getY()));
                tfMomentumB2Y.setText(""+ fmt.format(collisionPanel.b2.findMomentum().getY()));
                tfMomentumB3Y.setText(""+ fmt.format(collisionPanel.b3.findMomentum().getY()));
                tfMomentumB4Y.setText(""+ fmt.format(collisionPanel.b4.findMomentum().getY()));
                tfMomentumB5Y.setText(""+ fmt.format(collisionPanel.b5.findMomentum().getY()));

                clock = clock + 1;
                if ( clock % 1 == 0) {
                    ms++;
                    if ( ms % 1000 == 0) {
                        s++;
                        ms = 0;

                        if (s % 60 == 0) {
                            m++;
                            s = 0;
                        }}
                    clockStr = m + ":" + s + ":" + ms;
                }

                textField.setText(clockStr);

                //calculate all velocities again and then print
                Collisions.calculateAllVelocities(collisionPanel.collision.getAddedBalls());
                Collisions.moveAddedBalls(collisionPanel.collision.getAddedBalls());
            }
            else {
                if(e.getSource() == textFieldXPositionForBall1){
                    collisionPanel.b1.getPosition().setVector(Double.parseDouble(textFieldXPositionForBall1.getText()), collisionPanel.b1.getPosition().getY() );
                    textFieldXPositionForBall1.setText( ""+ fmt.format(collisionPanel.b1.getPosition().getX()));
                } else if(e.getSource() == textFieldYPositionForBall1){
                    collisionPanel.b1.getPosition().setVector( collisionPanel.b1.getPosition().getX(), Double.parseDouble( textFieldYPositionForBall1.getText()) );
                    textFieldYPositionForBall1.setText( ""+ fmt.format(collisionPanel.b1.getPosition().getY()));
                }else if(e.getSource() == textFieldXPositionForBall2){
                    collisionPanel.b2.getPosition().setVector(Double.parseDouble(textFieldXPositionForBall2.getText()), collisionPanel.b2.getPosition().getY() );
                    textFieldXPositionForBall2.setText( ""+ fmt.format(collisionPanel.b2.getPosition().getX()));
                } else if(e.getSource() == textFieldYPositionForBall2) {
                    collisionPanel.b2.getPosition().setVector(collisionPanel.b2.getPosition().getX(), Double.parseDouble(textFieldYPositionForBall2.getText()));
                    textFieldYPositionForBall2.setText("" + fmt.format(collisionPanel.b2.getPosition().getY()));
                } else if(e.getSource() == textFieldXPositionForBall3){
                    collisionPanel.b3.getPosition().setVector(Double.parseDouble(textFieldXPositionForBall3.getText()), collisionPanel.b3.getPosition().getY() );
                    textFieldXPositionForBall3.setText( ""+ fmt.format(collisionPanel.b3.getPosition().getX()));
                } else if(e.getSource() == textFieldYPositionForBall3) {
                    collisionPanel.b3.getPosition().setVector(collisionPanel.b3.getPosition().getX(), Double.parseDouble(textFieldYPositionForBall3.getText()));
                    textFieldYPositionForBall3.setText("" +fmt.format(collisionPanel.b3.getPosition().getY()));
                } else if(e.getSource() == textFieldXPositionForBall4){
                    collisionPanel.b4.getPosition().setVector(Double.parseDouble(textFieldXPositionForBall4.getText()), collisionPanel.b4.getPosition().getY() );
                    textFieldXPositionForBall4.setText( ""+ fmt.format(collisionPanel.b4.getPosition().getX()));
                } else if(e.getSource() == textFieldYPositionForBall4) {
                    collisionPanel.b4.getPosition().setVector(collisionPanel.b4.getPosition().getX(), Double.parseDouble(textFieldYPositionForBall4.getText()));
                    textFieldYPositionForBall4.setText("" + fmt.format(collisionPanel.b4.getPosition().getY()));
                } else if(e.getSource() == textFieldXPositionForBall5){
                    collisionPanel.b5.getPosition().setVector(Double.parseDouble(textFieldXPositionForBall5.getText()), collisionPanel.b5.getPosition().getY() );
                    textFieldXPositionForBall5.setText( ""+ fmt.format(collisionPanel.b5.getPosition().getX()));
                } else if(e.getSource() == textFieldYPositionForBall5) {
                    collisionPanel.b5.getPosition().setVector(collisionPanel.b5.getPosition().getX(), Double.parseDouble(textFieldYPositionForBall5.getText()));
                    textFieldYPositionForBall5.setText("" + fmt.format(collisionPanel.b5.getPosition().getY()));
                }

                //check for velocties
                if(e.getSource() == textFieldXVelocityForBall1){
                    collisionPanel.b1.getVelocity().setVector(Double.parseDouble(textFieldXVelocityForBall1.getText()), collisionPanel.b1.getVelocity().getY() );
                    textFieldXVelocityForBall1.setText("" + fmt.format(collisionPanel.b1.getVelocity().getX()));
                } else if(e.getSource() == textFieldYVelocityForBall1){
                    collisionPanel.b1.getVelocity().setVector( collisionPanel.b1.getVelocity().getX() , Double.parseDouble( textFieldYVelocityForBall1.getText()) );
                    textFieldYVelocityForBall1.setText( ""+ fmt.format(collisionPanel.b1.getVelocity().getY()) );
                }else if(e.getSource() == textFieldXVelocityForBall2){
                    collisionPanel.b2.getVelocity().setVector(Double.parseDouble(textFieldXVelocityForBall2.getText()), collisionPanel.b2.getVelocity().getY() );
                    textFieldXVelocityForBall2.setText( ""+ fmt.format(collisionPanel.b2.getVelocity().getX()) );
                } else if(e.getSource() == textFieldYVelocityForBall2) {
                    collisionPanel.b2.getVelocity().setVector(collisionPanel.b2.getVelocity().getX(), Double.parseDouble(textFieldYVelocityForBall2.getText()));
                    textFieldYVelocityForBall2.setText("" + fmt.format(collisionPanel.b2.getVelocity().getY()));
                } else if(e.getSource() == textFieldXVelocityForBall3){
                    collisionPanel.b3.getVelocity().setVector(Double.parseDouble(textFieldXVelocityForBall3.getText()), collisionPanel.b3.getVelocity().getY() );
                    textFieldXVelocityForBall3.setText( ""+ fmt.format(collisionPanel.b3.getVelocity().getX()));
                } else if(e.getSource() == textFieldYVelocityForBall3) {
                    collisionPanel.b3.getVelocity().setVector(collisionPanel.b3.getVelocity().getX(), Double.parseDouble(textFieldYVelocityForBall3.getText()));
                    textFieldYVelocityForBall3.setText("" + fmt.format(collisionPanel.b3.getVelocity().getY()));
                } else if(e.getSource() == textFieldXVelocityForBall4){
                    collisionPanel.b4.getVelocity().setVector(Double.parseDouble(textFieldXVelocityForBall4.getText()), collisionPanel.b4.getVelocity().getY() );
                    textFieldXVelocityForBall4.setText( ""+ fmt.format(collisionPanel.b4.getVelocity().getX()));
                } else if(e.getSource() == textFieldYVelocityForBall4) {
                    collisionPanel.b4.getVelocity().setVector(collisionPanel.b4.getVelocity().getX(), Double.parseDouble(textFieldYVelocityForBall4.getText()));
                    textFieldYVelocityForBall4.setText("" + fmt.format(collisionPanel.b4.getVelocity().getY()));
                } else if(e.getSource() == textFieldXVelocityForBall5){
                    collisionPanel.b5.getVelocity().setVector(Double.parseDouble(textFieldXVelocityForBall5.getText()), collisionPanel.b5.getVelocity().getY() );
                    textFieldXVelocityForBall5.setText( ""+ fmt.format(collisionPanel.b5.getVelocity().getX()));
                } else if(e.getSource() == textFieldYVelocityForBall5) {
                    collisionPanel.b5.getVelocity().setVector(collisionPanel.b5.getVelocity().getX(), Double.parseDouble(textFieldYVelocityForBall5.getText()));
                    textFieldYVelocityForBall5.setText("" + fmt.format(collisionPanel.b5.getVelocity().getY()));
                }

                //check for mass
                if(e.getSource() == textFieldMassForBall1){
                    collisionPanel.b1.setMass(Double.parseDouble(textFieldMassForBall1.getText())) ;
                    textFieldMassForBall1.setText("" + fmt.format(textFieldMassForBall1.getText()));
                } else if(e.getSource() == textFieldMassForBall2){
                    collisionPanel.b2.setMass(Double.parseDouble(textFieldMassForBall2.getText())) ;
                    textFieldMassForBall2.setText("" + fmt.format(textFieldMassForBall2.getText()));
                } else if(e.getSource() == textFieldMassForBall3){
                    collisionPanel.b3.setMass(Double.parseDouble(textFieldMassForBall3.getText())) ;
                    textFieldMassForBall3.setText("" + fmt.format(textFieldMassForBall3.getText()));
                } else if(e.getSource() == textFieldMassForBall4){
                    collisionPanel.b4.setMass(Double.parseDouble(textFieldMassForBall4.getText())) ;
                    textFieldMassForBall4.setText("" +fmt.format(textFieldMassForBall4.getText()));
                } else if(e.getSource() == textFieldMassForBall5){
                    collisionPanel.b5.setMass(Double.parseDouble(textFieldMassForBall5.getText())) ;
                    textFieldMassForBall5.setText("" + fmt.format(textFieldMassForBall5.getText()));
                }

                if ( e.getSource() == btnRewind ) {
                    Collisions.reverseAll(collisionPanel.collision.getAddedBalls());
                }

                if ( e.getSource() == btnReset ) {
                    for (int i = 0; i < collisionPanel.collision.getAddedBalls().size(); i++) {
                        collisionPanel.collision.getAddedBalls().get(i).setAdded(false);
                    }
                }

            }

            if ( e.getSource() == buttonPlay ) {
                if (!timer.isRunning() )
                    timer.start();

            }
            else if ( e.getSource() == btnStop ) {
                if(timer.isRunning())
                    timer.stop();
            }

            //check for locations of the balls

            //---------------------------------------------------------------------------------------------

            repaint();
        }
    }
}
