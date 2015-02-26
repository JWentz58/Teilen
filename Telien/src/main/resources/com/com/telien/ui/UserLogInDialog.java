package com.telien.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import net.miginfocom.swing.MigLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UserLogInDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton btnLogin;
	private JButton cancelButton;
	private JButton okButton;
	private JLabel lblUserName;
	private JTextField textField;
	private JLabel lblPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UserLogInDialog dialog = new UserLogInDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public UserLogInDialog() {
		setBounds(100, 100, 551, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(new Color(0, 51, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblUserName = new JLabel("User Name:");
		}
		contentPanel.setLayout(new GridLayout(0, 2));
		contentPanel.add(lblUserName);
		{
			passwordField = new JPasswordField();
		}
		contentPanel.add(passwordField);
		{
			lblPassword = new JLabel("Password:");
		}
		contentPanel.add(lblPassword);
		{
			textField = new JTextField();
			textField.setColumns(10);
		}
		contentPanel.add(textField);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				{
					okButton = new JButton("Login");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
						}
					});
					okButton.setActionCommand("OK");
					getRootPane().setDefaultButton(okButton);
				}
				{
					btnLogin = new JButton("New User");
				}
			}
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			buttonPane.add(okButton);
			buttonPane.add(btnLogin);
			cancelButton = new JButton("Cancel");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			cancelButton.setActionCommand("Cancel");
			buttonPane.add(cancelButton);
		}
	}

}
