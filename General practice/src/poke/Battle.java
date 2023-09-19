package poke;

public class Battle {

	String winner = null;

	String doBattle(Pocketon poke1, Pocketon poke2) {

		if (poke1.type.equals("火")) {
			if (poke2.type.equals("火")) {

			} else if (poke2.type.equals("草")) {

				poke1.power *= 2;

			} else if (poke2.type.equals("地面")) {

			} else if (poke2.type.equals("水")) {

				poke2.power *= 2;
			}

		} else if (poke1.type.equals("草")) {
			if (poke2.type.equals("火")) {

				poke1.power *= 2;

			} else if (poke2.type.equals("草")) {

			} else if (poke2.type.equals("地面")) {

				poke2.power *= 2;

			} else if (poke2.type.equals("水")) {

			}

		} else if (poke1.type.equals("地面")) {
			if (poke2.type.equals("火")) {

			} else if (poke2.type.equals("草")) {

				poke1.power *= 2;

			} else if (poke2.type.equals("地面")) {

			} else if (poke2.type.equals("水")) {

				poke2.power *= 2;
			}

		} else if (poke1.type.equals("水")) {
			if (poke2.type.equals("火")) {

				poke1.power *= 2;

			} else if (poke2.type.equals("草")) {

			} else if (poke2.type.equals("地面")) {

				poke2.power *= 2;

			} else if (poke2.type.equals("水")) {

			}

		}

		if (poke1.power < poke2.power) {

			winner = poke2.name;
			System.out.println(winner + "の勝ち");

		} else if (poke2.power < poke1.power) {

			winner = poke1.name;
			System.out.println(winner + "の勝ち");

		} else {

			System.out.println("引き分け");

		}

		return winner;

	}

}