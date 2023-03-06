public class MOperasiTitik{
	public static void main(String[] args) {

		//LATIHAN
		Titik t1;

		OperasiTitik op = new OperasiTitik();

		t1 = new Titik();

		t1.setAbsis(4.0);
		t1.setOrdinat(4.0);	
	
		System.out.println("\nLATIHAN");	
		System.out.println("titik("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		op.refleksiSumbuX(t1);
		System.out.println("titik setelah refleksi sb X: titik("+t1.getAbsis() +", "+t1.getOrdinat()+")");	
		op.refleksiSumbuY(t1);
		System.out.println("titik setelah refleksi sb Y: titik("+t1.getAbsis() +", "+t1.getOrdinat()+")");



		//TUGAS
		Titik t2, tHasil;

		t2 = new Titik();
		tHasil = new Titik();	

		t2.setAbsis(7.0);
		t2.setOrdinat(8.0);

		System.out.println("\n\nTUGAS");
		System.out.println("titik("+t2.getAbsis()+", "+t2.getOrdinat()+")");
		tHasil = op.refleksiX(t2);
		System.out.println("titik setelah refleksi sb X: titik("+tHasil.getAbsis() +", "+tHasil.getOrdinat()+")");		
		tHasil = op.refleksiY(t2);
		System.out.println("titik setelah refleksi sb Y: titik("+tHasil.getAbsis() +", "+tHasil.getOrdinat()+")");
	
	}

}