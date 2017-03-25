package dlp.unknownmagic.ether;

/**
 * This is the Capability for the Magical Energy System known as Ether within
 * the Unknown Magic Mod. This interface outlines the responsibilities of an
 * Ether object
 *
 * TODO: This may change in the future, thus separate IEther from IEtherStorage
 */
public interface IEther
{
    // Ideas for Ether Computations

    // Compress to what?
    int compressEther (int amountToCompress);

    // Convert to What?
    int convertEther ();

    /**
     * Releases the Ether from the Device Ether is associated with
     */
    void releaseEther ();

    // Pure Ether should be it's own Class so we will return it based on
    // A certain amount of Ether.
    int convertToPureEther ();
}
