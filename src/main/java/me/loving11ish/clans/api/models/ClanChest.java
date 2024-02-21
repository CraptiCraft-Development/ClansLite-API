package me.loving11ish.clans.api.models;

import java.util.ArrayList;

public interface ClanChest {

    public String getUUID();

    public void setUUID(String UUID);

    public String getChestWorldName();

    public void setChestWorldName(String chestWorldName);

    public double getChestLocationX();

    public void setChestLocationX(double chestLocationX);

    public double getChestLocationY();

    public void setChestLocationY(double chestLocationY);

    public double getChestLocationZ();

    public void setChestLocationZ(double chestLocationZ);

    public ArrayList<String> getPlayersWithAccess();

    public void setPlayersWithAccess(ArrayList<String> playersWithAccess);
    
}
