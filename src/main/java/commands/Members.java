package commands;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Members extends ListenerAdapter {

    List <String> memberss= new ArrayList<String>();
    List <String> membersTag = new ArrayList<String>();

    public void onGuildMessageReceived(GuildMessageReceivedEvent e) throws NullPointerException{

        String[] message = e.getMessage().getContentRaw().split(" ");

        if (message[0].equalsIgnoreCase("!członkowie")){

            String name = e.getMember().getUser().getName();

            String [] membersTag1 = e.getGuild().getMembers().toString().split("/");

            for (String member : membersTag1){

                membersTag.add(member.substring(member.length()- 19, member.length() - 2));

            }

            for (String member : membersTag){

                memberss.add(e.getGuild().getMemberById(member).getUser().getName());

            }

            e.getChannel().sendMessage("Witaj, " + name + ". " + "Na tym serwerze jest: " + Arrays.toString(memberss.toArray())).queue();

        }

    }

}
