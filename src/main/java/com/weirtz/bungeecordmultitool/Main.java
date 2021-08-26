package com.weirtz.bungeecordmultitool;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;

public final class Main extends Plugin implements Listener {

    @Override
    public void onEnable() {
        //Register listener for player login events.
        ProxyServer.getInstance().getPluginManager().registerListener(this,new TabListener());

        //Register for MOTD Listener.
        ProxyServer.getInstance().getPluginManager().registerListener(this, new MotdListener());
    }

//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic
//    }
}
