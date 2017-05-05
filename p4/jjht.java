//-- JJHT FrameWerk
// JList 			= p417.
// FrameVoorbeeld 	= p420.
// 
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class jjht
{
	JFrame mainFrame;
	

	public void buildGUI()
	{
		mainFrame			=	new JFrame("Java Joti Hunt Tester.");
		mainFrame.setSize(900,500);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible(true);		
		//mainFrame.setLayout(new GridLayout(3,1));
		
		JPanel panel = new JPanel(new BorderLayout());
		
		
		Box wrapper = new Box(BoxLayout.X_AXIS);
		wrapper.setAlignmentY(Component.TOP_ALIGNMENT);

		
		Box box1 = new Box(BoxLayout.Y_AXIS);
		box1.setOpaque(true);
		box1.setBackground(Color.red);
		box1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		JLabel label1 = new JLabel("Label 1:");
		box1.add(label1);
		
		
		// String[] jlist1 		= {"hunter","vos","meta","sc","foto","gebruiker","fcm"}; 
		// JList list1				= new JList(jlist1);
		// JScrollPane scrollPane1	= new JScrollPane(list1);
		// scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		// list1.setVisibleRowCount(2);
		// list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// list1.addListSelectionListener(new ListSelectionListener() 
		// {
            // @Override
            // public void valueChanged(ListSelectionEvent arg0) {
                // if (!arg0.getValueIsAdjusting()) {
                  // System.out.println(list1.getSelectedValue().toString());
                // }
            // }
        // });
		// box1.add(scrollPane1);
		JLabel label1temp = new JLabel("Label 1:");
		box1.add(label1temp);
		wrapper.add(BorderLayout.CENTER, box1);
		
		
		
		
		
		
		
		Box box2 = new Box(BoxLayout.Y_AXIS);
		box2.setOpaque(true);
		box2.setBackground(Color.green);
		box2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		JLabel label2 = new JLabel("Label 2:");
		box2.add(label2);
		wrapper.add(BorderLayout.CENTER, box2);
		
		
		
		
		
		panel.add(wrapper);
		mainFrame.getContentPane().add(panel);
		
		// JPanel panel1 = new JPanel();
		// panel1.setBackground(Color.darkGray);
		// mainFrame.getContentPane().add(BorderLayout.CENTER, panel1);
		
		// JPanel panel2 = new JPanel();
		// panel2.setBackground(Color.red);
		// mainFrame.getContentPane().add(BorderLayout.CENTER, panel2);
		
		// JPanel panel3 = new JPanel();
		// panel3.setBackground(Color.green);
		// mainFrame.getContentPane().add(BorderLayout.CENTER, panel3);
		
		// JPanel panel4 = new JPanel();
		// panel4.setBackground(Color.blue);
		// mainFrame.getContentPane().add(BorderLayout.CENTER, panel4);
		
		// JPanel panel5 = new JPanel();
		// panel5.setBackground(Color.yellow);
		// mainFrame.getContentPane().add(BorderLayout.CENTER, panel5);
		

		

		//BorderLayout layout	=	new BorderLayout();
		// GridLayout layout = new GridLayout(0,3);
		
		// JPanel GridLayout	=	new JPanel();
		
		// GridLayout.setBackground(Color.red);
		
		// background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		// Box buttonBox1		=	new Box(BoxLayout.X_AXIS);
		// Box buttonBox2		=	new Box(BoxLayout.X_AXIS);
		// buttonBox1.add(Box.createHorizontalGlue());
		// buttonBox1.add(Box.createVerticalGlue());
		
		
		// JButton run			=	new JButton("Run");
		// run.setPreferredSize(new Dimension(2, 2));
		// run.addActionListener(new runListener());
		// panel.add(run);
		

		
		// String[] jlist2 		= {"hunter naam","all","naam","andere","id","team","info","sleutelExists"}; 
		// JList list2				= new JList(jlist2);
		// JScrollPane scrollPane2	= new JScrollPane(list2);
		// scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		// scrollPane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		// buttonBox2.add(scrollPane2);
		// list2.setVisibleRowCount(1);
		// list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// list2.addListSelectionListener(new ListSelectionListener() {

            // @Override
            // public void valueChanged(ListSelectionEvent arg0) {
                // if (!arg0.getValueIsAdjusting()) {
                  // System.out.println(list2.getSelectedValue().toString());
                // }
            // }
        // });
		
		
		
		//mainFrame.getContentPane().add(BorderLayout.CENTER, buttonBox2);
		//mainFrame.setBounds(50,50,300,300);

		
	}//-- End method buildGUI().
	
	public static void main(String[] args)
	{
		new jjht().buildGUI();
	}
	
	public class runListener implements ActionListener
	{
		public void actionPerformed(ActionEvent a)
		{
			System.out.println("runListener");
		}
	}
	
	// public void valueChanged1(ListSelectionEvent arg0) 
	// {
        // if (!arg0.getValueIsAdjusting()) 
		// {
            // System.out.println(list1.getSelectedValue().toString());
        // }
    // }
	
	// public void valueChanged2(ListSelectionEvent arg0) 
	// {
        // if (!arg0.getValueIsAdjusting()) 
		// {
            // System.out.println(list2.getSelectedValue().toString());
        // }
    // }
	
	
}

