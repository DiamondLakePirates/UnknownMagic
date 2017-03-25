package dlp.unknownmagic.items;

import dlp.unknownmagic.UnknownMagic;
import dlp.unknownmagic.lib.LibGuiIdentifiers;
import dlp.unknownmagic.lib.LibItemNames;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import dlp.unknownmagic.network.UMGuiHandler;

import javax.annotation.Nonnull;

/**
 * This class outlines the TomeOfAllure item and what it's responsibilities are.
 */
public class ItemAllureTome extends ItemBase
{
  /**
   * This is the default constructor of the ItemAllureTome. Which mainly
   * sets the max stack size and name of the Tome Item.
   */
  public ItemAllureTome ()
  {
    super (LibItemNames.TOME_NAME);
    setMaxStackSize (1);
  }

  /**
   * This method dictates what happens when the TomeOfAllure book is right
   * clicked. In this case it will open a Gui where a wealth of information
   * will be stored.
   *
   * @param world The world in which the item is clicked in.
   *
   * @param player The player that right clicked the item.
   *
   * @param handIn The the item being right clicked is in.
   *
   * @return A successful Action result
   */
  @Nonnull
  @Override
  public ActionResult<ItemStack> onItemRightClick (World world, EntityPlayer player, EnumHand handIn)
  {
    ItemStack itemStack = player.getHeldItem(handIn);

      player.openGui (UnknownMagic.instance,
          LibGuiIdentifiers.GUI_ID_TOME, world, 0,0,0);

    return (new ActionResult (EnumActionResult.SUCCESS, itemStack));
  }
}