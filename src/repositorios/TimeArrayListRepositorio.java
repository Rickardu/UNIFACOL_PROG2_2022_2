package repositorios;

import java.util.ArrayList;

import entidades.Time;
import interfaces.IBasicoRepositorio;
import interfaces.ITimeRepositorio;

public class TimeArrayListRepositorio implements IBasicoRepositorio<Time>,ITimeRepositorio {
	public ArrayList<Time> times = new  ArrayList<Time>();
	

}
