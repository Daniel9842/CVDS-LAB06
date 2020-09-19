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
	private float promedio;
	private float desviaviacion;
	private float varianza;
	private float moda;
	public primeFaces(){
	}
	public double calculateMean(ArrayList<Float> nums){
		float resultado=0;
		for(int x=0;x<nums.size();x++){
			resultado+=nums.get(x);
		}
		resultado = resultado/nums.size();
		promedio = resultado;
		return resultado;
		
	}
	public double calculateStandardDeviation(ArrayList<Float> nums){
		float resultado=0;
		calculateMean(nums);
		for(int x=0;x<nums.size();x++){
			resultado+=(num.get(x)-promedio)*(num.get(x)-promedio);
		}
		resultado= Math.sqrt(resultado/num.size());
		desviacion= resultado;
		return resultado;
	}
	public double calculateVariance(ArrayList<Float> nums){
		float resultado=0;
		calculateMean(nums);
		for(int x=0;x<nums.size();x++){
			resultado+=(num.get(x)-promedio)*(num.get(x)-promedio);
		}
		resultado= resultado/num.size();
		varianza = resultado;
		return resultado;
	}
	public double calculateMode(ArrayList<Float> nums){
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
		promedio=0;
		desviaviacion=0;
		varianza=0;
		moda=0;
	}
	public float getPromedio(){
		return promedio;
	}
	public float getDesviacion(){
		return desvianza;
	}
	public float getVarianza(){
		return varianza;
	}
	public float getModa(){
		return moda;
	}
}