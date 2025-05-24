package plg;
public class JmpRainFallRenderer extends AbstractRenderPlugin {

    public static void main(String[] args) {
        System.out.println("JmpRainFallRenderer");
    }

    public JmpRainFallRenderer() {
    	super();
    }
    
    @Override
    public void initialize() {
    	super.initialize();
    	
    	AbstractRenderPlugin.MainWindow.setTitle("JRFR");
    }
}
