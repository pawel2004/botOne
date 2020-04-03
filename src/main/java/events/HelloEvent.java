package events;

import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class HelloEvent extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){

        String[] messageSent = event.getMessage().getContentRaw().split(" ");
        String name = event.getMember().getUser().getName();
        if (messageSent[0].equalsIgnoreCase("cześć")){
            if (!event.getMember().getUser().isBot()){event.getChannel().sendMessage("Cześć, " + name + ". " + "Jestem botem Pawła!").queue();}
        }

    }

}
