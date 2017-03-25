package dlp.unknownmagic.network;

import dlp.unknownmagic.client.gui.GuiTomeOfAllure;
import dlp.unknownmagic.lib.LibGuiIdentifiers;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import javax.annotation.Nullable;

/**
 * This class implements the IGuiHandle and is the GuiHandler for the
 * UnknownMagic Mod. TODO: Create a Lib for the GUI ID's
 */
public class UMGuiHandler implements IGuiHandler
{

  /**
   * This method sends the server the appropriate Gui Elements, so for example
   * if there is a machine, we need to open the Container on the Server side
   * of the game, Therefore we need to send the right container to the server.
   *
   * @param ID The Gui ID
   *
   * @param player The player opening the Gui
   *
   * @param world The world the Gui is being opened in
   *
   * @param x Currently unneeded data initialized to 0
   * @param y Currently unneeded data initialized to 0
   * @param z Currently unneeded data initialized to 0
   *
   * @return The Gui or Container to open Server Side.
   */
  @Nullable
  @Override
  public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
  {
    switch (ID)
    {
      case LibGuiIdentifiers.GUI_ID_TOME:
        return null;
    }

    return null;
  }

  /**
   * This method sends the client the appropriate Gui Elements, so for example
   * if there is a machine, we need to open the Gui Client side of the game,
   * Therefore we need to send the right Gui to the Client.
   *
   * @param ID The Gui ID
   *
   * @param player The player opening the Gui
   *
   * @param world The world the Gui is being opened in
   *
   * @param x Currently unneeded data initialized to 0
   * @param y Currently unneeded data initialized to 0
   * @param z Currently unneeded data initialized to 0
   *
   * @return The Gui to open Server Side.
   */
  @Nullable
  @Override
  public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
  {
    switch (ID)
    {
      case LibGuiIdentifiers.GUI_ID_TOME:
        return new GuiTomeOfAllure ();
    }
    return null;
  }
}
