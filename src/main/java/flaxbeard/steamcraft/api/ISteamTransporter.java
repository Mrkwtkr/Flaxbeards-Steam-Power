package flaxbeard.steamcraft.api;

import flaxbeard.steamcraft.api.steamnet.SteamNetwork;
import flaxbeard.steamcraft.api.util.Coord4;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.HashSet;

public interface ISteamTransporter {

    public float getPressure();

    public float getPressureResistance();

    public boolean canInsert(ForgeDirection face);

    public int getCapacity();

    public int getSteamShare();

    public void explode();

    public void insertSteam(int amount, ForgeDirection face);

    public void decrSteam(int i);

    public boolean doesConnect(ForgeDirection face);

    public abstract boolean acceptsGauge(ForgeDirection face);

    public HashSet<ForgeDirection> getConnectionSides();

    public World getWorld();

    public String getNetworkName();

    public void setNetworkName(String name);

    public SteamNetwork getNetwork();

    public void setNetwork(SteamNetwork steamNetwork);

    public void refresh();

    public Coord4 getCoords();

    public int getDimension();

    public int getSteam();

    public void updateSteam(int steam);

    public String getName();

    public void wasAdded();

}
