package me.loving11ish.clans.api.models;

import java.util.ArrayList;

/**
 * This contains all the `PLOJO` (Plain Old Java Object) methods for the ClanChest object.
 * <p>
 * This class contains all the methods that can be used to interact with the ClanChest.
 */
public interface ClanChest {

    /**
     * @return Returns the UUID string of the clan chest.
     */
    String getUUID();

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLAN-CHESTS FROM STORAGE!
     * <p>
     * @param UUID The UUID of the clan chest.
     */
    void setUUID(String UUID);

    /**
     * @return Returns the world name of the clan chest location.
     */
    String getChestWorldName();

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLAN-CHESTS FROM STORAGE!
     * <p>
     * @param chestWorldName The world name of the clan chest location.
     */
    void setChestWorldName(String chestWorldName);

    /**
     * @return Returns the X location of the clan chest.
     */
    double getChestLocationX();

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLAN-CHESTS FROM STORAGE!
     * <p>
     * @param chestLocationX The X location of the clan chest.
     */
    void setChestLocationX(double chestLocationX);

    /**
     * @return Returns the Y location of the clan chest.
     */
    double getChestLocationY();

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLAN-CHESTS FROM STORAGE!
     * <p>
     * @param chestLocationY The Y location of the clan chest.
     */
    void setChestLocationY(double chestLocationY);

    /**
     * @return Returns the Z location of the clan chest.
     */
    double getChestLocationZ();

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLAN-CHESTS FROM STORAGE!
     * <p>
     * @param chestLocationZ The Z location of the clan chest.
     */
    void setChestLocationZ(double chestLocationZ);

    /**
     * Each string in the arraylist is the UUID string of player with access to the clan chest.
     * <p>
     * @return Returns the list of players with access to the clan chest.
     */
    ArrayList<String> getPlayersWithAccess();

    /**
     * @param playersWithAccess The new list of players with access to the clan chest.
     */
    void setPlayersWithAccess(ArrayList<String> playersWithAccess);
    
}
