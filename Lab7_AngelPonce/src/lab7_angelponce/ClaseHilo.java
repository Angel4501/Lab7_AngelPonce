package lab7_angelponce;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class ClaseHilo extends Thread{
    
    private JProgressBar progbar;
    private boolean avanzar = true;
    private boolean avanzar1 = true;
    private int p = 1;
    private String s;
    private double gpk; //gasolina que gasta por kilometro
    private double velocidad; //de la nave
    private double distancia; //entre el planeta y la tierra
    private int gasolina; //cantidad actual de gasolina en el tanque
    private int n=0;

    public ClaseHilo(JProgressBar progbar, double gpk, double velocidad,double distancia, int gasolina) {
        this.progbar = progbar;
        this.gpk=gpk;
        this.velocidad=velocidad;
        this.distancia=distancia;
        this.gasolina=gasolina;
    }

    public ClaseHilo() {
    }
    
    public JProgressBar getProgbar() {
        return progbar;
    }

    public void setProgbar(JProgressBar progbar) {
        this.progbar = progbar;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isAvanzar1() {
        return avanzar1;
    }

    public void setAvanzar1(boolean avanzar1) {
        this.avanzar1 = avanzar1;
    }

    @Override
    public void run() {
        while (avanzar) {
            if (avanzar1) {
                if (progbar.getValue() >= 0) {
                    try {
                        progbar.setValue(progbar.getMaximum() - p);
                        s = String.valueOf(progbar.getMaximum() - p);
                        progbar.setString(s + "%");
                        p++;
                    } catch (Exception e) {
                    }
                } 
            }
            try {
                
                Thread.sleep(50);
                if(p==101){
                    JOptionPane.showMessageDialog(null, "Llegó al planeta!");
                    avanzar=false;
                    p=1;
                }
            } catch (Exception e) {
            }
        }

    }
    
}
/*
while (avanzar) {
            if (avanzar1) {
                if (progbar.getValue() >= 0) {
                    try {
                        progbar.setValue(progbar.getValue() - n);
                        //int n=gasolina - ((int)(gpk*velocidad));
                        velocidad+=velocidad;
                        //s = String.valueOf(gasolina - ((int)(gpk*velocidad)));
                        //progbar.setString(s + "%");
                        //p++;
                    } catch (Exception e) {
                    }
                } 
            }
            try {
                
                Thread.sleep(50);
                if(velocidad>=distancia){
                    JOptionPane.showMessageDialog(null, "Llegó al planeta!");
                    avanzar=false;
                    //p=1;
                }
                if(gasolina<=0){
                    avanzar=false;
                    JOptionPane.showMessageDialog(null, "No llegó al planeta");
                }
            } catch (Exception e) {
            }
        }
*/
