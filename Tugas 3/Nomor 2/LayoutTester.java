/**
 * Untuk memanggil masing-masing class yang diinginkan
 */
public class LayoutTester {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setBorderLayout();
                new setFlowLayout();
                new setGridLayout();
            }
        });
    }
}
