package model;

import java.util.LinkedList;

public class Persona extends LinkedList {
String DNI,nom,cognom1, cognom2;
int edat, index;
public int getIndex() {
	return index;
}
public void setIndex(int index) {
	this.index = index;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getCognom1() {
	return cognom1;
}
public void setCognom1(String cognom1) {
	this.cognom1 = cognom1;
}
public String getCognom2() {
	return cognom2;
}
public void setCognom2(String cognom2) {
	this.cognom2 = cognom2;
}
public String getDNI() {
	return DNI;
}
public void setDNI(String DNI) {
	this.DNI = DNI;
}
public int getEdat() {
	return edat;
}
public void setEdat(int edat) {
	this.edat = edat;
}

}
