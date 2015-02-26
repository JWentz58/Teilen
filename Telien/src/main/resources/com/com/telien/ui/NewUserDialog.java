package com.telien.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;

public class NewUserDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtFirstName;
	private JTextField txtLastNam;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JTextField txtAddress;
	private JTextField txtPhoneNumber;
	private JTextField txtEmailAddress;
	private JTextField textField;
	private JButton okButton;
	private JButton cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NewUserDialog dialog = new NewUserDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NewUserDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JLabel lblFirstName = new JLabel("First Name:");
			contentPanel.add(lblFirstName);
		}
		{
			txtFirstName = new JTextField();
			txtFirstName.setText("First Name");
			contentPanel.add(txtFirstName);
			txtFirstName.setColumns(10);
		}
		{
			JLabel lblLastName = new JLabel("Last Name:");
			contentPanel.add(lblLastName);
		}
		{
			txtLastNam = new JTextField();
			txtLastNam.setText("Last Name");
			contentPanel.add(txtLastNam);
			txtLastNam.setColumns(10);
		}
		{
			JLabel lblUserName = new JLabel("User Name:");
			contentPanel.add(lblUserName);
		}
		{
			txtUserName = new JTextField();
			txtUserName.setText("User Name");
			contentPanel.add(txtUserName);
			txtUserName.setColumns(10);
		}
		{
			JLabel lblPassword = new JLabel("Password:");
			contentPanel.add(lblPassword);
		}
		{
			txtPassword = new JTextField();
			txtPassword.setText("Password");
			contentPanel.add(txtPassword);
			txtPassword.setColumns(10);
		}
		{
			JLabel lblAddress = new JLabel("Address:");
			contentPanel.add(lblAddress);
		}
		{
			txtAddress = new JTextField();
			txtAddress.setText("Address");
			contentPanel.add(txtAddress);
			txtAddress.setColumns(10);
		}
		{
			JLabel lblPhoneNumber = new JLabel("Phone Number:");
			contentPanel.add(lblPhoneNumber);
		}
		{
			txtPhoneNumber = new JTextField();
			txtPhoneNumber.setText("Phone Number");
			contentPanel.add(txtPhoneNumber);
			txtPhoneNumber.setColumns(10);
		}
		{
			JLabel lblEmailAddress = new JLabel("Email Address:");
			contentPanel.add(lblEmailAddress);
		}
		{
			txtEmailAddress = new JTextField();
			txtEmailAddress.setText("Email Address");
			contentPanel.add(txtEmailAddress);
			txtEmailAddress.setColumns(10);
		}
		{
			JLabel lblCofirmEmailAddress = new JLabel("Email Address");
			contentPanel.add(lblCofirmEmailAddress);
		}
		{
			textField = new JTextField();
			textField.setText("Email Address");
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("Add");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				okButton.setActionCommand("Cancel");
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
			}
			buttonPane.setLayout(new MigLayout("", "[432px]", "[25px]"));
			buttonPane.add(okButton, "cell 0 0,growx,aligny top");
			buttonPane.add(cancelButton, "cell 0 0,alignx left,aligny top");
		}
	}

}
