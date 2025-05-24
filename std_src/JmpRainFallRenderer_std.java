import jmp.JMPLoader;
import plg.JmpRainFallRenderer;
import std.StandAlonePluginInvoker;

public class JmpRainFallRenderer_std {
    public static void main(String[] args) {
        JMPLoader.UsePluginDirectory = false;
        JMPLoader.UseConfigFile = false;
        JMPLoader.UseHistoryFile = false;
        JMPLoader.UseSkinFile = false;

        StandAlonePluginInvoker.exec(args, new JmpRainFallRenderer());
    }
}
