
import gui.JrfrRendererWindow;
import plg.AbstractRenderPlugin;
import plg.SystemProperties;

public class JmpRainFallRenderer extends AbstractRenderPlugin {

    public static void main(String[] args) {
        System.out.println("JmpRainFallRenderer");
    }

    public JmpRainFallRenderer() {
        super();
    }

    protected void createMainWindow() {
        MainWindow = new JrfrRendererWindow(
                SystemProperties.getInstance().getWindowWidth(), 
                SystemProperties.getInstance().getWindowHeight());
        MainWindow.init();
    }

    @Override
    public void initialize() {
        SystemProperties.DEFAULT_KEY_WIDTH = 120;
        SystemProperties.DIM_CALC_FUNC = 1;
        
        super.initialize();

        AbstractRenderPlugin.MainWindow.setTitle("JRFR");
    }
}
