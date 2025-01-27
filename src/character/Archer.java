package character;

import gui.Animation;
import java.awt.Image;
import tools.MiscUtils;

public class Archer extends Fighter {

    public Archer(String playername, int x, int y) {
        super(playername);
        attackrange = 7;
        attackrating = 1;
        canattack = true;
        healthpoints = 2;
        movement = 3;
        
        animationen.put("idle", new Animation(MiscUtils.loadImages("src/gui/res/warrior1/idle"), 300));
        animationen.put("dead", new Animation(MiscUtils.loadImages("src/gui/res/warrior1/dead"), 1000));
        animationen.put("walk", new Animation(MiscUtils.loadImages("src/gui/res/warrior1/walk"), 300));
        
        // curAnimation setzen und starten
        curAnimation = animationen.get("idle");
        playAnimation("idle");

        super.xPosition = x;
        super.yPosition = y;
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void killed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    @Override
    public void blockedterrains() {
        this.getBlockedterrains().add("water");
    }
    
    @Override
    public void blockedterrainsattack() {
    }

}
