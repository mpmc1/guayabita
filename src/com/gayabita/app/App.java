package com.gayabita.app;


import com.gayabita.dominio.Player;
import com.gayabita.dominio.Round;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class App {
        private static Round round = new Round();
        private static Image guavaIconSized = new ImageIcon(Objects.requireNonNull(App.class.getResource("../assets/guayabaIcon.png"))).getImage()
                .getScaledInstance(120,120, Image.SCALE_SMOOTH);
    public static void main(String[] args) {
        Object[] initialDialogButtons = {"Sí", "No"};
        ImageIcon guavaIcon = new ImageIcon(guavaIconSized);
        int responseInitialDialog = JOptionPane.showOptionDialog(null, "Bienvenido al juego de la guayabita", "La guayabita",
                JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE, guavaIcon,initialDialogButtons, initialDialogButtons[0]);
        if(responseInitialDialog == 0){
            String resNumberOfPlayersDialog = openInputDialog("¿Cuántas perosnas jugarán?");
            if(resNumberOfPlayersDialog != null){
                int nPlayers = Integer.parseInt(resNumberOfPlayersDialog);
                for (int i =0; i<nPlayers;i++){
                    Boolean gotData = getNameAndBetOfEachPlayer(i);
                    if (Boolean.FALSE.equals(gotData)){
                        break;
                    }
                }
                round.getPlayers().forEach(player->{
                    System.out.println(player.getName());
                    System.out.println(player.getBet());
                    System.out.println();
                });
            }
        }
    }
    public static Boolean getNameAndBetOfEachPlayer(int nPlayer){
        String nameOfPlayer = openInputDialog("Ingrese el nombre del jugador"+(nPlayer+1));
        if(nameOfPlayer!=null ){
            String moneyToBet = openInputDialog("¿Cuánto va a apostar el jugador"+(nPlayer+1)+"?");
            if(moneyToBet!=null){
                round.addPlayer(new Player(nameOfPlayer,Float.parseFloat(moneyToBet)));
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    public static String openInputDialog(String message){
        Object[] buttons = {"Continuar", "Salir"};
        JPanel panel = new JPanel();
        panel.add(new JLabel(message));
        JTextField textField = new JTextField(2);
        textField.setMaximumSize(new Dimension(300,30));
        GridLayout layout = new GridLayout();
        layout.setColumns(1);
        layout.setRows(2);
        panel.setLayout(layout);
        panel.add(textField);
        int dialogResponse = JOptionPane.showOptionDialog(null, panel,"La guayabita"
                ,JOptionPane.YES_NO_OPTION,JOptionPane.PLAIN_MESSAGE,new ImageIcon(guavaIconSized),buttons
                ,buttons[0]);
        if(dialogResponse==0){
            return textField.getText();
        }
        return null;
    }
}
