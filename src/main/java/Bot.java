import commands.Calculate;
import commands.ChatClean;
import commands.Members;
import events.CategoryCreate;
import events.HelloEvent;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static void main (String args[]) throws Exception{

        JDA jda = new JDABuilder("Njk1NjI3NTMyNDc2NzQzODMx.Xoc7yA.oDndZIiYNstQICjjYs0_39a7NDU").build();

        jda.addEventListener(new HelloEvent());
        jda.addEventListener(new CategoryCreate());
        jda.addEventListener(new Calculate());
        jda.addEventListener(new ChatClean());
    }

}
