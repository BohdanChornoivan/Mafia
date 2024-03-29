package com.scoliztur.game.mafia.services.factory.model;

import com.scoliztur.game.mafia.logic.players.basic.Player;
import com.scoliztur.game.mafia.logic.players.role.type.BlackPlayers;
import com.scoliztur.game.mafia.logic.players.role.type.RedPlayers;

public interface CreatorPlayer {
    Player createPlayer(String nameRole, String name);
}
