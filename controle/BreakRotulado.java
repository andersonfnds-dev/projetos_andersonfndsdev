package controle;

public class BreakRotulado {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		externo: for(int i = 0; i < 3; i++) {
			interno: for (int j = 0; j < 3; j++) {
				
				if(j == 2) {
					break externo;
				}
				
				System.out.printf("[%d %d] ", i, j);
			}
			
			System.out.println();
		}
		    
		    System.out.println("Fim!");
	}

}
