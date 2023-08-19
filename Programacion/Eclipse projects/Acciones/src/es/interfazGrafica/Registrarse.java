package es.interfazGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import es.BBDD.ConexionBBDD;
import es.negocio.Usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registrarse extends JFrame {

    public Registrarse() {
        setTitle("Interfaz de Usuario");
        setSize(360, 270);
        setLayout(null);

        JLabel labelNombre = new JLabel("Nombre:");
        labelNombre.setBounds(20, 30, 80, 20);
        JLabel labelApellidos = new JLabel("Apellidos:");
        labelApellidos.setBounds(20, 60, 80, 20);
        JLabel labelUsuario = new JLabel("Nombre de usuario:");
        labelUsuario.setBounds(20, 90, 150, 20);
        JLabel labelPassword = new JLabel("Contraseña: (+8 caracteres)");
        labelPassword.setBounds(20, 120, 180, 20);
        JLabel labelRepeatPassword = new JLabel("Repetir Contraseña:");
        labelRepeatPassword.setBounds(20, 150, 150, 20);

        JTextField textFieldNombre = new JTextField();
        textFieldNombre.setBounds(200, 30, 120, 20);
        JTextField textFieldApellidos = new JTextField();
        textFieldApellidos.setBounds(200, 60, 120, 20);
        JTextField textFieldUsuario = new JTextField();
        textFieldUsuario.setBounds(200, 90, 120, 20);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(200, 120, 120, 20);
        JPasswordField repeatPasswordField = new JPasswordField();
        repeatPasswordField.setBounds(200, 150, 120, 20);

        JButton buttonEnviar = new JButton("Enviar");
        buttonEnviar.setBounds(100, 190, 100, 30);

        buttonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = textFieldNombre.getText();
                String apellido = textFieldApellidos.getText();
                String usuario = textFieldUsuario.getText();
                String password = new String(passwordField.getPassword());
                String repeatPassword = new String(repeatPasswordField.getPassword());
                guardarDatos(nombre, apellido, usuario, password, repeatPassword);
            }
        });

        add(labelNombre);
        add(labelApellidos);
        add(labelUsuario);
        add(labelPassword);
        add(labelRepeatPassword);
        add(textFieldNombre);
        add(textFieldApellidos);
        add(textFieldUsuario);
        add(passwordField);
        add(repeatPasswordField);
        add(buttonEnviar);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Registrarse registrarse = new Registrarse();
        registrarse.setVisible(true);
    }

    public void guardarDatos(String nombre, String apellidos, String usuario, String password, String repeatPassword) {
        Boolean guardar = true;
        Usuario usuario1 = new Usuario(nombre, apellidos, usuario, password);
        if (nombre.length() < 3) {
            JOptionPane.showMessageDialog(null, "El nombre debe contener al menos 3 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            guardar = false;
        }
        if (apellidos.length() < 3) {
            JOptionPane.showMessageDialog(null, "Los apellidos deben contener al menos 3 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            guardar = false;
        }

        // TODO añadir antes que el nombreusuario contenga caracteres.
        if (usuario.length() >= 3) {
            if (!ConexionBBDD.esUsuarioNuevo(usuario1)) {
                JOptionPane.showMessageDialog(null, "La contraseña y la repetición de contraseña no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
                guardar = false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario debe contener al menos 3 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            guardar = false;
        }
        if (password.length() <= 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos 8 caracteres", "Error", JOptionPane.ERROR_MESSAGE);
            guardar = false;
        } else {
            if (!password.equals(repeatPassword)) {
                JOptionPane.showMessageDialog(null, "La contraseña no coincide.", "Error", JOptionPane.ERROR_MESSAGE);
                guardar = false;
            }
        }
        if (guardar) {
            JOptionPane.showMessageDialog(null, "Usuario creado exitosamente");
            ConexionBBDD.persistirDatos(usuario1);
        } else {
            System.out.println("Usuario no creado");
        }
    }
}