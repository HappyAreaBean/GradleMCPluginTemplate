package cc.happyareabean.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class ExamplePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Hello world!");
    }

}