package de.scholle.announcement;

import org.bukkit.plugin.java.JavaPlugin;
import de.scholle.announcement.AnnounceCommand;
import de.scholle.announcement.MessageUtils;

public class Announcement extends JavaPlugin {

    private static Announcement instance;

    @Override
    public void onEnable() {
        instance = this;

        saveDefaultConfig();
        MessageUtils.loadFromConfig();

        getLogger().info("Announcement Plugin enabled!");
        getCommand("announce").setExecutor(new AnnounceCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Announcement Plugin disabled!");
    }

    public static Announcement getInstance() {
        return instance;
    }
}
