package dentaku;

import java.util.Objects;

class KeyMap {
	 private String keyMap[] ={"q","w","e","a","s","d","z","x","c","v","b","r","t","y","f","g"," "};
	 private String keyValue[] ={"1","2","3","4","5","6","7","8","9","0",".","+","-","=","*","/"," "};
	 private int hit;
	 
	 // phuong thuc tra ve gia tri String 
	 public String value(String letter){
		 for(int i=0;i<keyMap.length;i++){
			 hit=i;
			 if(Objects.equals(letter, keyMap[i])){
				break;
			 }
		 }
		 return keyValue[hit];
	 };
	 public void printMap(){
		 for (int i = 0; i < keyMap.length; ++i) {
			System.out.print(keyMap[i]);
			System.out.print(":"+keyValue[i]+" ");
		}
		 System.out.println("");
	 }


}