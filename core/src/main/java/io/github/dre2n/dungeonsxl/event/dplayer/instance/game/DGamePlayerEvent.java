/*
 * Copyright (C) 2012-2016 Frank Baumann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package io.github.dre2n.dungeonsxl.event.dplayer.instance.game;

import io.github.dre2n.dungeonsxl.event.dplayer.DPlayerEvent;
import io.github.dre2n.dungeonsxl.player.DGamePlayer;

/**
 * @author Daniel Saukel
 */
public abstract class DGamePlayerEvent extends DPlayerEvent {

    public DGamePlayerEvent(DGamePlayer dPlayer) {
        super(dPlayer);
    }

    @Override
    public DGamePlayer getDPlayer() {
        return (DGamePlayer) dPlayer;
    }

    public void setDPlayer(DGamePlayer dPlayer) {
        this.dPlayer = dPlayer;
    }

}
