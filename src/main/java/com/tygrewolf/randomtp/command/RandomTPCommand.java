package com.tygrewolf.randomtp.command;

import com.tygrewolf.randomtp.reference.Messages;
import com.tygrewolf.randomtp.reference.Names;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

import java.util.ArrayList;
import java.util.List;

public class RandomTPCommand extends CommandBase
{
    private static List<CommandBase> modCommands = new ArrayList<CommandBase>();
    private static List<String> commands = new ArrayList<String>();

    @Override
    public String getCommandName()
    {
        return Names.Commands.BASE_COMMAND;
    }

    @Override
    public String getCommandUsage(ICommandSender commandSender)
    {
        return Messages.Commands.BASE_COMMAND_USAGE;
    }

    @Override
    public void processCommand(ICommandSender commandSender, String[] args)
    {
        if (args.length >= 1)
        {
            for (CommandBase command : modCommands)
            {
                if (command.getCommandName().equalsIgnoreCase(args[0]) && command.canCommandSenderUseCommand(commandSender))
                {
                    command.processCommand(commandSender, args);
                }
            }
        }
    }


}
