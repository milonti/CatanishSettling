public class GamePiece {
		public GamePiece(int player, int loc, int type) {
		this.player = player;
		this.location = loc;
		this.type = type;
	}

		public GamePiece() {
			// TODO Auto-generated constructor stub
		}

		/**
		 * road = 0
		 * settlement = 1
		 * city = 2
		 * thief = 3
		 */
		public int type;
		public int player;
		
		/**
		 * Road locations 0-71
		 * S/C locations 0-53
		 * Thief locations 0-18
		 */
		public int location;
	}