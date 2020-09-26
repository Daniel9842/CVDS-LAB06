package edu.eci.cvds.faces;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;
import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;


@ManagedBean(name = "calculadoraBean")
@ApplicationScoped
public class faces{
	private ArrayList<Double> nums;
	private double mean;
	private double standard;
	private double variance;
	private double mode;
	public String datos;
	
	public faces(){
		nums = new ArrayList<Double>();
		mean = 0;
		standard = 0;
		variance = 0;
		mode = 0;
		datos = "";
	}
	
	public double getMean(){
		return mean;
	}
	public double getStandard(){
		return standard;
	}
	public double getVariance(){
		return variance;
	}
	public double getMode(){
		return mode;
	}
	public String getDatos(){
		return datos;
	}
	public ArrayList<Double> getNums(){
		return nums;
	}
	
	public void setNums(ArrayList<Double> newNums){
		nums = newNums;
	}
	public void setDatos(String newDatos){
		this.datos = newDatos;
	}

	public ArrayList<Double> recibirLista(){
		int cont = 0;
		String parcial = "";
		while (cont < datos.length()){
			if(datos.charAt(cont) != ';') {
				parcial +=  datos.charAt(cont);
			}else {
				if(cont == datos.length()-1) {
					parcial +=  datos.charAt(cont);
				}
				nums.add(Double.parseDouble(parcial));
				parcial = "";
			}
			cont+=1;
        }
		return nums;
	}

	
	public double calculateMean(){
		recibirLista();
		double resultado=0;
		for(int x=0;x<nums.size();x++){
			resultado+=nums.get(x);
		}
		resultado = resultado/nums.size();
		this.mean = resultado;
		resultado = 0;
		return mean;
	}
	
	public double calculateStandardDeviation(){
		recibirLista();
		double resultado=0;
		calculateMean();
		for(int x=0;x<nums.size();x++){
			resultado+=(nums.get(x)-mean)*(nums.get(x)-mean);
		}
		resultado= Math.sqrt(resultado/nums.size());
		this.standard= resultado;
		return resultado;
	}
	
	public double calculateVariance(){
		recibirLista();
		double resultado=0;
		calculateMean();
		for(int x=0;x<nums.size();x++){
			resultado+=(nums.get(x)-mean)*(nums.get(x)-mean);
		}
		resultado= resultado/nums.size();
		this.variance = resultado;
		return resultado;
	}
	
	public double calculateMode(){
		recibirLista();
		double numMode=0;
		int contGlobal=-1;
		for(int x=0;x<nums.size();x++){
			int cont=0;
			double numActual=nums.get(x);
			for(int y=x;y<nums.size();y++){
				if(numActual==nums.get(y)){
					cont+=1;
				}
			}
			if(cont>contGlobal){
				contGlobal = cont;
				numMode = numActual;
			}
		}
		this.mode = numMode;
		return numMode;
	}
	public void restart(){
		
		nums = new ArrayList<Double>();
		mode = 0;
		standard = 0;
		mean = 0;
		variance = 0;
		datos = "";
	}
	
}