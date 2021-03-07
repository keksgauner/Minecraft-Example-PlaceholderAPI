package me.kookie.papiexpansions;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import us.myles.ViaVersion.api.Via;
import us.myles.ViaVersion.api.protocol.ProtocolVersion;

import org.bukkit.entity.Player;

public class ExpansionVersion extends PlaceholderExpansion {

    public String getAuthor() {
        return "Keks";
    }

    public String getIdentifier() {
        return "version";
    }

    public String getVersion() {
        return "1.0";
    }

    public String onPlaceholderRequest(Player p, String identifier) {
        if (p == null)
            return "";
        
        ProtocolVersion v;
        if (identifier.equals("version")) {
        	v = ProtocolVersion.getProtocol(Via.getAPI().getPlayerVersion(p.getUniqueId()));
            return (v == null) ? "unknown" : v.getName();
        }
        
    	boolean ergebnis;
        if (identifier.equals("pvp")){
        	if(Via.getAPI().getPlayerVersion(p.getUniqueId()) >= 47) { ergebnis = true; } else { ergebnis = false; }
        	return String.valueOf(ergebnis);
        }
        
        if (identifier.equals("nonpvp")) {
        	if(Via.getAPI().getPlayerVersion(p.getUniqueId()) >= 573) { ergebnis = true; } else { ergebnis = false; }
            return String.valueOf(ergebnis);
        }
        return null;
    }

}
