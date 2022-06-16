package Dungeon;

public class Dungeon implements IDungeon {

    private boolean isOpened = false;

    @Override
    public boolean open(Party party) {
       if(party.getPartyMembers().length < 3) {
           System.out.println("Вам нужно больше союзников!");
           isOpened = false;
       }
       else {
           System.out.println("Добро пожаловать, герои ! \n Да пребудет с вами сила !");
           isOpened = true;
       }
       return isOpened;
    }
}
