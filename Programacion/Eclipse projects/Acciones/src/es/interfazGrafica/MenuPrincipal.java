package es.interfazGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {

    public static void main(String[] args) {
        // Crear una instancia de JFrame
        JFrame frame = new JFrame("Programa de Gestión de Usuarios");
        frame.setSize(400, 200); // Establecer el tamaño de la ventana
        frame.setLayout(null); // Desactivar el administrador de diseño por defecto

        // Crear un texto de bienvenida
        JLabel labelBienvenida = new JLabel("Bienvenido al programa de gestión de usuarios");
        labelBienvenida.setBounds(50, 30, 300, 20);

        // Crear botón "Crear una cuenta"
        JButton buttonCrearCuenta = new JButton("Crear una cuenta");
        buttonCrearCuenta.setBounds(50, 70, 150, 30);

        // Crear botón "Acceder"
        JButton buttonAcceder = new JButton("Acceder");
        buttonAcceder.setBounds(200, 70, 100, 30);

        // Agregar ActionListener al botón "Crear una cuenta"
        buttonCrearCuenta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una instancia de la clase Registrarse y mostrarla
                Registrarse registrarse = new Registrarse();
                registrarse.setVisible(true);
                // Cerrar la ventana actual
                frame.dispose();
            }
        });

        // Agregar ActionListener al botón "Acceder"
        buttonAcceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes definir la acción que deseas realizar al hacer clic en el botón "Acceder"
                // Por ejemplo, abrir una nueva ventana o navegar a otra clase
                // En este caso, se muestra un mensaje en la consola
                System.out.println("Se ha hecho clic en el botón 'Acceder'");
                // A continuación, puedes crear una instancia de la clase a la que deseas navegar y mostrarla
                // por ejemplo: new AccederFrame();
            }
        });

        // Agregar el texto y los botones al JFrame
        frame.add(labelBienvenida);
        frame.add(buttonCrearCuenta);
        frame.add(buttonAcceder);

        // Establecer la operación por defecto al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}
