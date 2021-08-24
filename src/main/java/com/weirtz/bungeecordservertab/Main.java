package com.weirtz.bungeecordservertab;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.Callback;
import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.event.EventHandler;
import org.yaml.snakeyaml.error.YAMLException;

public final class Main extends Plugin implements Listener {

    @Override
    public void onEnable() {

        //Register listener for player login events.
        ProxyServer.getInstance().getPluginManager().registerListener(this,this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public String load(){
        boolean disabled;
        try {

            return "azd";

        } catch (YAMLException e){
            System.out.print("Failed to start plugin: Broken Config File. "+ e);
            disabled = true;
            return "Failed to start plugin: Broken Config File.\n";
        } catch (Exception e){
            System.out.print("Failed to start plugin: Internal Error: "+ e);
            disabled = true;
            return "Failed to start plugin: Internal Error.\n";
        }
    }

    @EventHandler
    public void onPostLogin(PostLoginEvent event){
        ProxiedPlayer player = event.getPlayer();

        player.setTabHeader(
                //Header
                new ComponentBuilder("FintieSkies - ").color(ChatColor.RED).bold(true)
                        .append("MC.FINITESKIES.COM").bold(false).color(ChatColor.GREEN).create(),
                //Footer
                new ComponentBuilder("Visit us at finiteskies.com").create() // Empty footer
        );

    }

    public String getServerName(){
        ProxyServer.getServerInfo("serverName").ping(callback);
    }

    Callback<ServerPing> callback = new Callback<ServerPing>() {
        @Override
        public void done(ServerPing result, Throwable error) {
            String motd = TextComponent.toLegacyText(result.getDescriptionComponent());
        }
    };


}
