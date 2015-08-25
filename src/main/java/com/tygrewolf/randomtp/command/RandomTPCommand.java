package com.tygrewolf.randomtp.command;

import com.tygrewolf.randomtp.reference.Messages;
import com.tygrewolf.randomtp.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTPCommand extends CommandBase
{
    private static List<CommandBase> modCommands = new ArrayList<CommandBase>();
    private static List<String> commands = new ArrayList<String>();
    private static List<Block> invalidBlocks = new ArrayList<Block>();
    private static List<Block> validBlocks = new ArrayList<Block>();
    private static Random rand = new Random();

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

    private static void teleport(EntityPlayerMP player)
    {
        int y;
        int x;
        int z;

        do {
            x = rand.nextInt(100000);
            z = rand.nextInt(100000);
            y = getGroundLevel(player.getEntityWorld(), x, z);
        } while (y == -1);

        player.setPositionAndUpdate(x, y, z);
    }

    private static void teleport(EntityPlayerSP player)
    {
        int y;
        int x;
        int z;

        do {
            x = rand.nextInt(100000);
            z = rand.nextInt(100000);
            y = getGroundLevel(player.getEntityWorld(), x, z);
        } while (y == -1);

        player.setPositionAndUpdate(x, y, z);
    }

    private static int getGroundLevel(World world, int x, int z)
    {
        for (int y = 60; y < 256; y++ )
        {
            if (world.isAirBlock(x, y, z) && world.isAirBlock(x, y+1, z) && world.blockExists(x, y-1, z))
            {
                if (isValidBlock(world, x, y-1, z))
                {
                    return y;
                }
            }
        }
        return -1;
    }

    private static Boolean isValidBlock(World world, int x, int y, int z)
    {
        return validBlocks.contains(world.getBlock(x, y, z));
    }

    static
    {
        validBlocks.add(Blocks.dirt);
        validBlocks.add(Blocks.sand);
        validBlocks.add(Blocks.sandstone);
        validBlocks.add(Blocks.grass);
        validBlocks.add(Blocks.stone);
        validBlocks.add(Blocks.cobblestone);
        validBlocks.add(Blocks.gravel);
        validBlocks.add(Blocks.clay);
        validBlocks.add(Blocks.hardened_clay);
        validBlocks.add(Blocks.mycelium);
        validBlocks.add(Blocks.brown_mushroom_block);
        validBlocks.add(Blocks.ice);
        validBlocks.add(Blocks.packed_ice);
        validBlocks.add(Blocks.snow);
        validBlocks.add(Blocks.snow_layer);
        validBlocks.add(Blocks.leaves);
    }


}
