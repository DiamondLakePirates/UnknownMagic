package dlp.unknownmagic.ether;


/**
 * This class outlines the Ether Energy System within the UnknownMagic Mod
 */
public class Ether implements IEther, IEtherStorage
{
    private static final int COMPRESSION_VALUE = 100;


    protected int mEther;
    protected int mEtherCap;
    protected int mMaxReceive;
    protected int mMaxExtract;

    /**
     * The Default Constructor for an Ether Object. These Default values
     * may change in the future.
     */
    public Ether ()
    {
        this.mEther = 0;
        this.mEtherCap = 1000;
        this.mMaxReceive = 100;
        this.mMaxExtract = 100;
    }
    /**
     * This Constructor allows for the input of the total Ether Capacity,
     * the Max amount of Ether to receive at any one time, and the Max
     * amount of Ether for Extraction at any one time.
     *
     * @param etherCapacity The capacity any Ether Device will have
     *
     * @param maxReceive The Max amount of Ether received at any one transfer
     *                   of Ether
     *
     * @param maxExtract The Max amount of Ether to Extract from the given
     *                    Ether transferring Device.
     */
    public Ether (int etherCapacity, int maxReceive, int maxExtract)
    {
        this.mEther = 0;
        this.mEtherCap = etherCapacity;
        this.mMaxReceive = maxReceive;
        this.mMaxExtract = maxExtract;
    }

    /*
     * The Below Methods will be the Implemented Methods from the IEther
     * Interface.
     *
     * Note: That this Interface may expand in the future.
     */

    /**
     * Note: Currently No usage, But can be used and is anticipated to
     * be used in the future.
     *
     * This method will compress a certain amount of Ether if there is
     * enough Ether within the Device. If there is enough Ether, then
     * compress the Ether by a factor of 10 and return the compressed
     * amount of Ether.
     *
     * @return The compressed Ether.
     */
    @Override
    public int compressEther (int amountToCompress)
    {
        if (canCompress (amountToCompress))
        {
            // throw exception if there is not enough
            // ether in the machine or at least some
            // type of error message
            mEther = mEther - amountToCompress;
            amountToCompress /= COMPRESSION_VALUE;
        }

        return amountToCompress;
    }

    /**
     * This method will convert Ether into other values if we choose to have
     * a conversion of Ether to RF. This is undecided as of Now.
     *
     * @return The conversion amount.
     */
    @Override
    public int convertEther ()
    {
        return 1;
    }

    @Override
    public void releaseEther ()
    {

    }

    @Override
    public int convertToPureEther ()
    {
        return 1;
    }


    /* TODO: The Below Methods are from the IEtherStorage Interface
     * For more Information on this interface, reference the IEtherStorage File
     */

    /**
     * This method will determine if Ether/Energy is able to be Inserted or
     * the Device is able to receive more Ether/Energy. If the Device can
     * accept more Ether that "receive" or insert that amount into the total
     * current amount of Ether.
     *
     * @param maxReceive The Maximum of Ether that can be received at any one
     *                   in game tick.
     *
     * @param simulate True - If the Device can receive Ether
     *                 False - If The Device cannot receive Ether
     *
     * @return  The amount of Ether received
     */
    @Override
    public int receiveEther(int maxReceive, boolean simulate)
    {
        return 1;
    }

    /**
     * This method will determine if Ether/Energy is able to be extracted from
     * the Device and if the Ether is able to be extracted, return that amount
     * up to the Max Amount of Ether that is able to be extracted from said
     * Device.
     *
     * @param maxExtract The max amount of Ether/Energy that can be extracted.
     *
     * @param simulate Should the Ether/Energy be extracted.
     *
     * @return The amount of energy to extract.
     *
     * NOTE: This still needs implementing
     */
    @Override
    public int extractEther (int maxExtract, boolean simulate)
    {
        return 1;
    }

    /**
     * Returns the Current Ether stored within the Device it's a part of
     *
     * @return mEther - The amount of Ether currently in the Device.
     */
    @Override
    public int getEtherStored()
    {
        return mEther;
    }

    /**
     * Returns the Max amount of Ether that can be Stored within the Device
     *
     * @return mEtherCap - The Max Ether that can be stored
     */
    @Override
    public int getMaxEtherStored()
    {
        return mEtherCap;
    }

    /**
     * This method will decide if we are able to Extract Ether from a Device
     * or not.
     *
     * @return If mMaxExtract > 0
     */
    @Override
    public boolean canExtract()
    {
        return this.mMaxExtract > 0;
    }

    /**
     * This method will decide if we are able to Receive Ether from a Device
     * or not.
     *
     * @return If mMaxReceive > 0
     */
    @Override
    public boolean canReceive()
    {
        return this.mMaxReceive > 0;
    }

    /*
     * Below this are the Other responsibilities of the Ether Class.
     * Note: That most of these should be Private Methods and used
     * strictly for the internals of the Ether Class
     */

    /**
     * This method decides if Ether is able to compress the amount
     * passed into the method.
     *
     * @param amountToCompress The amount of Ether to compress to be used
     *                         later.
     *
     * @return True - If mEther > amountToCompress.
     *         False - If mEther < amountToCompress.
     */
    private boolean canCompress (int amountToCompress)
    {
        return this.mEther > amountToCompress;
    }
}
