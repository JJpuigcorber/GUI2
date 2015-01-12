package controlador;
import model.Persona;
import vista.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.View;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;



public class controlador {
	private Persona model;
	private Vista vista;
	private ActionListener actionListener;

	
public controlador(Persona model, Vista Vista){
    this.model = model;
    this.vista = Vista;
}
public void controlar() throws Exception{
	CvS();
	contarCvS();
	vista.getButtonNou().addActionListener(e -> nou());
	vista.getButtonEditar().addActionListener(e -> editar());
	vista.getButtonEsborrar().addActionListener(e -> esborrar());
	vista.getButtonAnterior().addActionListener(e -> anterior());
	vista.getButtonNext().addActionListener(e -> next());
	vista.getButtonPrimer().addActionListener(e -> primer());
	vista.getButtonLast().addActionListener(e -> last());
	vista.getButtonSave().addActionListener(e -> save());
	vista.getButtonCancel().addActionListener(e -> cancel());
	
}

private void contarCvS() throws FileNotFoundException {
	String contactes= "C:/Users/JJ/workspace/GUI2/src/model/Contactes.csv";
	File Arxiu = new File(contactes);
	try{
		
		Persona p = new Persona();
		List Llista = new ArrayList(p);
		Scanner inputstream = new Scanner(Arxiu);
		String data = inputstream.next();
		String []array = data.split(";");
		for(int y=0; y < array.length; y++){
			Llista.add(array[y]);
			//System.out.println(array[y]);
		}
		for(int x=0; x < Llista.size(); x++){
			//System.out.println(Llista.get(x));
			int INDEX = Integer.parseInt((String)Llista.get(5));
		
		//System.out.println(INDEX);
		vista.getLbLabelLlistat().setText("Registre " + INDEX + " de " + 0 );
		}
		

	}catch(FileNotFoundException e){
		e.printStackTrace();
	}
	
}
private void CvS() throws FileNotFoundException{
	
	String contactes= "C:/Users/JJ/workspace/GUI2/src/model/Contactes.csv";
	File Arxiu = new File(contactes);
		try{
			Persona p = new Persona();
			List Llista = new ArrayList(p);	
			Scanner inputstream = new Scanner(Arxiu);
			String data = inputstream.next();
			String []array = data.split(";");
			for(int y=0; y < array.length; y++){
				Llista.add(array[y]);
				//System.out.println(Llista);
			}
			for(int x=0; x < Llista.size(); x++){
				//System.out.println(Llista.get(x));
				String DNI = (String) Llista.get(0);
				String NOM = (String) Llista.get(1);
				String COGNOM = (String) Llista.get(2);
				String COGNOM2 = (String) Llista.get(3);
				int EDAT =  Integer.parseInt((String)Llista.get(4)); 
				int INDEX = Integer.parseInt((String)Llista.get(5));
				
				p.setDNI(DNI);
				p.setNom(NOM);
				p.setCognom1(COGNOM);
				p.setCognom2(COGNOM2);
				p.setEdat(EDAT);
				
				vista.getTextFieldDNI().setText(p.getDNI());
				vista.getTextFieldNom().setText(p.getNom());
				vista.getTextFieldCognom1().setText(p.getCognom1());
				vista.getTextFieldCognom2().setText(p.getCognom2());
				vista.getTextFieldEdat().setText(p.getEdat()+"");
			}
			inputstream.close();
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}	
}
private void cancel()  {
			boolean f = false;
			boolean t = true;
			vista.getButtonNou().setEnabled(t);
			vista.getButtonEditar().setEnabled(t);
			vista.getButtonEsborrar().setEnabled(t);
			vista.getButtonPrimer().setEnabled(t);
			vista.getButtonLast().setEnabled(t);
			vista.getButtonAnterior().setEnabled(t);
			vista.getButtonNext().setEnabled(t);
			vista.getButtonSave().setEnabled(f);
			vista.getButtonCancel().setEnabled(f);
			vista.getTextFieldDNI().setEditable(f);
			vista.getTextFieldNom().setEditable(f);
			vista.getTextFieldCognom1().setEditable(f);
			vista.getTextFieldCognom2().setEditable(f);
			vista.getTextFieldEdat().setEditable(f);
			try {
				CvS();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				contarCvS();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
private void save() {
	int GuardarOK =JOptionPane.showConfirmDialog(vista, "Es guardarà el registre, segur?", "ATENCIÓ!", 0);
	if (GuardarOK == JOptionPane.OK_OPTION){
		//Metode guardar
		if(vista.getTextFieldEdat().toString().equals("")){
			JOptionPane.showMessageDialog(vista, "Els camps no poden estar en blanc");
		}	
		else{
			Persona p = new Persona();
			List<String> Persones = new ArrayList<String>();
			String DNI = vista.getTextFieldDNI().toString();
			String NOM = vista.getTextFieldNom().toString();
			String COGNOM = vista.getTextFieldCognom1().toString();
			String COGNOM2 = vista.getTextFieldCognom2().toString();
			String EDAT =  vista.getTextFieldEdat().toString(); 
			int INDEX = Integer.parseInt(p.getEdat() + "" + 1);
			//Persones.add(DNI + " ; " + NOM + " ; " + COGNOM + " ; " + COGNOM2 + " ; " + EDAT + " ; " + INDEX);
			String contactes= "C:/Users/JJ/workspace/GUI2/src/model/Contactes.csv";
			File Arxiu = new File(contactes);
			try {
				FileWriter escriure = new FileWriter(Arxiu,true);
				escriure.write('\n'+ DNI + " ; " + NOM + " ; " + COGNOM + " ; " + COGNOM2 + " ; " + EDAT + " ; " + INDEX);
				 
				escriure.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
private void last() {
	// TODO Auto-generated method stub
	
}
private void primer() {
	// TODO Auto-generated method stub
	
}
private void next() {
	String contactes= "C:/Users/JJ/workspace/GUI2/src/model/Contactes.csv";
	File Arxiu = new File(contactes);
		try{
			Persona p = new Persona();
			List Llista = new ArrayList(p);	
			Scanner inputstream = new Scanner(Arxiu);
			String data = inputstream.next();
			String []array = data.split(";");
			for(int y = 0;y < array.length; y++){
				Llista.add(array[y]);
			}
			for(int x = 0; x < Llista.size(); x++){
				String DNI = (String) Llista.get(0);
				String NOM = (String) Llista.get(1);
				String COGNOM = (String) Llista.get(2);
				String COGNOM2 = (String) Llista.get(3);
				int EDAT =  Integer.parseInt((String)Llista.get(4)); 
				int INDEX = Integer.parseInt((String)Llista.get(5));
				
				p.setDNI(DNI);
				p.setNom(NOM);
				p.setCognom1(COGNOM);
				p.setCognom2(COGNOM2);
				p.setEdat(EDAT);
				Plusindex(p,INDEX);
				
				vista.getTextFieldDNI().setText(p.getDNI());
				vista.getTextFieldNom().setText(p.getNom());
				vista.getTextFieldCognom1().setText(p.getCognom1());
				vista.getTextFieldCognom2().setText(p.getCognom2());
				vista.getTextFieldEdat().setText(p.getEdat()+"");
			}
			inputstream.close();
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}	
}
private void anterior() {
	// TODO Auto-generated method stub
	
}
private void esborrar() {
	int EsborrarOK=JOptionPane.showConfirmDialog(vista, "Segur que vols esborrar?", "ATENCIÓ!", 0);
	if (EsborrarOK == JOptionPane.OK_OPTION){
		//Metode guardar
	}	       
	
}
private void editar() {
			vista.getLbLabelLlistat().setText("Editant Contacte...");
			boolean f = false;
			boolean t = true;
			vista.getButtonNou().setEnabled(f);
			vista.getButtonEditar().setEnabled(f);
			vista.getButtonEsborrar().setEnabled(f);
			vista.getButtonPrimer().setEnabled(f);
			vista.getButtonLast().setEnabled(f);
			vista.getButtonAnterior().setEnabled(f);
			vista.getButtonNext().setEnabled(f);
			vista.getButtonSave().setEnabled(t);
			vista.getButtonCancel().setEnabled(t);
			vista.getTextFieldDNI().setEditable(t);
			vista.getTextFieldNom().setEditable(t);
			vista.getTextFieldCognom1().setEditable(t);
			vista.getTextFieldCognom2().setEditable(t);
			vista.getTextFieldEdat().setEditable(t);

}
private void nou() {
			vista.getLbLabelLlistat().setText("Creant Contacte...");
			boolean f = false;
			boolean t = true;
			vista.getButtonNou().setEnabled(f);
			vista.getButtonEditar().setEnabled(f);
			vista.getButtonEsborrar().setEnabled(f);
			vista.getButtonPrimer().setEnabled(f);
			vista.getButtonLast().setEnabled(f);
			vista.getButtonAnterior().setEnabled(f);
			vista.getButtonNext().setEnabled(f);
			vista.getButtonSave().setEnabled(t);
			vista.getButtonCancel().setEnabled(t);
			
			vista.getButtonCancel().setEnabled(t);
			vista.getTextFieldDNI().setEditable(t);
			vista.getTextFieldNom().setEditable(t);
			vista.getTextFieldCognom1().setEditable(t);
			vista.getTextFieldCognom2().setEditable(t);
			vista.getTextFieldEdat().setEditable(t);
			
			vista.getTextFieldDNI().setText("");
			vista.getTextFieldNom().setText("");
			vista.getTextFieldCognom1().setText("");
			vista.getTextFieldCognom2().setText("");
			vista.getTextFieldEdat().setText("");	
}


private int Plusindex(Persona p, int Index_antic){
	int Index = p.getIndex();
	int Index_nou = Index + 1;
	return Index_nou;
}
}



   
    
  
                          