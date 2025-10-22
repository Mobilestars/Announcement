package de.scholle.announcement;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import de.scholle.announcement.MessageUtils;

import java.util.HashMap;
import java.util.Map;

public class AnnounceCommand implements CommandExecutor {

    private static final Map<String, ChatColor> colorMap = new HashMap<>();

    static {
        colorMap.put("black", ChatColor.BLACK);
        colorMap.put("dark_blue", ChatColor.DARK_BLUE);
        colorMap.put("dark_green", ChatColor.DARK_GREEN);
        colorMap.put("dark_aqua", ChatColor.DARK_AQUA);
        colorMap.put("dark_red", ChatColor.DARK_RED);
        colorMap.put("dark_purple", ChatColor.DARK_PURPLE);
        colorMap.put("gold", ChatColor.GOLD);
        colorMap.put("gray", ChatColor.GRAY);
        colorMap.put("dark_gray", ChatColor.DARK_GRAY);
        colorMap.put("blue", ChatColor.BLUE);
        colorMap.put("green", ChatColor.GREEN);
        colorMap.put("aqua", ChatColor.AQUA);
        colorMap.put("red", ChatColor.RED);
        colorMap.put("light_purple", ChatColor.LIGHT_PURPLE);
        colorMap.put("yellow", ChatColor.YELLOW);
        colorMap.put("white", ChatColor.WHITE);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length < 1) {
            MessageUtils.send(sender, ChatColor.RED + "Usage: /announce <message> <color>");
            return false;
        }

        String colorName = args.length > 1 ? args[args.length - 1].toLowerCase() : "yellow";
        ChatColor color = colorMap.getOrDefault(colorName, ChatColor.YELLOW);

        // Build message (ignore last arg if it's a color)
        StringBuilder messageBuilder = new StringBuilder();
        int end = args.length > 1 ? args.length - 1 : args.length;
        for (int i = 0; i < end; i++) {
            messageBuilder.append(args[i]).append(" ");
        }

        String message = messageBuilder.toString().trim();

        Bukkit.getOnlinePlayers().forEach(player ->
                MessageUtils.send(player, color + message)
        );

        MessageUtils.send(sender, ChatColor.GREEN + "Announcement sent!");
        return true;
    }
}
