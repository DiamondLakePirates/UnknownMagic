package dlp.unknownmagic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockAncientBrick extends Block {
	
	public static final String ANCIENT_BRICK = "ancient_brick";
	
	public BlockAncientBrick() {
		super(Material.ROCK, MapColor.CYAN);
		
		this.setRegistryName(ANCIENT_BRICK).setUnlocalizedName(ANCIENT_BRICK);
		this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		GameRegistry.register(this);
	}
}
