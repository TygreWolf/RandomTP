package com.tygrewolf.randomtp.command;

import com.tygrewolf.randomtp.reference.Names;
import com.tygrewolf.randomtp.reference.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by TygreWolf on 4/20/2016.
 */
public class CommandRTP extends CommandBase {

    @Override
    public String getCommandName() {
        return Names.Commands.RANDOM_TELEPORT;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "commands.rtp";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

        // Check argument length(s)
        if (args.length > 0)
        {
            throw new WrongUsageException("commands.rtp.usage", new Object[0]);
        }



        int minX = -10000;
        int maxX = 10000;
        int minY = 62;
        int maxY = 190;
        int minZ = -10000;
        int maxZ = 10000;

        int randX;
        int randZ;

        boolean validCoordinate = false;

        // Do until we find some valid coordinates for the player to teleport to.
        while (!validCoordinate)
        {
            randX = randInt(minX, maxX);
            randZ = randInt(minZ, maxZ);

            //Get a valid Y value.  Y is valid when Y + 1 and Y + 2 are both air blocks.

            //Check if the standing block is a valid block to stand on.  i.e. water and lava are not valid.
        }


        // This should be the teleport command.
        //sender.getCommandSenderEntity().setPosition(x, y, z);
    }

    public static int randInt(int min, int max)
    {
        //TODO: Look into ThreadLocalRandom or making this a static variable.
        Random rand = new Random();
        int randomNum = rand.nextInt((max-min) + 1) + min;

        return randomNum;
    }

    public int getValidY(int x, int z, int minY, int maxY, ICommandSender sender)
    {
        //TODO: Look into BlockPos object
        //TODO: Look into world.getGroundAboveSeaLevel()

        World world = sender.getEntityWorld();

        // for (blockposition = new blockpos(x, getsealevel, z); isairblock; blockposition.up())
        //IBlockState state = world.getGroundAboveSeaLevel(new BlockPos(x, minY, z));
        //state.getBlock().

        for (int i = minY; i<=maxY; i++)
        {
//            if (world.getGroundAboveSeaLevel().getBlock().isAir())
//            {
//
//            }
        }
        return -1;
    }

    public boolean isValidBlockSpace(int x, int z, int y)
    {
        return false;
    }
}
