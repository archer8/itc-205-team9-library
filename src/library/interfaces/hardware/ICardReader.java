package library.interfaces.hardware;

import library.interfaces.hardware.ICardReaderListener;

public interface ICardReader {
	
    void addListener(ICardReaderListener listener);

	void setEnabled(boolean enabled);

}
