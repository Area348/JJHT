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
	JFrame theFrame;
	

	public void buildGUI()
	{
		theFrame			=	new JFrame("Java Joti Hunt Tester.");
				
		BorderLayout layout	=	new BorderLayout();
				
		JPanel background	=	new JPanel(layout);
		
		background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		Box buttonBox		=	new Box(BoxLayout.X_AXIS);
		
		JButton run			=	new JButton("Run");
		run.addActionListener(new runListener());
		buttonBox.add(run);
		
		String[] jlist1 		= {"hunter","vos","meta","sc","foto","gebruiker","fcm"}; 
		JList list1				= new JList(jlist1);
		JScrollPane scrollPane1	= new JScrollPane(list1);
		scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		buttonBox.add(scrollPane1);
		list1.setVisibleRowCount(1);
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		//list1.addListSelectionListener(new ListSelectionListener());
		list1.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                  System.out.println(list1.getSelectedValue().toString());
                }
            }
        });
		
		
		
		theFrame.getContentPane().add(BorderLayout.NORTH, buttonBox);
		theFrame.setBounds(50,50,300,300);
		theFrame.setSize(350,300);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setVisible(true);
		
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
	
	public void valueChanged(ListSelectionEvent arg0) 
	{
        if (!arg0.getValueIsAdjusting()) 
		{
            System.out.println(list1.getSelectedValue().toString());
        }
    }
	
	
}