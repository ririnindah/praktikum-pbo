class OperasiTitik {
	//private OprasiTitik(){} //gabisa diakses new OperasiTitik
	//cara panggilnya OperasiTitik.refleksiSumbux(t1);
	
	//LATIHAN
	public void refleksiSumbuX(Titik titik) {
		Double ordinat = titik.getOrdinat(); 
		titik.setOrdinat(-1*ordinat);
	}

	public void refleksiSumbuY(Titik titik) {
		Double absis = titik.getAbsis(); 
		titik.setAbsis(-1*absis);
	}


	//TUGAS
	public Titik refleksiX(Titik titik){
		Double ordinat = titik.getOrdinat();
		titik.setOrdinat(-1*ordinat);	
		return titik;
	}		

	public Titik refleksiY(Titik titik){
		Double absis = titik.getAbsis();
		titik.setAbsis(-1*absis);	
		return titik;
	}

}

