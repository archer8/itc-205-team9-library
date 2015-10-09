package tests.unit;

/*
    libraries:
 */

import javax.swing.*;
import java.util.List;

import library.panels.borrow.ABorrowPanel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;



/*
    things to be mocked:
 */
import library.BorrowUC_CTL;
import library.interfaces.EBorrowState;
import library.interfaces.IBorrowUI;
import library.interfaces.IBorrowUIListener;
import library.interfaces.daos.IBookDAO;
import library.interfaces.daos.ILoanDAO;
import library.interfaces.daos.IMemberDAO;
import library.interfaces.entities.EBookState;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;
import library.interfaces.hardware.ICardReader;
import library.interfaces.hardware.ICardReaderListener;
import library.interfaces.hardware.IDisplay;
import library.interfaces.hardware.IPrinter;
import library.interfaces.hardware.IScanner;
import library.interfaces.hardware.IScannerListener;


/**
 * Created by chris on 8/10/15.
 */
public class BorrowUC_CTLTest {
    private ICardReader reader;
    private IScanner scanner;
    private IPrinter printer;
    private IDisplay display;
    private int scanCount = 0;
    private IBorrowUI ui;
    private EBorrowState state;
    private IBookDAO bookDAO;
    private IMemberDAO memberDAO;
    private ILoanDAO loanDAO;
    private List<IBook> bookList;
    private List<ILoan> loanList;
    private IMember borrower;
    //private JPanel previous;

    private BorrowUC_CTL ctl;


    @Before
    public void setUp() throws Exception {

        reader    = mock(library.interfaces.hardware.ICardReader.class);
        scanner   = mock(library.interfaces.hardware.IScanner.class);
        printer   = mock(library.interfaces.hardware.IPrinter.class);
        display   = mock(library.interfaces.hardware.IDisplay.class);
        bookDAO   = mock(library.interfaces.daos.IBookDAO.class);
        memberDAO = mock(library.interfaces.daos.IMemberDAO.class);
        loanDAO   = mock(library.interfaces.daos.ILoanDAO.class);
        ui        = mock(ABorrowPanel.class);

        ctl = new BorrowUC_CTL(reader, scanner, printer, display, bookDAO, loanDAO, memberDAO);


    }

    @After
    public void tearDown() throws Exception {

        reader = null;
        scanner = null;
        printer = null;
        display = null;
        ui = null;
        bookDAO = null;
        memberDAO = null;
        loanDAO = null;

    }



    @Test
    public void testInitialise() throws Exception {
        ctl.initialise();
    }

    @Test
    public void testClose() throws Exception {

    }

    @Test
    public void testCardSwiped() throws Exception {

    }

    @Test
    public void testBookScanned() throws Exception {

    }

    @Test
    public void testCancelled() throws Exception {

    }

    @Test
    public void testScansCompleted() throws Exception {

    }

    @Test
    public void testLoansConfirmed() throws Exception {

    }

    @Test
    public void testLoansRejected() throws Exception {

    }

}