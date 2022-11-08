
public class main {

	public static void main(String[] args) {
		
		
				String ortaMetin = "İlginizi Çekebilir";
				String altMetin = "Vade Süresi";
				
				System.out.println(ortaMetin);
			
				
				int vade = 12;
				
				
				double dolarDun = 18.10;
				double dolarBugun = 18.10;
				
				
				boolean dolarDustuMu = false;
				
				
				String okYonu = "";
				
				
				if(dolarBugun < dolarDun) 
				{
					okYonu = "down.svg";
					
				}
				else if(dolarBugun > dolarDun) 
				{
					okYonu = "up.svg";
				}
				else 
				{
					okYonu = "equal.svg";
				}
				
				
				System.out.println(okYonu);
				
				
				String[] krediler = {"Hızlı Kredi", "Kamu Kredisi", "Mutlu Emekli","Çiftçi Kredisi"};
				
				
				for (int i = 0; i < krediler.length; i++) 
				{
					System.out.println(krediler[i]);
				}

	}

}
