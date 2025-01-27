package building;

import map.Player;

public class Theatre extends Building {
    // Das Gebäude dient der Unterhaltung des Volkes

    // gibt Motivationsboost durch Unterhaltung
    protected double motivationboost;

    public Theatre(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.buildtime = 2;
        this.healthpoints = 2;
        this.buildingrange = 2;
        this.motivationboost = 1.1;
    }

    public boolean buildable(Player player) {
        // Wood und Stone vom player
        int wood = player.getWood();
        int stone = player.getStone();

        if (wood >= 1 && stone >= 1) {
            // Kosten des Bauens: 1 wood, 1 Stone
            player.setWood(wood - 1);
            player.setStone(stone - 1);
            // genug ressourcen, deswegen buildable true
            return true;
        }
        // bei false, soll das Gebäude nicht gebaut werden
        return false;
    }

    //alle 3 oder so, Runden kann für ein Holz und ein Essen Theater gespielt werden -> Motivationsboost
    int zaehl = 0;

    public void theatreplay(Player player) {
        if (zaehl == 0) {
            if (player.getWood() >= 1 && player.getFood() >= 1) {
                // Kosten des theaters: 1 wood, 1 food
                player.setWood(player.getWood() - 1);
                player.setStone(player.getFood() - 1);
                player.setMotivation(player.getMotivation() * this.motivationboost);
            }
        }
        zaehl++;
        if (zaehl == 3) {
            zaehl = 0;
        }
    }

}
