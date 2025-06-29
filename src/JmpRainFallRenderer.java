
import gui.JrfrRendererWindow;
import plg.AbstractRenderPlugin;
import plg.SystemProperties;

public class JmpRainFallRenderer extends AbstractRenderPlugin {

    public static void main(String[] args) {
        System.out.println("JmpRainFallRenderer");
    }

    public JmpRainFallRenderer() {
        super();

        SystemProperties.DEFAULT_KEY_WIDTH = 120;
    }

    protected void createMainWindow() {
        MainWindow = new JrfrRendererWindow();
        MainWindow.init();
    }

    @Override
    public void initialize() {
        super.initialize();

        AbstractRenderPlugin.MainWindow.setTitle("JRFR");
    }
}
