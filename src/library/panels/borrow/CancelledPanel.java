package library.panels.borrow;

/**
 * Created by chris on 3/10/15.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import library.panels.borrow.ABorrowPanel;

public class CancelledPanel extends ABorrowPanel {
    private static final long serialVersionUID = 1L;

    public CancelledPanel() {
        this.setLayout((LayoutManager)null);
        this.setBorder(new TitledBorder((Border)null, "Cancelled", 4, 2, (Font)null, (Color)null));
        this.setBounds(12, 23, 460, 640);
        JLabel lblCancelled = new JLabel("Cancelled");
        lblCancelled.setHorizontalAlignment(0);
        lblCancelled.setFont(new Font("Tahoma", 0, 42));
        lblCancelled.setBounds(12, 187, 436, 78);
        this.add(lblCancelled);
    }
}
