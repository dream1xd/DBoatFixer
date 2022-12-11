package me.dreamix.dboatfixer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class FixCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length != 1) {
            if(sender.isOp()) sender.sendMessage("§fИспользуйте: §e/" + command.getName() + " reload");
            else sender.sendMessage("§cНет прав!");
        } else {
            if(args[0].equalsIgnoreCase("reload")) {
                sender.sendMessage("§aКонфигурация перезагружена!");
                DBoatFixer.instance.reloadConfig();
            }
        }

        return false;
    }
}
