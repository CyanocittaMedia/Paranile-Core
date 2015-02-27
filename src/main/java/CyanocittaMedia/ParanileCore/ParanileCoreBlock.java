package CyanocittaMedia.ParanileCore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ParanileCoreBlock extends Block
{
    public ParanileCoreBlock(Material material) 
    {
            super(material);
            setHarvestLevel("pickaxe",0);
    }
}