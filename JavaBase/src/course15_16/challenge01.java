/*package course15_16;

import java.util.Random;
import java.util.Scanner;

public class challenge01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);

		int sai1 = 0;//サイコロ1
		int sai2 = 0;//サイコロ2
		int sai3 = 0;//サイコロ3

		int sai11 = 0;//サイコロ一桁目
		int sai22 = 0;//サイコロ二桁目
		int syoji = 0;//所持金

		int kake = 0;

		int kaitou = 0;

		System.out.println("所持金は10000円です");
		syoji = 10000;

		System.out.println("所持金が50000円を超えたらクリアです");
		System.out.println();//コンソールの改行

		while (syoji > 0 && syoji <= 50000) {

			while (true) {
				System.out.println();//コンソールの改行
				System.out.println("掛け金を入力してください");
				kake = stdIn.nextInt();

				if (syoji < kake || kake <= 0) {//入力した金額の判定
					System.out.println("所持金の範囲内で入力してください");
				} else {

					break;
				}
			}

			syoji = syoji - kake;

			Random Rand0bj = new Random();
			sai1 = Rand0bj.nextInt(7) + 1;
			sai11 = sai1 * 100;

			

			System.out.println("二つ目のサイコロを振る前なら掛け金の変更が可能です");
			System.out.println("掛け金を変更しますか");
			System.out.println("1:変更する　2:変更しない");
			kaitou = stdIn.nextInt();
			while (true) {
				if (kaitou == 1) {

					while (true) {
						System.out.println();//コンソールの改行
						System.out.println("掛け金を入力してください");
						kake = stdIn.nextInt();

						if (syoji < kake || kake <= 0) {//入力した金額の判定
							System.out.println("所持金の範囲内で入力してください");
						} else {

							break;
						}
					}

					break;
				} else if (kaitou == 2) {
					System.out.println("変更しません");

					break;
				} else {
					System.out.println("正しい番号で回答してください");
				}

			}
			
			sai2 = Rand0bj.nextInt(7) + 1;
			sai22 = sai2 * 10;
			
			
			System.out.println();
			System.out.println("三つ目のサイコロを振る前にドロップアウトが可能です");
			System.out.println("ドロップアウトした場合掛け金は引かれます");
			System.out.println("現在の出目は1:" + sai1 + "　2:" + sai2 + "です");
			System.out.println("ドロップアウトしますか");
			System.out.println("1:する　2:しない");

			kaitou = stdIn.nextInt();
			while (true) {
				if (kaitou == 1) {
					System.out.println("ドロップアウトします");
					System.out.println("所持金は" + syoji + "円です");

					break;
				} else if (kaitou == 2) {

					System.out.println("ドロップアウトしません");
					}
			
			

			sai3 = Rand0bj.nextInt(7) + 1;
			

			System.out.println();
			System.out.println("出目は" + sai1 + sai2 + sai3);

			switch (sai11 + sai22 + sai3) {

			case 111:
				System.out.println();//コンソールの改行
				System.out.println("ピンゾロ");
				syoji = syoji + kake * 6;
				System.out.println();//コンソールの改行
				System.out.println(syoji + "円");
				System.out.println();//コンソールの改行
				break;

			case 222:
			case 333:
			case 444:
			case 555:
			case 666:
				System.out.println();//コンソールの改行
				System.out.println("ゾロ目");
				syoji = syoji + kake * 4;
				System.out.println();//コンソールの改行
				System.out.println(syoji + "円");
				System.out.println();//コンソールの改行
				break;

			case 456:
			case 465:
			case 564:
			case 546:
			case 654:
			case 645:
				System.out.println();//コンソールの改行
				System.out.println("シゴロ");
				syoji = syoji + kake * 3;
				System.out.println();//コンソールの改行
				System.out.println(syoji + "円");
				System.out.println();//コンソールの改行
				break;

			case 112:
			case 113:
			case 114:
			case 115:
			case 116:
			case 221:
			case 223:
			case 224:
			case 225:
			case 226:
			case 331:
			case 332:
			case 334:
			case 335:
			case 336:
			case 441:
			case 442:
			case 443:
			case 445:
			case 446:
			case 551:
			case 552:
			case 553:
			case 554:
			case 556:
			case 661:
			case 662:
			case 663:
			case 664:
			case 665:
			case 121:
			case 131:
			case 141:
			case 151:
			case 161:
			case 212:
			case 232:
			case 242:
			case 252:
			case 262:
			case 313:
			case 323:
			case 343:
			case 353:
			case 363:
			case 414:
			case 424:
			case 434:
			case 454:
			case 464:
			case 515:
			case 525:
			case 535:
			case 545:
			case 565:
			case 616:
			case 626:
			case 636:
			case 646:
			case 656:
			case 211:
			case 311:
			case 411:
			case 511:
			case 611:
			case 122:
			case 322:
			case 422:
			case 522:
			case 622:
			case 133:
			case 233:
			case 433:
			case 533:
			case 633:
			case 144:
			case 244:
			case 344:
			case 544:
			case 644:
			case 155:
			case 255:
			case 355:
			case 455:
			case 655:
			case 166:
			case 266:
			case 366:
			case 466:
			case 566:
			case 117:
			case 227:
			case 337:
			case 447:
			case 557:
			case 667:
			case 171:
			case 272:
			case 373:
			case 474:
			case 575:
			case 676:
			case 711:
			case 722:
			case 733:
			case 744:
			case 755:
			case 766:

				System.out.println();//コンソールの改行
				System.out.println("通常の目");
				syoji = syoji + kake;
				System.out.println();//コンソールの改行
				System.out.println(syoji + "円");
				System.out.println();//コンソールの改行
				break;

			case 771:
			case 772:
			case 773:
			case 774:
			case 775:
			case 776:
			case 717:
			case 727:
			case 737:
			case 747:
			case 757:
			case 767:
			case 177:
			case 277:
			case 377:
			case 477:
			case 577:
			case 677:
				System.out.println();//コンソールの改行
				System.out.println("ションベン");
				System.out.println();//コンソールの改行
				System.out.println(syoji + "円");
				System.out.println();//コンソールの改行
				break;

			case 123:
			case 132:
			case 213:
			case 231:
			case 312:
			case 321:

				System.out.println();//コンソールの改行
				System.out.println("ヒフミ");
				syoji = syoji - kake;
				System.out.println();//コンソールの改行
				System.out.println(syoji + "円");
				System.out.println();//コンソールの改行
				break;

			default:
				System.out.println();//コンソールの改行
				System.out.println("役なし");
				System.out.println();//コンソールの改行
				System.out.println(syoji + "円");
				System.out.println();//コンソールの改行
				break;

			}

		}
		if (syoji > 0) {
			System.out.println();//コンソールの改行
			System.out.println("結果は" + syoji + "円");
			System.out.println("1050年地下行き");

		} else if (syoji < 50000) {
			System.out.println();//コンソールの改行
			System.out.println("結果は" + syoji + "円");
			System.out.println("やったね1050年地下行き✌^^✌");
		}
		stdIn.close();
	}

}*/