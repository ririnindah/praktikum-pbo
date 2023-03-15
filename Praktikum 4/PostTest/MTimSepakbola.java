/*
Nama : Ririn Indah Cahyani
NIM : 24060121130069
LAB B1
*/


class MTimSepakbola {
  public static void main(String[] args) {
    // TODO: Make an instance called 'liverpool' -> use constructor which you have made before
TimSepakbola liverpool = new TimSepakbola("Liverpool");
    
    // TODO: Make an instance called 'manchesterUnited' -> use constructor which you have made before
TimSepakbola manchasterUnited = new TimSepakbola("Manchaster United");

    // TODO: call startTandingBola()
    startTandiingBola();

		// Assume that liverpool wins against manchesterUnited 7 - 0
    for (int i = 0; i < 7; i++) {
  		liverpool.goal();

			// TODO: Replace [SKOR LIVERPOOL] and [SKOR MANCHESTERUNITED] with the correct METHOD
			// Code below should produce the output "Skor sementara: Liverpool 7 - 0 Manchester United"
			System.out.println("Skor sementara: " + liverpool.nama + " " + liverpool.getSkor() + " - " + manchasterUnited.getSkor() + " " + manchesterUnited.nama);
    }

		// TODO: call endTandingBola()
		
  }
}

/* 
Expected output:

Pertandingan antara Liverpool dan Manchester United dimulai!

Skor sementara: Liverpool 1 - 0 Manchester United
Skor sementara: Liverpool 2 - 0 Manchester United
Skor sementara: Liverpool 3 - 0 Manchester United
Skor sementara: Liverpool 4 - 0 Manchester United
Skor sementara: Liverpool 5 - 0 Manchester United
Skor sementara: Liverpool 6 - 0 Manchester United
Skor sementara: Liverpool 7 - 0 Manchester United

Pertandingan antara Manchester United dan Liverpool selesai!
*/
