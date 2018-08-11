package running_redenvelope.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import running_redenvelope.creativetab.CreativeTabsLoader;

public class BlockCastingStation extends Block
{
	public BlockCastingStation()
    {
        super(Material.iron);
        this.setBlockName("castingStation");
        this.setCreativeTab(CreativeTabsLoader.tabRunning_RedEnvelope);
        this.setStepSound(soundTypeAnvil);
        this.setHardness(5.0F);
        this.setHarvestLevel("pickaxe", 2);
    }
}
