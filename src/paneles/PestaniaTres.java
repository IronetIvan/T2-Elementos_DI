/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import componentes.TextFieldNumeros;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.event.KeyAdapter;

/**
 *
 * @author irone
 */
public class PestaniaTres extends JPanel implements ChangeListener, ActionListener, FocusListener {


    JTextField textoNormal, textoNormalDos;
    TextFieldNumeros textoNumeros, textoNumerosDos, textoNumerosTres;
    JButton bValidar;

    public PestaniaTres() {
        initGUI();
    }

    private void initGUI() {
        instancias();
        configurarPanel();
        acciones();
    }

    private void acciones() {
        bValidar.addActionListener(this);
        textoNormal.addFocusListener(this);
        textoNormalDos.addKeyListener(new ManejoKey());
        //textoNumerosTres.addMouseMotionListener();

    }

    private void configurarPanel() {
        this.add(textoNormal);
        this.add(textoNormalDos);
        this.add(textoNumeros);
        this.add(textoNumerosDos);
        this.add(textoNumerosTres);
        this.add(bValidar);
    }

    private void instancias() {

        textoNormal = new JTextField("Aviso", 20);
        textoNormalDos = new JTextField("", 20);
        textoNumeros = new TextFieldNumeros("Hint",20);
        textoNumerosDos = new TextFieldNumeros("123456",20);
        textoNumerosTres = new TextFieldNumeros("654321",20);
        bValidar = new JButton("Validar");
    }

    @Override
    public void stateChanged(ChangeEvent e) {


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bValidar) {
            if (textoNormal.getText().length() >= 10) {
                System.out.println(textoNormal.getText());
            } else {
                System.out.println("No se puede validar");
            }
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("foco ganado");
        if (textoNormal.getText().equals("Aviso")){
            textoNormal.setText("");
        }

    }
    @Override
    public void focusLost(FocusEvent e) {
        System.out.println("foco perdido");
        if (textoNormal.getText().length() == 0) {
            textoNormal.setText("Aviso");
        }
    }



    class ManejoKey extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            //super.keyPressed(e);
            //System.out.println("pressed");
            //System.out.println(e.getKeyChar());
            if (Character.isDigit(e.getKeyChar())){
                System.out.println("es digito");
            }else {
                e.consume();
                System.out.println("no es digito");
            }

        }
    }


}