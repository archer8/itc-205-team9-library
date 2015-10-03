
package library.panels.borrow;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import library.interfaces.IBorrowUIListener;
import library.panels.borrow.ABorrowPanel;

public class ConfirmLoanPanel extends ABorrowPanel {
	private static final long serialVersionUID = 1L;
	private JTextArea loanListTA;

	public ConfirmLoanPanel(final IBorrowUIListener listener) {
		this.setLayout((LayoutManager) null);
		this.setBorder(new TitledBorder((Border) null, "Confirm Loans", 4, 2, (Font) null, (Color) null));
		this.setBounds(12, 23, 460, 640);
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder((Border)null, "Current Loan List", 4, 2, (Font)null, (Color)null));
		panel.setBounds(12, 24, 415, 496);
		this.add(panel);
		panel.setLayout((LayoutManager)null);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 20, 395, 463);
		panel.add(scrollPane);
		this.loanListTA = new JTextArea();
		this.loanListTA.setEditable(false);
		scrollPane.setViewportView(this.loanListTA);
		JButton btnReject = new JButton("Reject");
		btnReject.setFont(new Font("Tahoma", 0, 14));
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.loansRejected();
			}
		});
		btnReject.setBounds(173, 533, 115, 35);
		this.add(btnReject);
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Tahoma", 0, 14));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listener.loansConfirmed();
			}
		});
		btnConfirm.setBounds(30, 533, 115, 35);
		this.add(btnConfirm);
		JButton button = new JButton("Cancel");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listener.cancelled();
			}
		});
		button.setFont(new Font("Tahoma", 0, 14));
		button.setBounds(312, 533, 115, 35);
		this.add(button);
	}

	public void displayConfirmingLoan(String loanDetails) {
		this.loanListTA.setText(loanDetails);
		this.loanListTA.setCaretPosition(0);
	}
}
