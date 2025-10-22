package de.scholle.announcement;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import de.scholle.announcement.Announcement;

public class MessageUtils {

    private static String PREFIX = ChatColor.WHITE + "[Announcement] ";

    public static void loadFromConfig() {
        Announcement plugin = Announcement.getInstance();

        String prefixText = plugin.getConfig().getString("prefix.text", "Announcement");
        String prefixColorName = plugin.getConfig().getString("prefix.color", "AQUA");

        ChatColor prefixColor;
        try {
            prefixColor = ChatColor.valueOf(prefixColorName.toUpperCase());
        } catch (IllegalArgumentException e) {
            prefixColor = ChatColor.AQUA;
        }

        PREFIX = ChatColor.WHITE + "" + ChatColor.BOLD + "[" + prefixColor + "" + ChatColor.BOLD + prefixText + ChatColor.WHITE + "" + ChatColor.BOLD + "] " + ChatColor.RESET + "" + ChatColor.BOLD;
    }

    public static void send(CommandSender sender, String message) {
        sender.sendMessage(PREFIX + ChatColor.RESET + message);
    }
}