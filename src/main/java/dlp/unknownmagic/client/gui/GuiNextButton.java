package dlp.unknownmagic.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

/**
 * Created by CreedFreak54 on 2/5/2017.
 */
@SideOnly (Side.CLIENT)
public class GuiNextButton extends GuiButton
{
  boolean mIsNextButton;
  ResourceLocation mButtonTexture;

  /**
   * The default constructor will initialize the values in the GuiButton
   * class as well as declare the button as a NextButton.
   *
   * @param buttonId The button Id
   *
   * @param posX The x postion of the button
   *
   * @param posY The y position of the button
   *
   * @param isNextButton Is this a next button
   *
   * @param buttonTexture The texture to bind to the button
   */
  public GuiNextButton (int buttonId, int posX, int posY, boolean isNextButton,
      ResourceLocation buttonTexture)
  {
    super (buttonId, posX, posY, 23, 13, "");

    mIsNextButton = isNextButton;
    mButtonTexture = buttonTexture;
  }

  /**
   * This method will draw the button to the screen based on if the button
   * is visible or not.
   *
   * @param mc The current Minecraft Instance that is running [Client]
   *
   * @param posX The x position of the button to draw
   *
   * @param posY The y position of the button to draw
   */
  @Override
  public void drawButton (Minecraft mc, int posX, int posY)
  {
    boolean isNextPressed = false;
    int textureX, textureY;

    if (visible)
    {
      if (posX >= xPosition && posY >= yPosition
          && posX < xPosition + width
          && posY < yPosition + height)
      {
        isNextPressed = true;
      }

      GL11.glColor4f (1.0F, 1.0F, 1.0F, 1.0F);
      mc.getTextureManager ().bindTexture (mButtonTexture);

      textureX = 0;
      textureY = 192;

      if (isNextPressed)
      {
        textureX += 23;
      }

      if (!mIsNextButton)
      {
        textureY += 13;
      }

      drawTexturedModalRect (xPosition, yPosition,
          textureX, textureY, 23, 13);
    }
  }
}
