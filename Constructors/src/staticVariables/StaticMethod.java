package staticVariables;

import staticVariables.StaticMethod.player;

public class StaticMethod {
	
	
	class player{
		
		static int playerCount = 0;
		private static String name;
		
		
		public static void player(String n) {
			
			name = n;
			playerCount++;
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(player.playerCount);
		
		player.player("Muhassan");
		System.out.println(player.name);
		System.out.println(player.playerCount);

		player.player("Rashid");
		System.out.println(player.name);	
		System.out.println(player.playerCount);
	}


}
