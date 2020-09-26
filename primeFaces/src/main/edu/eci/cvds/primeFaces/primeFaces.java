package edu.eci.cvds.primeFaces;
import java.util.*;
import javax.faces.application.FacesMessage;
import javax.faces.bean.*;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.primefaces.PrimeFaces;

@ManagedBean(name = "calculadoraBean")
@ApplicationScoped
public class primeFaces{
	public String datos;
	private double promedio;
	private float desviacion;
	private float varianza;
	private float moda;
	private ArrayList<Double> nums;
	public primeFaces(){
		datos = "";
		moda = 0;
		desviacion= 0;
		varianza =0;
		promedio=0;
		nums = new ArrayList<Double>();
	}
	public void recibirLista(String numString){
		datos = numString;
		String parcial="";
		contInicial = 0;
		for(int i=0;i<datos.lentgh();i++){
			if(datos.charAt(i)==';'){
				parcial.substring(contInicial,i)
				nums.add(Float.parseFloat(parcial));
				contInicial = i+1;
			}
		}

	}
	public double calcularPromedio(){
		float resultado=0;
		for(int x=0;x<nums.size();x++){
			resultado+=nums.get(x);
		}
		resultado = resultado/nums.size();
		promedio = resultado;
		return resultado;
		
	}
	public double calcularDesviacion(){
		float resultado=0;
		calculateMean(nums);
		for(int x=0;x<nums.size();x++){
			resultado+=(nums.get(x)-promedio)*(nums.get(x)-promedio);
		}
		resultado= Math.sqrt(resultado/nums.size());
		desviacion= resultado;
		return resultado;
	}
	public double calcularVarianza(){
		float resultado=0;
		calculateMean(nums);
		for(int x=0;x<nums.size();x++){
			resultado+=(nums.get(x)-promedio)*(nums.get(x)-promedio);
		}
		resultado= resultado/nums.size();
		varianza = resultado;
		return resultado;
	}
	public double calculatarModa(){
		Arrays.sort(nums)
		float modaC,numActual=nums.get(0),resultado;
		int cont=0,contModa=0;
		for(int x=0;x<nums.size();x++){
			if(nums.get(x)!=numActual){
				if(cont>contModa){
					modaC = nums.get(i-1);
					contModa = cont;
				}
				cont = 0;
				numActual = nums.get(i);
				
			}else{
				cont+=1;
				
			}
			
		}
		resultados = modaC;
		moda = resultado;
		return resultado;
	}
	public void restart(){
		nums = new ArrayList<Double>();
		promedio=0;
		desviaviacion=0;
		varianza=0;
		moda=0;
	}
	public double getPromedio(){
		return promedio;
	}
	public float getDesviacion(){
		return desviacion;
	}
	public float getVarianza(){
		return varianza;
	}
	public float getModa(){
		return moda;
	}
	public String getDatos(){
		return datos;
	}
	public ArrayList<Float> getNums(){
		return nums;
	}
	
	
	public void setPromedio(double newPromedio){
		promedio = newPromedio;
	}
	public void setDesviacion(float newDesviacion){
		desviacion = newDesviacion;
	}
	public void setVarianza(float newVarianza){
		varianza = newVarianza;
	}
	public void setModa(float newModa){
		moda = newModa;
	}
	public void setDatos(float newDatos){
		datos = newDatos ;
	}
	public void setNums(String numString){
		recibirLista(numString);
	}
}