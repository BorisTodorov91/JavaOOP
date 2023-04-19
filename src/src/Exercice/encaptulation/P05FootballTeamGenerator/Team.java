package Exercice.encaptulation.P05FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }
    public void addPlayer (Player player){
        this.players.add(player);
    }
    public void removePlayer(String playerForRemove){
        boolean isRemoved = players.removeIf(p -> p.getName().equals(playerForRemove));
        if(!isRemoved){
            String errorMessage = String.format("Player %s is not in %s team.", playerForRemove, this.name);
            throw new IllegalArgumentException(errorMessage);
        }
        this.players.remove(playerForRemove);
    }
    public double getRating (){
        return players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0);
    }

}
