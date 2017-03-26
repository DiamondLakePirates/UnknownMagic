package dlp.unknownmagic.ether;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import java.util.concurrent.Callable;

/**
 * This is the EtherCapability used for for the Ether Capability.
 */
public class EtherCapability
{
    @CapabilityInject (IEtherStorage.class)
    public static Capability<IEtherStorage> ETHER = null;

    public static void register ()
    {
        CapabilityManager.INSTANCE.register (IEtherStorage.class, new IStorage<IEtherStorage> ()
        {
            /**
             * This method will write the data from the specific instance of the
             * IEtherStorage instance to an NBT tag
             *
             * @return an NBTBase with the data from the instance of the capability
             */
            @Override
            public NBTBase writeNBT (Capability<IEtherStorage> capability,
                IEtherStorage instance, EnumFacing side)
            {
                return new NBTTagInt (instance.getEtherStored ());
            }

            /**
             * This method will read the nbt data sent in as the parameter and apply
             * it to the energy storage instance.
             */
            @Override
            public void readNBT (Capability<IEtherStorage> capability,
                IEtherStorage instance, EnumFacing side, NBTBase nbt)
            {
                if (!(instance instanceof Ether))
                    throw new IllegalArgumentException (
                        "Can not deserialize to an " + "instance that isn't the"
                            + "default implementation of an IEtherStorage.");
                ((Ether) instance).mEther = (((NBTTagInt) nbt).getInt ());
            }
        },
         new Callable<IEtherStorage> ()
        {
            @Override
            public IEtherStorage call () throws Exception
            {
                return new Ether (1000, 100, 100);
            }
        });
    }
}