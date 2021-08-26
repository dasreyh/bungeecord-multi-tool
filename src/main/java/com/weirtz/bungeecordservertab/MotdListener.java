package com.weirtz.bungeecordservertab;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class MotdListener implements Listener {
    @EventHandler
    public void onPing(ProxyPingEvent e){
        ServerPing serverPing = e.getResponse();

        final BaseComponent[] bungee = new ComponentBuilder("                FiniteSkies Network ").color(ChatColor.LIGHT_PURPLE)
                .append("[").color(ChatColor.GRAY).append("1.17").color(ChatColor.WHITE).append("]\n").color(ChatColor.GRAY)
                .append("              MC.FINITESKIES.COM").bold(true).color(ChatColor.GOLD)
                .create();

        TextComponent message = new TextComponent( "Hello world" );
        message.setColor( ChatColor.RED );
        message.setBold( true );

        serverPing.setDescriptionComponent(new TextComponent(bungee));
//        serverPing.setDescriptionComponent(new TextComponent("HELLO" + ChatColor.RED));
        e.setResponse(serverPing);
    }
}
