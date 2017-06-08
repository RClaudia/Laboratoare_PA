package huffman;

import java.awt.*;
import java.awt.List;
import java.util.*;

public class Nod {
	
	String valoare;
	int frecventa;
	ArrayList<Boolean> code =new ArrayList<Boolean>();
	
	public Nod(String val, int freq)
	{
		valoare = val;
		frecventa = freq;
	}
	public String getValoare() {
		return valoare;
	}
	public void setValoare(String valoare) {
		this.valoare = valoare;
	}
	public int getFrecventa() {
		return frecventa;
	}
	public void setFrecventa(int frecventa) {
		this.frecventa = frecventa;
	}
	public ArrayList<Boolean> getCode() {
		return code;
	}
	public void setCode(ArrayList<Boolean> code) {
		this.code = code;
	}
	
	
	
	

}
