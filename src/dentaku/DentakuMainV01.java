package dentaku;

import java.util.Objects;
import java.util.Scanner;

public class DentakuMainV01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		System.out.println("-----Hello-----");
		String inputKey;
		Scanner scanKey = new Scanner(System.in);
		KeyMap keyMap = new KeyMap();
		Key key = new Key();
		ComputeValues computeValues = new ComputeValues();
		ErrorCheck errorCheck = new ErrorCheck();
		for(;;){
			inputKey=scanKey.next();
			if (Objects.equals(inputKey,"on")) {
				System.out.println("*switch ON*");
				System.out.println("");
				keyMap.printMap();// in ra ban phim 

			for(;;){
				System.out.println("");// xg dong
				System.out.println("> ");
				inputKey=scanKey.next();// nhap so can tinh toan
				if (Objects.equals(inputKey,"off")) {
					break;
				}else if(Objects.equals(inputKey,"help")){//in ra huong dan
					keyMap.printMap();
					computeValues=key.getComputeValues();
					System.out.println("");
					System.out.println(computeValues.mem01);// in ra  gia tri bien 1
					System.out.println(computeValues.separationPresent); // in ra  gia tri bien can cong
							System.out.println(computeValues.mem02); // in ra bien 2

				}else if(Objects.equals(inputKey,"ac")) { // reset ham ve 0
					key=new Key();
					computeValues=key.getComputeValues();
					
					System.out.println(computeValues.mem01);
					System.out.println(computeValues.separationPresent);
							System.out.println(computeValues.mem02);
				} else {
					key.setKey(inputKey);
					computeValues=key.getComputeValues();
					if (errorCheck.run(computeValues.mem01)) {
						key=new Key();
					}else {

						System.out.println("");
						System.out.println(computeValues.mem01);
						System.out.println(computeValues.separationPresent);
								System.out.println(computeValues.mem02);
					}
				}
			}
			key=new Key();
			System.out.println("");
			System.out.println("*switch OFF*");
		} else if (Objects.equals(inputKey,"bye")){
			break;
		}
	}

	scanKey.close();
	System.out.println("----------bye----------- ");
}
		

	}

