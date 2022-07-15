package snw.jkook.example;

import org.slf4j.Logger;
import snw.jkook.HttpAPI;
import snw.jkook.bot.BaseBot;
import snw.jkook.bot.BotDescription;

import java.io.File;

public class Main extends BaseBot {

    protected Main(String token, File configFile, File dataFolder, HttpAPI httpAPI, BotDescription description, File file, Logger logger) {
        super(token, configFile, dataFolder, httpAPI, description, file, logger);
    }

    @Override
    public void onEnable() {
        getLogger().info("Hello world");
    }
}
