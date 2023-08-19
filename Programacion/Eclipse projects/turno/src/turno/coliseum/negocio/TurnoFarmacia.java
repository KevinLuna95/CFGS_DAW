package turno.coliseum.negocio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TurnoFarmacia {
    private JFrame frameControl;
    private JFrame frameTurno;
    private JFrame frameNuevoTurno;
    private JLabel label;
    private Turno turno;
    private int turnoActual;
    private PedirTurno pedirTurno;
    private boolean temporizadorActivo;

    public TurnoFarmacia() {
    	pedirTurno = new PedirTurno();
    	this.turno = new Turno();
        turnoActual = 0;
        
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
        	@Override  
        	public void run() {  
        		Date fechaActual = new Date();
        		if(pedirTurno.buscarTurno(turnoActual) != null) {
	        		System.out.println(pedirTurno.tiempoEsperaEsInferior(pedirTurno.buscarTurno(turnoActual+1).getSegundos(), fechaActual));
	        		System.out.println("working on");
        		}
        	};
        };
        
        // Ventana de control
        frameControl = new JFrame("Control");
        frameControl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameControl.setSize(300, 200);
        frameControl.setLayout(new BorderLayout());

        JButton botonSiguiente = new JButton("Siguiente Turno");
        botonSiguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                turnoActual++;
                if(turnoActual > turno.getNumeroTurno()) {
                    turnoActual--;
                    JOptionPane.showMessageDialog(frameControl, "No hay más turnos pendientes.");
                } else {
                	pedirTurno.cambiarEstado(turnoActual);
                    label.setText("Turno actual: " + turnoActual);
                }
            }
        });
        frameControl.add(botonSiguiente, BorderLayout.CENTER);
        frameControl.setVisible(true);

        // Ventana de nuevo turno
        frameNuevoTurno = new JFrame("Nuevo Turno");
        frameNuevoTurno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameNuevoTurno.setSize(300, 200);
        frameNuevoTurno.setLocation(300, 0);
        frameNuevoTurno.setLayout(new BorderLayout());

        JButton botonNuevo = new JButton("Solicitar Turno");
		
        botonNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	turno = pedirTurno.nuevoTurno();
                JOptionPane.showMessageDialog(frameNuevoTurno, "Turno " + turno.getNumeroTurno() + " registrado.");
                timer.schedule(timerTask, new Date(),1000);
            }
        });
        frameNuevoTurno.add(botonNuevo, BorderLayout.CENTER);
        frameNuevoTurno.setVisible(true);

        // Ventana de turno
        frameTurno = new JFrame("Turno");
        frameTurno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameTurno.setSize(300, 200);
        frameTurno.setLocation(300, 200);
        frameTurno.setLayout(new BorderLayout());

        label = new JLabel("Turno actual: 0", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        frameTurno.add(label, BorderLayout.CENTER);
        frameTurno.setVisible(true);
       
    }
    
    
}