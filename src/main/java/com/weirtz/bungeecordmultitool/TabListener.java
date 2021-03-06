package com.weirtz.bungeecordmultitool;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class TabListener implements Listener {

    @EventHandler
    public void onPostLogin(final PostLoginEvent event){
        ProxiedPlayer player = event.getPlayer();

        player.setTabHeader(
                //Set Header
                new ComponentBuilder(" \n").color(ChatColor.WHITE)
                        .append("You're playing on ").color(ChatColor.GOLD)
                        .append("MC.FINITESKIES.COM").bold(true).color(ChatColor.LIGHT_PURPLE)
                        .append(" \n").bold(false).color(ChatColor.WHITE)
                        .create(),
                //Set Footer
                new ComponentBuilder(" \n").color(ChatColor.WHITE)
                        .append( "Visit us at ").color(ChatColor.WHITE)
                        .append( "finiteskies.com ").color(ChatColor.LIGHT_PURPLE).bold(true)
                        .append("for awesome perks!").color(ChatColor.WHITE).bold(false)
                        .append(" \n").color(ChatColor.WHITE)
                        .create()
        );

    }
}
