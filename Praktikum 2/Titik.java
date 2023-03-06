/*
Titik.java 23/03/01
Penulis   : Ririn Indah Cahyani - 24060121130069
Lab 	  : Praktikum PBO B1
Deskripsi : kelas yang berisi program Titik yang mengeksekusi beberapa kosntruktor dan method
*/

class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik;

	public Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;

	}

	public double getAbsis(){
		return absis;
	}

	public double getOrdinat(){
		return ordinat;
	}

	public void setAbsis(double a){
		absis = a;
	}

	public void setOrdinat(double o){
		ordinat = o;
	}

	public static int getCounterTitik(){
		return counterTitik;
	}

}
