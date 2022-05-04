import main.MainWindow;
import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.edt.GuiQuery;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class MainWindowTest {
    private FrameFixture window;

    @BeforeClass
    public static void setUpOnce() {
        FailOnThreadViolationRepaintManager.install();
    }
    @Before
    public void setUp(){
        MainWindow frame = GuiActionRunner.execute(new GuiQuery<MainWindow>() {
            @Override
            protected MainWindow executeInEDT() throws Throwable {
                return new MainWindow();
            }
        });
    }
    @Test
    public void playNoteWhenKeyPressed(){
        window.button("C").click();
    }
}
