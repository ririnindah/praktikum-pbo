
/*
Titik.java 23/09/11
Penulis   : Ririn Indah Cahyani - 24060121130069
Deskripsi : kelas yang berisi program Titik yang mengeksekusi beberapa kosntruktor dan method
*/


class Titik {
	double absis;
	double ordinat;
	static int counterTitik;

	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;

	}

	double getAbsis(){
		return absis;
	}

	double getOrdinat(){
		return ordinat;
	}

	void setAbsis(double a){
		absis = a;
	}

	void setOrdinat(double o){
		ordinat = o;
	}

	static int getCounterTitik(){
		return counterTitik;
	}

}
