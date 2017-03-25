package dlp.unknownmagic.ether;

/**
 * This interface is akin to the IEnergyStorage Interface for a couple of
 * reasons, First being is that although Ether is a type of energy (magic)
 * I thought it would be confusing when others handle the code that making a
 * call to receiveEnergy would be confusing seeming how we want Ether. Another
 * reason which may seem premature in my understanding is that I don't want
 * Ether to be interfaceable with other energy like the RF system. Having
 * this be another interface will hopefully prevent that from happening.
 */
public interface IEtherStorage
{
    /**
     * Adds ether to the storage. Returns quantity of ether that was accepted.
     *
     * @param maxReceive
     *            Maximum amount of energy to be inserted.
     * @param simulate
     *            If TRUE, the insertion will only be simulated.
     * @return Amount of energy that was (or would have been, if simulated)
     * accepted by the storage.
     */
    int receiveEther (int maxReceive, boolean simulate);

    /**
     * Removes ether from the storage. Returns quantity of ether that was removed.
     *
     * @param maxExtract
     *            Maximum amount of ether to be extracted.
     * @param simulate
     *            If TRUE, the extraction will only be simulated.
     * @return Amount of ether that was (or would have been, if simulated)
     * extracted from the storage.
     */
    int extractEther(int maxExtract, boolean simulate);

    /**
     * Returns the amount of ether currently stored.
     */
    int getEtherStored();

    /**
     * Returns the maximum amount of ether that can be stored.
     */
    int getMaxEtherStored();

    /**
     * Returns if this storage can have ether extracted.
     * If this is false, then any calls to extractEther will return 0.
     */
    boolean canExtract();

    /**
     * Used to determine if this storage can receive ether.
     * If this is false, then any calls to receiveEther will return 0.
     */
    boolean canReceive();
}
