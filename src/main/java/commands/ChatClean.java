package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ChatClean extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent e){

        if (e.getMessage().getContentRaw().equalsIgnoreCase("!czyść")){

            String name = e.getChannel().getName();

            e.getChannel().createCopy().queue();

            e.getChannel().delete().queue();

        }

    }

}
