package me.loving11ish.clans.api.models;

import java.util.ArrayList;
import java.util.HashMap;

public interface Clan {

    public String getClanOwner();

    public String getClanFinalOwnerName();

    public void setClanFinalOwnerName(String clanFinalOwnerName);

    public String getClanFinalName();

    public void setClanFinalName(String newClanFinalName);

    public String getClanPrefix();

    public void setClanPrefix(String newClanPrefix);

    public ArrayList<String> getClanMembers();

    public void setClanMembers(ArrayList<String> clanMembersList);

    public void addClanMember(String clanMember);

    public Boolean removeClanMember(String clanMember);

    public ArrayList<String> getClanAllies();

    public void addClanAlly(String ally);

    public void removeClanAlly(String allyUUID);

    public void setClanAllies(ArrayList<String> clanAlliesList);

    public void addClanEnemy(String enemy);

    public void removeClanEnemy(String enemyUUID);

    public void setClanEnemies(ArrayList<String> clanEnemiesList);

    public ArrayList<String> getClanEnemies();

    public boolean isFriendlyFireAllowed();

    public void setFriendlyFireAllowed(boolean friendlyFire);

    public int getClanPoints();

    public void setClanPoints(int clanPoints);

    public String getClanHomeWorld();

    public void setClanHomeWorld(String clanHomeWorld);

    public double getClanHomeX();

    public void setClanHomeX(double clanHomeX);

    public double getClanHomeY();

    public void setClanHomeY(double clanHomeY);

    public double getClanHomeZ();

    public void setClanHomeZ(double clanHomeZ);

    public float getClanHomeYaw();

    public void setClanHomeYaw(float clanHomeYaw);

    public float getClanHomePitch();

    public void setClanHomePitch(float clanHomePitch);

    public int getMaxAllowedProtectedChests();

    public void setMaxAllowedProtectedChests(int maxAllowedProtectedChests);

    public HashMap<String, ClanChest> getProtectedChests();

    public void setProtectedChests(HashMap<String, ClanChest> protectedChests);
    
}
