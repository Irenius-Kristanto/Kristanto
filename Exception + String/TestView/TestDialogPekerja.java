package TestView;

import com.view.DialogPekerja;
import com.view.FrameUtama;
public class TestDialogPekerja {
    public static void main(String[] args) {
        FrameUtama tesFrame = new FrameUtama();
        DialogPekerja tesDialog = new DialogPekerja(tesFrame, true);
        tesFrame.add(tesDialog);
    }
}
