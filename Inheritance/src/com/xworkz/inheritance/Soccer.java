package com.xworkz.inheritance;

public class Soccer {
    public void kick(Player player){
        player.followDiet();
        player.rest();
        player.playMatch();
        player.train();
        player.travel();

        if(player instanceof  Cricketer){
            Cricketer cricketer=(Cricketer) player;
            cricketer.hit();
        }
    }
}
