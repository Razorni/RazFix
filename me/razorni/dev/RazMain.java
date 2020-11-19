package me.razorni.dev;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import me.razorni.dev.fixes.PhaseGlitchListener;

public class RazMain extends JavaPlugin {
	
    public static RazMain instance;
    
    private PhaseGlitchListener phaseglitchHandler;

    public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[RazFix] Plugin has been loaded successfully.");
        instance = this;    
        this.phaseglitchHandler = new PhaseGlitchListener(this);
        this.phaseglitchHandler.enable();

    }
    
    public void onDisable() {
        this.phaseglitchHandler.disable();

    }

    public static RazMain getInstance() {
        return instance;
      }
}
