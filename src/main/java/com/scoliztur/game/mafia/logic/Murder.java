package com.scoliztur.game.mafia.logic;

import com.scoliztur.game.mafia.logic.players.basic.Player;

import java.util.Map;

public class Murder {

    public String killFromSelected(OfferForKilling playerMap) {
        Map.Entry<Player, Byte> mapForKilledPlayer = null;

        for (Map.Entry<Player, Byte> entry : playerMap.getPlayerVoiceMap().entrySet()) {
            if(mapForKilledPlayer == null || entry.getValue().compareTo(mapForKilledPlayer.getValue()) > 0) {
                mapForKilledPlayer = entry;
            }
        }

        if (mapForKilledPlayer != null) {
            mapForKilledPlayer.getKey().setAlive(false);
            return mapForKilledPlayer.getKey().getName() + " was killed";
        }

        return "No one was killed";
    }

}
