package com.InfinityRaider.AgriCraft.farming;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.IGrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.ArrayList;
import java.util.Random;

public interface IAgriCraftPlant extends IGrowable {
    /** Returns the GowthRequirement for this plant */
    public GrowthRequirement getGrowthRequirement();

    /** Gets the seed for this plant */
    public IAgriCraftSeed getSeed();

    /** Gets an arraylist of all possible fruit drops from this plant */
    public ArrayList<ItemStack> getFruits();

    /** Returns a random fruit for this plant */
    public ItemStack getFruit(Random rand);

    /** Returns an ArrayList with amount of  andom fruit stacks for this plant */
    public ArrayList<ItemStack> getFruit(int amount, Random rand);

    /** Gets the icon for the growth stage, going from 0 to 7. 0 is a newly planted plant and 7 is a mature plant */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int meta);
}