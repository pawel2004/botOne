package commands;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Calculate extends ListenerAdapter {

    public void onGuildMessageReceived(GuildMessageReceivedEvent e){

        String[] message = e.getMessage().getContentRaw().split(" ");

        if (message[0].equalsIgnoreCase("!calculate")){

            if(message.length <= 4){

                if (message[2].equalsIgnoreCase("+")){

                    int number1 = Integer.parseInt(message[1]);
                    int number2 = Integer.parseInt(message[3]);
                    int wynik = number1 + number2;

                    e.getChannel().sendMessage("To będzie: " + wynik).queue();

                }
                else if (message[2].equalsIgnoreCase("-")){

                    int number1 = Integer.parseInt(message[1]);
                    int number2 = Integer.parseInt(message[3]);
                    int wynik = number1 - number2;

                    e.getChannel().sendMessage("To będzie: " + wynik).queue();

                }

            }

        }

    }

}
