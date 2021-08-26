package com.weirtz.bungeecordservertab;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;

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
