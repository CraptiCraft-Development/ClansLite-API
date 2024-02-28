package me.loving11ish.clans.api.models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This contains all the `PLOJO` (Plain Old Java Object) methods for the Clan object.
 * <p>
 * This object is used to store all the information about a clan.
 */
public interface Clan {

    /**
     * @return Returns the UUID string off the clan owner.
     */
    String getClanOwner();

    /**
     * This value is not always accurate, as the owner can change their name.
     * <p> 
     * Do not rely on this value for anything important.
     * <p>
     * Please use {@link #getClanOwner()} instead and get the player via the UUID.
     * <p>
     * @return Returns the last known name of the clan owner.
     */
    String getClanFinalOwnerName();

    /**
     * @param clanFinalOwnerName The latest known name of the clan owner.
     */
    void setClanFinalOwnerName(String clanFinalOwnerName);

    /**
     * This value will ALWAYS be accurate, as the name of the clan cannot change.
     * <p>
     * @return Returns the name of the clan.
     */
    String getClanFinalName();

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLANS FROM STORAGE!
     * <p>
     * DO NOT USE THIS METHOD!
     * <p>
     * @param newClanFinalName The new name of the clan.
     */
    void setClanFinalName(String newClanFinalName);

    /**
     * @return Returns the prefix of the clan.
     */
    String getClanPrefix();

    /**
     * This can have colour codes and other UTF-8 formatting.
     * <p>
     * @param newClanPrefix The new prefix of the clan.
     */
    void setClanPrefix(String newClanPrefix);

    /**
     * DO NOT use this to directly inject new or remove members into the clan.
     * <p>
     * Use {@link #addClanMember(String)} or {@link #removeClanMember(String)} instead.
     * <p>
     * @return Returns an arraylist of UUID strings, each one represents a unique clan member.
     */
    ArrayList<String> getClanMembers();

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLANS FROM STORAGE!
     * <p>
     * DO NOT USE THIS METHOD!
     * <p>
     * @param clanMembersList The new list of clan members.
     */
    void setClanMembers(ArrayList<String> clanMembersList);

    /**
     * @param clanMember The UUID string of the clan member to add.
     */
    void addClanMember(String clanMember);

    /**
     * @param clanMember The UUID string of the clan member to remove.
     * @return Returns true if the clan member was removed, false if not found.
     */
    Boolean removeClanMember(String clanMember);

    /**
     * DO NOT use this to directly inject new or remove allied clans into the clan.
     * <p>
     * Use {@link #addClanAlly(String)} or {@link #removeClanAlly(String)} instead.
     * <p>
     * @return Returns an arraylist of UUID strings, each one represents a unique clan ally.
     */
    ArrayList<String> getClanAllies();

    /**
     * @param ally The UUID string of the clan ally to add.
     */
    void addClanAlly(String ally);

    /**
     * @param allyUUID The UUID string of the clan ally to remove.
     */
    void removeClanAlly(String allyUUID);

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLANS FROM STORAGE!
     * <p>
     * DO NOT USE THIS METHOD!
     * <p>
     * @param clanAlliesList The new list of clan allies.
     */
    void setClanAllies(ArrayList<String> clanAlliesList);

    /**
     * @param enemy The UUID string of the clan enemy to add.
     */
    void addClanEnemy(String enemy);

    /**
     * @param enemyUUID The UUID string of the clan enemy to remove.
     */
    void removeClanEnemy(String enemyUUID);

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLANS FROM STORAGE!
     * <p>
     * DO NOT USE THIS METHOD!
     * <p>
     * @param clanEnemiesList The new list of clan enemies.
     */
    void setClanEnemies(ArrayList<String> clanEnemiesList);

    /**
     * DO NOT use this to directly inject new or remove enemies into the clan.
     * <p>
     * Use {@link #addClanEnemy(String)} or {@link #removeClanEnemy(String)} instead.
     * <p>
     * @return Returns an arraylist of UUID strings, each one represents a unique clan enemy.
     */
    ArrayList<String> getClanEnemies();

    /**
     * @return Returns whether friendly fire is allowed in the clan.
     */
    boolean isFriendlyFireAllowed();

    /**
     * @param friendlyFire Whether friendly fire is allowed in the clan.
     */
    void setFriendlyFireAllowed(boolean friendlyFire);

    /**
     * @return Returns the clan points.
     */
    int getClanPoints();

    /**
     * @param clanPoints The new clan points.
     */
    void setClanPoints(int clanPoints);

    /**
     * @return Returns the clan home world string name.
     */
    String getClanHomeWorld();

    /**
     * @param clanHomeWorld The new clan home world string name.
     */
    void setClanHomeWorld(String clanHomeWorld);

    /**
     * @return Returns the clan home X coordinate.
     */
    double getClanHomeX();

    /**
     * @param clanHomeX The new clan home X coordinate.
     */
    void setClanHomeX(double clanHomeX);

    /**
     * @return Returns the clan home Y coordinate.
     */
    double getClanHomeY();

    /**
     * @param clanHomeY The new clan home Y coordinate.
     */
    void setClanHomeY(double clanHomeY);

    /**
     * @return Returns the clan home Z coordinate.
     */
    double getClanHomeZ();

    /**
     * @param clanHomeZ The new clan home Z coordinate.
     */
    void setClanHomeZ(double clanHomeZ);

    /**
     * @return Returns the clan home Yaw.
     */
    float getClanHomeYaw();

    /**
     * @param clanHomeYaw The new clan home Yaw.
     */
    void setClanHomeYaw(float clanHomeYaw);

    /**
     * @return Returns the clan home Pitch.
     */
    float getClanHomePitch();

    /**
     * @param clanHomePitch The new clan home Pitch.
     */
    void setClanHomePitch(float clanHomePitch);

    /**
     * @return Returns the max allowed amount of ClanChests this clan can have.
     */
    int getMaxAllowedProtectedChests();

    /**
     * @param maxAllowedProtectedChests The new max allowed amount of ClanChests this clan can have.
     */
    void setMaxAllowedProtectedChests(int maxAllowedProtectedChests);

    /**
     * This HashMap can be empty if the clan has no protected chests.
     * <p>
     * Direct modification of this HashMap is not currently recommended.
     * <p>
     * Dedicated methods will be added in the future to add, remove, and modify ClanChests.
     * <p>
     * @return Returns a HashMap of all the ClanChests this clan has protected.
     */
    HashMap<String, ClanChest> getProtectedChests();

    /**
     * THIS SHOULD ONLY BE USED FOR INTERNAL USE WHEN LOADING CLANS FROM STORAGE!
     * <p>
     * DO NOT USE THIS METHOD!
     * <p>
     * @param protectedChests The new HashMap of all the ClanChests this clan has protected.
     */
    void setProtectedChests(HashMap<String, ClanChest> protectedChests);
    
}
