package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JLabel lblUsuario = new JLabel("Usuario:");
        JTextField txtUsuario = new JTextField(15);

        JLabel lblContrasena = new JLabel("Contraseña:");
        JPasswordField txtContrasena = new JPasswordField(15);

        JButton btnLogin = new JButton("Login");

        JLabel lblMensaje = new JLabel("");

        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(lblContrasena);
        frame.add(txtContrasena);
        frame.add(btnLogin);
        frame.add(lblMensaje);

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = txtUsuario.getText();
                String contrasena = new String(txtContrasena.getPassword());

                if ("PATRICIO".equals(usuario) && "PATRICIO123".equals(contrasena)) {
                    lblMensaje.setText("Acceso correcto");
                    lblMensaje.setForeground(Color.GREEN);
                } else {
                    lblMensaje.setText("Usuario o contraseña incorrectos");
                    lblMensaje.setForeground(Color.RED);
                }
            }
        });

        frame.setVisible(true);
    }
}
