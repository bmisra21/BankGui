import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class BankFrame extends JFrame
{
	public BankFrame()
	{
		CardLayout cl = new CardLayout();
		JPanel overall =  new JPanel(cl);
		
		JPanel homePanel = new JPanel();
		homePanel.add(new JLabel("Welcome to the Bank Account Management System"));
		overall.add(homePanel, "");
		
		JMenuBar menubar = new JMenuBar();
		JMenu accounts= new JMenu("Accounts");
		JMenu transactions= new JMenu("Transactions");
		JMenu home= new JMenu("Home");
		menubar.add(accounts);
		menubar.add(transactions);
		menubar.add(home);
		
		JMenuItem addaccount = new JMenuItem("Add Account");
		JMenuItem removeaccount = new JMenuItem("Remove Account");
		accounts.add(addaccount);
		accounts.add(removeaccount);
		
		this.setJMenuBar(menubar);
		this.setBounds(100,100,500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		addaccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		home.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cl.show(homePanel, "");
			}
		});
		add (overall);
		
		
	}
	
	public static void main (String[] args)
	{
		BankFrame frame= new BankFrame();
	}
}
