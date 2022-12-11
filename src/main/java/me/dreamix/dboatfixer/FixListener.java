package me.dreamix.dboatfixer;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleEnterEvent;

public class FixListener implements Listener {

    @EventHandler
    public void onBoatJoin(VehicleEnterEvent e) {
        if(e.getEntered() instanceof Player) {
            if (DBoatFixer.instance.getConfig().getList("vehicles").contains(e.getVehicle().getName().toUpperCase())) {
                if (e.getEntered().hasPermission(DBoatFixer.instance.getConfig().getString("permission"))) return;
                e.getEntered().sendMessage(DBoatFixer.instance.getConfig().getString("message").replace("&", "§"));
                e.setCancelled(true);
            }
        }
    }

}
