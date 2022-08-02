package snw.jkook.example;

import org.slf4j.Logger;
import snw.jkook.plugin.BasePlugin;
import snw.jkook.plugin.PluginDescription;

import java.io.File;

public class Main extends BasePlugin {

    protected Main(File configFile, File dataFolder, PluginDescription description, File file, Logger logger) {
        super(configFile, dataFolder, description, file, logger);
    }

    @Override
    public void onEnable() {
        getLogger().info("Hello world");
    }
}
