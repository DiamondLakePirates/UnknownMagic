package dlp.unknownmagic.client.gui;

import dlp.unknownmagic.UnknownMagic;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

/**
 * This class will define the GuiTomeOfAllure object and it't contents
 * when the TomeOfAllure book is right clicked.
 *
 * NOTE: Make this Gui much more immersive including, but not limited too
 * fancier Textures, Fonts, and overall player usage. Designing this Book
 * before coding it could prove to be useful and CreedTheFreak will take care
 * of the Code for the Book at a later date.
 */
public class GuiTomeOfAllure extends GuiScreen
{
  private static final int TOME_HEIGHT = 192;
  private static final int TOME_WIDTH = 192;
  private static final int TOTAL_PAGES = 2;

  private int mCurrentPage = 0;

  private GuiButton mButtonDone;
  private GuiNextButton mNextButton;
  private GuiNextButton mPrevButton;

  // Maybe use a Vector or List for this in order to
  // Dynamically add some more resource locations that
  // a player could make? TODO: Custom TODO List for the Book?
  private static ResourceLocation[] mTomeImageLocations =
      new ResourceLocation[10];

  private static String[] mTomeStrings =
      new String[10];



  /**
   * This is the Default Constructor for the GuiTomeOfAllure class. This will
   * temporarily initialize some strings and resource locations in order to
   * display the strings to the screen on the Gui textures.
   */
  public GuiTomeOfAllure ()
  {
    mTomeImageLocations[0] = new ResourceLocation (UnknownMagic.MODID
        + ":textures/gui/allure_cover_page.png");
    mTomeImageLocations[1] = new ResourceLocation (UnknownMagic.MODID
        + ":textures/gui/allure_page.png");

    mTomeStrings[0] = "";
    mTomeStrings[1] = "Welcome to Unknown Magic!";
  }

  /**
   * This method will mainly initialize the gui with it's corresponding
   * buttons and other forms of items.
   */
  @Override
  public void initGui ()
  {
    int offsetFromScreenLeft = (width - TOME_HEIGHT) / 2;

    System.out.println ("GuiTomeOfAllure Initializing Gui()");

    buttonList.clear ();
    Keyboard.enableRepeatEvents (true);

    mButtonDone = new GuiButton (0,
        width / 2 + 2, 4 + TOME_HEIGHT, 98,
        20, I18n.format ("gui.done", new Object[0]));
    buttonList.add (mButtonDone);

    buttonList.add (mNextButton = new GuiNextButton (1,
        offsetFromScreenLeft + 120, 156, true,
        mTomeImageLocations[1]));

    buttonList.add (mPrevButton = new GuiNextButton (2,
        offsetFromScreenLeft + 38, 156, false,
        mTomeImageLocations[1]));
  }

  /**
   * This method is used to update the screen and it's buttons based on
   * if the player is at specific pages in the book, what buttons should
   * or shouldn't be displayed.
   */
  @Override
  public void updateScreen ()
  {
    mButtonDone.visible = (mCurrentPage == TOTAL_PAGES - 1);
    mNextButton.visible = (mCurrentPage < TOTAL_PAGES - 1);
    mPrevButton.visible = (mCurrentPage > 0);
  }
  /**
   * This method draws the Gui to the screen. Currently this is only
   * just displaying the dark tint whenever a gui is opened.
   *
   * @param mouseX The x mouse position
   *
   * @param mouseY The y mouse position
   *
   * @param partialTicks Backtracked this and I'm not sure what it does.
   */
  @Override
  public void drawScreen (int mouseX, int mouseY, float partialTicks)
  {
    int offsetFromScreenLeft = (width - TOME_WIDTH) / 2;
    int widthOfString;
    String stringPageIndicator = I18n.format ("book.pageIndicator",
        new Object[] {Integer.valueOf(mCurrentPage + 1), TOTAL_PAGES});

    GL11.glColor4f (1.0F, 1.0F, 1.0F, 1.0F);
    this.drawDefaultBackground (); // tints the background

    if (mCurrentPage == 0)
    {
      mc.getTextureManager ().bindTexture (mTomeImageLocations[0]);
    }
    else
    {
      mc.getTextureManager ().bindTexture (mTomeImageLocations[1]);
    }

    drawTexturedModalRect (offsetFromScreenLeft, 2, 0, 0,
        TOME_WIDTH, TOME_HEIGHT);

    widthOfString = fontRendererObj.getStringWidth (stringPageIndicator);

    fontRendererObj.drawSplitString (mTomeStrings[mCurrentPage],
        (offsetFromScreenLeft + widthOfString - 22), 34,
        116, 0);

    super.drawScreen (mouseX, mouseY, partialTicks);
  }

  /**
   * This method will pause the game when this Gui is open
   * [Only in single player]. This allows the browsing of the
   * Mod information without worrying about the explosions of
   * dem creepers.
   *
   * @return True - This will pause the game in Single Player when the
   *                 Gui is opened.
   */
  @Override
  public boolean doesGuiPauseGame ()
  {
    return true;
  }

  /**
   * This method is called when a mouse is clicked and then moved around.
   * Note: Leaving parameters out of comments since this is'nt used yet.
   */
  @Override
  public void mouseClickMove (int mouseX, int mouseY, int lastButtonClicked,
      long timeSinceMouseClick)
  {
  }

  /**
   * This method will change the Gui screen based on what the player does
   * within the Gui screen, in this case it'll move the pages depending on
   * what button is pressed.
   *
   * @param button The button that was pressed
   */
  @Override
  protected void actionPerformed (GuiButton button)
  {
    if (button == mButtonDone)
    {
      mc.displayGuiScreen ((GuiScreen) null);
    }
    else if (button == mNextButton)
    {
      if (mCurrentPage < TOTAL_PAGES - 1)
      {
        mCurrentPage++;
      }
    }
    else if (button == mPrevButton)
    {
      if (mCurrentPage > 0)
      {
        mCurrentPage--;
      }
    }
  }

  /**
   * May add something here eventually
   */
  @Override
  public void onGuiClosed ()
  {
  }
}